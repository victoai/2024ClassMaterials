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
        return  "redirect:/login/login2";   // 로그인안했으면(세션확인) 로그인 화면으로 이동      
     return "boardList"  ;  //로그인 했으면  게시판화면으로 
  }

    private boolean loginCheck( HttpServletRequest  request ) {
      HttpSession session = request.getSession();
      return session.getAttribute("id") != null;
  }
}