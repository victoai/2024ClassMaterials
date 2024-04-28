package aa.bb.zz;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SimpleController { 
 

	@GetMapping("/simple")
	// public String test2( MyData myData  ) {   //오류가발생하는 경우 400 오류발생
	 public String test2( MyData myData , BindingResult result  ) { 		//오류발생 BindingResult 객체에 에러코드 담김
		System.out.println( result);
		return "testForm";		
	}
	 
	 

}
