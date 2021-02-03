package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.dao.BoardVO;
import com.board.service.BoardServiceinterface;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Inject
	BoardServiceinterface service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		List<BoardVO> list = null;
		list = service.list();
		model.addAttribute("list", list);
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
	public void getView(@RequestParam("tNo") long tNo, Model model) throws Exception {
		BoardVO vo = service.view(tNo);
		model.addAttribute("view", vo);
	}
	/*
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public void getCheck(@RequestParam("tNo") long tNo, Model model) throws Exception {
		BoardVO vo = service.view(tNo);
		model.addAttribute("view", vo);
	}
	 * */
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void getModify(@RequestParam("tNo, tPassword") long tNo, String tPassword, Model model) throws Exception {
		BoardVO vo = service.check(tNo, tPassword);
		model.addAttribute("view", vo);
	}
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String postModify(BoardVO vo) throws Exception {
		service.modify(vo);
		return "redirect:/board/view?tNo=" + vo.gettNo();
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String getDelete(@RequestParam("tNo, tPassword") long tNo, String tPassword) throws Exception {
		service.delete(tNo,tPassword);
		return "redirect:/board/list";
	}
}