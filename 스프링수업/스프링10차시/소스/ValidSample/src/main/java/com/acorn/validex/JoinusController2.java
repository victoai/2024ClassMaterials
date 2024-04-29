package com.acorn.validex;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 /*
  *  @Valid를 위해서 아래 dependency 추가
  	<!--  validation   dependency 추가 -->	
		 <dependency>
		    <groupId>javax.validation</groupId>
		    <artifactId>validation-api</artifactId>
		    <version>2.0.1.Final</version>
		</dependency>
  */

@Controller
public class JoinusController2 {

	 @InitBinder
		public void toDate( WebDataBinder binder) {
			/*		 
			 *  • 해당 Controller로 들어오는 요청에 대해
				• 추가적인 설정을 하고 싶을 때 사용할 수 있다.
				• 모든 요청 전에InitBinder를 선언한 메소드가 실행된다.
			 */
		   //데이터변환시 날짜데이터변환  String  -> Date 	
		    //변환
		     SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		     binder.registerCustomEditor( Date.class , new CustomDateEditor( df, false)) ;		    
		    //검증
		     //WebDataBinder에  validator 등록함
		     binder.setValidator(new UserValidator()); //자동검증, validator등록함 
		} 
	
	
	
	@RequestMapping("/joinus2")
	public String joinus() {		
		return "joinus";
	}
	
	
	
	
	@RequestMapping(value="/joinus2", method=RequestMethod.POST)
	public String joinus2(@Valid User user , BindingResult result) {
		
		
		//데이터 변환, 검증 		
		System.out.println( result);
		System.out.println( user);
		 
		if(result.hasErrors()) {
			System.out.println( result);
			return "joinus";
		} 
		 
		
		return "ok";
	}
	
	
}
