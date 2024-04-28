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
public class ValidatorController { 
	
	 @InitBinder
		public void toDate( WebDataBinder binder) {
			/*		 
			 *  • 해당 Controller로 들어오는 요청에 대해
				• 추가적인 설정을 하고 싶을 때 사용할 수 있다.
				• 모든 요청 전에InitBinder를 선언한 메소드가 실행된다.
			 */
		   //데이터변환시 날짜데이터변환  String  -> Date 		 
		    SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		    binder.registerCustomEditor( Date.class , new CustomDateEditor( df, false)) ;	 
		    binder.setValidator(new MyDataValidator()); //자동검증, validator등록함 
		} 
	
	@GetMapping("/t")
	public String test( MyData myData  ) { 
		return "form";		
	}
	
	
	@PostMapping("/t")
	public String test(   @Valid MyData    myData ,  BindingResult  result) {		
		System.out.println( myData);		
		if(result.hasErrors()) {
			System.out.println( result);
			return "form";
		}
 
		return "home";
		
	}

	//수동검증
	
	@PostMapping("/nonAuto")
	public String test3(    MyData   myData ,  BindingResult  result) {
		
		System.out.println( myData);		
		//수동검증 
		MyDataValidator validator = new MyDataValidator();
		validator.validate(myData, result);
		
		
		if(result.hasErrors()) {
			System.out.println( result);
			return "testForm";
		} 
		 
		return "home";
		
	}
	
	@GetMapping("/nonAuto")
	public String test4(      ) {		 
		return "testForm";
		
	}
}
