package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex06")
public class Ex06_원하는단 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String su_=request.getParameter("su");
		int su= Integer.parseInt(su_);
		PrintWriter out = response.getWriter();
	for(int i=1; i<=9; i++) {
		int a=0;
		a=su*i;
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>"+su+"x"+i+"="+a+"<h2>");
		out.println("</body>");
		out.println("</html>");
	}
	}
}
