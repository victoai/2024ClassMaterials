package front;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberSaveControllerV1 implements ControllerV1 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	
    	request.setCharacterEncoding("utf-8");
        String username = request.getParameter("userName");
        int age = Integer.parseInt(request.getParameter("age"));
        
        System.out.println( username +  age);

        Member member = new Member(username, age);

        memberRepository.save(member);

        String viewPath = "/WEB-INF/views/save-result.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        request.setAttribute("member",member);
        dispatcher.forward(request, response);
    }
}