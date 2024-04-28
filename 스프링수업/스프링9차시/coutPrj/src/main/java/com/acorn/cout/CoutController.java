package com.acorn.cout;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoutController {
	
	
	
	//	사용자가 게시글 등록시 아래와 같이 작성햇다고 생각해 보자
	//   <script> alert('ok'); </script>
	//   게시글의 내용이 출력될 때 
	//   다음 두 개와 같이 출력된다
	
	
	
	@RequestMapping("/el")
	public String  method1(  Model model) { 		
		String result = "<script> alert('ok'); </script>";
		model.addAttribute("data", result);
		return "view1";
	}
	
	
	//
	@RequestMapping("/cout")
	public String  method2( Model model) { 
		String result = "<script> alert('ok'); </script>";
		model.addAttribute("data", result);
		return "view2";
	}
	 

}
