package Ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex2")
public class ex2 extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		

		
		req.setAttribute("hello","안녕하세요" );
		req.getRequestDispatcher("WEB-INF/views2/ex2.jsp").forward(req, resp);
	}

}
