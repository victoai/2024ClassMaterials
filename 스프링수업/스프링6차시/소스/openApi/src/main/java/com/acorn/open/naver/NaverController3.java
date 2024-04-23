package com.acorn.open.naver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

 
@Controller
public class NaverController3 {
	
	@ResponseBody
	@RequestMapping(value="/naverTest" , method=RequestMethod.GET , produces = "application/json;charset=utf-8")
	public String test() {
		ApiExamSearchBlog2 search = new ApiExamSearchBlog2();
		String result  = search.getShoppingList();
		return result;		
	}
	
	
	@ResponseBody
	@RequestMapping(value="/naverTest2" , method=RequestMethod.GET , produces = "application/json;charset=utf-8")
	public List<ItemDto> test2() {
		ApiExamSearchBlog2 search = new ApiExamSearchBlog2();
		String result  = search.getShoppingList();
		List<ItemDto>  list  =  search.fromJSONtoItems(result);
		return list;		
	}
}
