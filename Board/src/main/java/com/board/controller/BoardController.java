package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.board.dao.BoardVO;
import com.board.service.BoardService;

@Controller
public class BoardController {

	@Inject
	BoardService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		System.out.println("list? 1");

		List<BoardVO> list = null;

		System.out.println("list? 2");

		list = service.list();

		System.out.println("list? 3");

		model.addAttribute("list", list);

		System.out.println("list? 4");
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void getWrite() throws Exception {
		System.out.println("write-get");

	}

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		System.out.println("write-post");
		
		service.insert(vo);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/detail", method = RequestMethod.GET)
	public void getDetail() throws Exception{
		System.out.println("detail-get");
		
	}
	/*
	 * 
	 * @RequestMapping(value = { "/board_list", "/board", "/list" }, method =
	 * RequestMethod.GET) public String list(Model model) throws Exception {
	 * 
	 * 
	 * List<BoardVO> list;
	 * 
	 * list = boardService.list();
	 * 
	 * model.addAttribute("list", list);
	 * 
	 * return "list"; }
	 * 
	 * 
	 * boardlogger.info("board write");
	 * 
	 * 
	 * @RequestMapping(value = { "/board_write", "/write" }, method =
	 * RequestMethod.GET) public String write(Locale locale, Model model) {
	 * 
	 * return "board_writer"; }
	 * 
	 * 
	 * @RequestMapping(value = { "/board_detail", "/detail" }, method =
	 * RequestMethod.GET) public String detail(Locale locale, Model model) {
	 * boardlogger.info("board detail", locale);
	 * 
	 * return "board_detailview"; }
	 * 
	 * @RequestMapping(value = { "/board_update", "/update" }, method =
	 * RequestMethod.GET) public String update(Locale locale, Model model) {
	 * boardlogger.info("board update", locale);
	 * 
	 * return "board_list"; }
	 * 
	 * @RequestMapping(value = { "/board_delete", "/delete" }, method =
	 * RequestMethod.GET) public String delete(Locale locale, Model model) {
	 * boardlogger.info("board delete", locale);
	 * 
	 * return "board_list"; }
	 */

}
