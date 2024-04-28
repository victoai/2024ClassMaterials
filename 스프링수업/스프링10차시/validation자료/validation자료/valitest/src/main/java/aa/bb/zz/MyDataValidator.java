package aa.bb.zz;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MyDataValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) { 
		return MyData.class.isAssignableFrom(clazz); // clazz가 User 또는 그 자손인지 확인
	}

	
	@Override
	public void validate(Object target, Errors errors) { 
		System.out.println("UserValidator.validate() is called");
		MyData user = (MyData)target;		
		String id = user.getId();		
    //	if(id==null || "".equals(id.trim())) {
 	//		errors.rejectValue("id", "required");       // 필드명, 에러코드
 	//	}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id",  "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pw", "required");
		
		if(id==null || id.length() <  5 || id.length() > 12) {
			errors.rejectValue("id", "invalidLength", new String[]{"5","12"}, null );
		}
		 
		
		 
	}
}