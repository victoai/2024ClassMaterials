package com.acorn.day3.project;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MemoController {

	@Autowired
	MemoService s;
	
	@RequestMapping("/select")
	public String SearchAll(Model model) {
		ArrayList<Memo> memoList = s.getSelectAll();
		model.addAttribute("memoList", memoList);
		return "memo";
	}
	
	//조회	
	@ResponseBody
	@RequestMapping( value="/search" , method=RequestMethod.GET)
	public ArrayList<Memo> getList(){		
		ArrayList<Memo> memoList = s.getSelectAll();
		return memoList;
	}
		
	
	
	@ResponseBody
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public void Register(String content) {
		s.getRegister(content);
	}
	
	@ResponseBody				
	@RequestMapping( value="/update" , method=RequestMethod.PUT)
	public void Update(@RequestBody  Memo m) {	 
		
		s.getUpdate(m.getCode(), m.getContent());
		
	}
	
	
	@ResponseBody				
	@RequestMapping( value="/delete/{code}" , method=RequestMethod.DELETE)
	public void Delete(@PathVariable  String code) {	
		s.getDelete(code);
		
	}
	
	
}
