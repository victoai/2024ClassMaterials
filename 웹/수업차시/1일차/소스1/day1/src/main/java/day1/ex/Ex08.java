package day1.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex08")
public class Ex08  extends HttpServlet {	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");   //서버가 보내는 데이터의 형식   html형식임을 알려줌   "tet/plain"
		response.setCharacterEncoding("utf-8");  //utf-8형식으로 데이터를 보낸다는 의미
		PrintWriter out = response.getWriter();
		
		out.println("<html>");                     
		out.println("<head>");       
		out.println("</head>"); 
		out.println("<body>");
		
	  // out.println(" <img src="/w01/img/b.png"> " );
	  // 쌍따옴표안에 쌍다옴표가 있으면 \ (역슬러쉬 )
		out.println("<img src=\"/w01/img/a.avif\">"); 
		out.println("<img src=\"/w01/img/b.png\">");
		out.println("</body>"); 
		out.println("</html>"); 
	}

}
