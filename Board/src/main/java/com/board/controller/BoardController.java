package com.board.controller;

import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.board.dao.BoardVO;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Inject
	BoardService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		model.addAttribute("list", service.list());
	}
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void getWrite() throws Exception {

	}
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		service.write(vo);
		return "redirect:/board/list";
	} 
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getView(@RequestParam("tNo") Long tNo, Model model) throws Exception {
		BoardVO vo = service.view(tNo);
		model.addAttribute("view", vo);
	}
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String postCheck(@RequestParam("tNo") Long tNo, @RequestParam("tPassword") String tPassword, Model model) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tNo", tNo);
		map.put("tPassword", tPassword);
		int a = service.check(map);
		BoardVO vo = service.view(tNo);
		if (a == 1) {
			model.addAttribute("view", vo);
			return "/board/modify";
		}else {
			return "redirect:/board/view?tNo=" + tNo;
		}
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String postModify(BoardVO vo) throws Exception {
		service.modify(vo);
		return "redirect:/board/view?tNo=" + vo.gettNo();
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDelete(@RequestParam("tNo") Long tNo, @RequestParam("tPassword") String tPassword) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tNo", tNo);
		map.put("tPassword", tPassword);
		int a = service.check(map);
		
		if (a == 1) {
			service.delete(tNo);
			return "redirect:/board/list";
		}else {
			return "redirect:/board/view?tNo=" + tNo;
		}
		
	}
}