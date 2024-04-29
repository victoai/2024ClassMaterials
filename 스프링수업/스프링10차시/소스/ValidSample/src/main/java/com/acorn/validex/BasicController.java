package com.acorn.validex;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BasicController {
	
	
	
	@GetMapping("/basic")
	public String  test() {
		
		return "basicForm";
	}
	

	@PostMapping("/basic")
	public String  test(User user , Model model) {
		
		Map<String, String> errors =  new HashMap<>();
	 
		
		//유효성검사
		if( user.getId()==null ||  user.getId().equals("")) {
			errors.put("id", "아이디입력");	
			model.addAttribute("errors", errors);
			return "basicForm";
		}
		//유효성검사
		if( user.getPw()==null ||  user.getPw().equals("")) {
			errors.put("pw", "비빌번호 입력");
			model.addAttribute("errors", errors);
			return "basicForm";
		}
		if(  user.getPw().length() <5 ||  user.getPw().length() >11) {
			errors.put("pw", "비빌번호 자리수 5~11");
			model.addAttribute("errors", errors);
			return "basicForm";
		}
		
		return "home";
	}


}
