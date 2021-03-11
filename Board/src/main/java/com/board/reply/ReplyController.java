package com.board.reply;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/reply/*")
public class ReplyController {
	
	@Inject
	ReplyService reply;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getList()throws Exception{
		
		
		
		return null;
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String postInsert() throws Exception{
		
				
		return null;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String postUpdate() throws Exception{
		
				
		return null;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDelete() throws Exception{
		
				
		return null;
	}
	
	@RequestMapping(value = "/ajaxList", method = RequestMethod.POST)
	public String ajaxList() throws Exception{
		
				
		return null;
	}
}
