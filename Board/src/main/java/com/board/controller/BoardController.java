package com.board.controller;

import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
	private static final Logger boardlogger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = { "/board_write", "/write" }, method = RequestMethod.GET)
	public String write(Locale locale, Model model) {
		boardlogger.info("board write", locale);
		
		return "board_list";
	}
	@RequestMapping(value = { "/board_list", "/board", "/list" }, method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		boardlogger.info("board list", locale);

		return "board_list";
	}
	@RequestMapping(value = { "/board_detail", "/detail" }, method = RequestMethod.GET)
	public String detail(Locale locale, Model model) {
		boardlogger.info("board detail", locale);
		
		return "board_list";
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
