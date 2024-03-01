package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex09")
public class Ex09_약수 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		String su_ = request.getParameter("su");
		int su = Integer.parseInt(su_);
		PrintWriter out = response.getWriter();
	
	
		String s = "*";
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");

		
		for(int i=1; i<=su; i++) {
			if (su%i==0) {
				out.println("<h2>"+su+"의 "+i+"번째 약수" + i + "<h2>");
			}
		}

		out.println("</body>");
		out.println("</html>");
	}
}
