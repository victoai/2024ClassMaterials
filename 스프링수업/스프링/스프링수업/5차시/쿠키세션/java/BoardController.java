package com.acorn.cookie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController{
   @RequestMapping("/list")
   public String list( HttpServletRequest request) {
     if( !loginCheck(request)) 
        return  "redirect:/login/login2";   // �α��ξ�������(����Ȯ��) �α��� ȭ������ �̵�      
     return "boardList"  ;  //�α��� ������  �Խ���ȭ������ 
  }

    private boolean loginCheck( HttpServletRequest  request ) {
      HttpSession session = request.getSession();
      return session.getAttribute("id") != null;
  }
}