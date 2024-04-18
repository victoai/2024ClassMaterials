package com.acorn.day3;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


 
 
@Controller
public class DanController {
	
	@Autowired
	DanService service; 
 
		 
	@RequestMapping("/gugudan")  
	public String  test1( @RequestParam ( required = false, defaultValue = "1" ) int dan  , Model model) {					
		ArrayList<String> danList = service.getDan(dan);
		model.addAttribute("list", danList);
		System.out.println( dan);
		return "danView";   
	}

}
