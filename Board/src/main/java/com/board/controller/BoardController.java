package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.dao.BoardVO;
import com.board.service.BoardService;

@Controller
public class BoardController {

	@Inject
	private BoardService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		System.out.println("control-list-get");

		List<BoardVO> list = null;
		list = service.list();
		model.addAttribute("list", list);
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void getWrite() throws Exception {
		System.out.println("control-write-get");

	}

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		System.out.println("control-write-post");
		
		service.insert(vo);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/detail", method = RequestMethod.GET)
	public void getDetail() throws Exception{
		System.out.println("control-detail-get");
		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void getUpdate(@RequestParam("tNo") int tNo, Model model) throws Exception {

		BoardVO vo = service.detail(tNo);
		 
		model.addAttribute("view", vo);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String postUpdate(BoardVO vo) throws Exception {

		service.update(vo);
		 
		 return "redirect:/view?tNo=" + vo.gettNo();
	}
	
	// 게시물 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("tNo") int tNo) throws Exception {
		
		service.delete(tNo);		

		return "redirect:/list";
	}

}
