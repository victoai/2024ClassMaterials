package com.acorn.practiceAPI;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {

	@Autowired
	ApiExplorer api;
	
//	@ResponseBody
//	@GetMapping(value="/apiJson" ,produces = "application/json;charset=UTF-8")
//	public String api() throws IOException {
//		String result =  api.getApiTest();
//		return result;
//	}
	

	@GetMapping(value="/api" ,produces = "application/json;charset=UTF-8")
	public String api(Model model) throws IOException {
		String result =  api.getApiTest();
		ArrayList<ApiDTO> list = api.fromJSONtoItems(result);
		model.addAttribute("apiList",list);
		return "apiView";
	}
	
	
	
	
}
