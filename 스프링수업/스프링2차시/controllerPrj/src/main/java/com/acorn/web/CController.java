package com.acorn.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class CController  implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 
		
		ModelAndView mv  = new ModelAndView();
		mv.setViewName("cview");
		mv.addObject("key", "spring hello~~!!");
		return mv;
	}

}
