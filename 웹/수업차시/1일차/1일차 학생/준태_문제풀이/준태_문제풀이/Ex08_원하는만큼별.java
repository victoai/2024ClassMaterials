package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex08")
public class Ex08_원하는만큼별 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String star_=request.getParameter("star");
		int star= Integer.parseInt(star_);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		for(int i=0; i<star; i++) {
		String s="*";

		out.println("<h2>"+s+"<h2>");
		
	}
		out.println("</body>");
		out.println("</html>");
	}
}
