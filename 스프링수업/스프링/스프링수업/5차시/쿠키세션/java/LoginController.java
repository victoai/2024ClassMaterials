package com.acorn.cookie;


import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/login2")
	public String loginForm() {
		return "loginForm";
	}
	

	@RequestMapping("/logOut")
	public String logOut( HttpServletRequest request) {		
		System.out.print( " log OUt!!!!!!!");
		HttpSession session  = request.getSession();
		session.invalidate();  // session 
		return "redirect:/";
	}
	
	

	@RequestMapping(value="/login2" , method =RequestMethod.POST )
	public String login(String id, String pwd, boolean rememberId, HttpServletResponse response , HttpServletRequest request	) throws Exception {
		System.out.println("id="+id);
		System.out.println("pwd="+pwd);
		
		System.out.println("rememberId="+rememberId);
		
		// 1. id�� pwd�� Ȯ��
		if(!loginCheck(id, pwd)) {
			// 2-1   ��ġ���� ������, loginForm���� �̵�
		    String msg = URLEncoder.encode("id �Ǵ� pwd�� ��ġ���� �ʽ��ϴ�.", "utf-8");	
			//String msg =  "id �Ǵ� pwd�� ��ġ���� �ʽ��ϴ�.";
		    
		    System.out.println("�ƾƶ��ƶ�ƶ�");
			return "redirect:/login/login2?msg="+msg;
		}
		 
		  
		
		// 2-2. id�� pwd�� ��ġ�ϸ�,
		
		System.out.println(" sessionId : =" + id);
		HttpSession session = request.getSession();
		session.setAttribute("sessionId", id);
		
		
		if(rememberId) {
		//     1. ��Ű�� ����
			Cookie cookie = new Cookie("id", id); // ctrl+shift+o �ڵ� import
//		       2. ���信 ����
			response.addCookie(cookie);
		} else {
// 		       1. ��Ű�� ����
			Cookie cookie = new Cookie("id", id); // ctrl+shift+o �ڵ� import
			cookie.setMaxAge(0); // ��Ű�� ����
//		       2. ���信 ����
			response.addCookie(cookie);
		}
//		3. Ȩ���� �̵�
		
		return "redirect:/";
	}

	private boolean loginCheck(String id, String pwd) {
		// �׽�Ʈ�� 
		// �����δ� dao�� ����� �Ἥ Ȯ���ؾ� ��
		return "acorn".equals(id) && "1234".equals(pwd);
	}
}