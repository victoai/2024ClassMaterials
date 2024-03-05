package day1.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hap")
public class Ex01 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//
		
		String su1_= request.getParameter("su1");
		String su2_= request.getParameter("su2");
		
		
		int sum=0;
		if( su1_ != null  && su2_ !=null) {		
			int su1  = Integer.parseInt( su1_);
			int su2  = Integer.parseInt( su2_);
		     sum = su1+su2;
		}
		
		response.setContentType("text/html");   //서버가 보내는 데이터의 형식   html형식임을 알려줌   "text/plain"  과  text/html 차이 경험하기
		response.setCharacterEncoding("utf-8");  //utf-8형식으로 데이터를 보낸다는 의미
		PrintWriter out = response.getWriter();
		out.println("<html>");                    // html , css
		out.println("<head>");       
		out.println("</head>"); 
		out.println("<body>");
		out.println(sum);
		out.println("</body>"); 
		out.println("</html>"); 
		
	}	
}
