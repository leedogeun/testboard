package com.board.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.dao.BoardVO;
import com.board.service.BoardService;

@Controller
public class BoardController {

	private static Logger boardlogger = LoggerFactory.getLogger(BoardController.class);
	
	BoardService boardService;

	@RequestMapping(value = { "/board_write", "/write" }, method = RequestMethod.GET)
	public String write(Locale locale, Model model) {
		boardlogger.info("board write", locale);

		return "board_writer";
	}

	@RequestMapping(value = { "/board_list", "/board", "/list" }, method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		boardlogger.info("board list", boardService);
		
		List<BoardVO> list;
		
		list = boardService.list();
		
		model.addAttribute("list", list);

		return "board_list";
	}

	@RequestMapping(value = { "/board_detail", "/detail" }, method = RequestMethod.GET)
	public String detail(Locale locale, Model model) {
		boardlogger.info("board detail", locale);

		return "board_detailview";
	}

	@RequestMapping(value = { "/board_update", "/update" }, method = RequestMethod.GET)
	public String update(Locale locale, Model model) {
		boardlogger.info("board update", locale);

		return "board_list";
	}

	@RequestMapping(value = { "/board_delete", "/delete" }, method = RequestMethod.GET)
	public String delete(Locale locale, Model model) {
		boardlogger.info("board delete", locale);

		return "board_list";
	}

}
