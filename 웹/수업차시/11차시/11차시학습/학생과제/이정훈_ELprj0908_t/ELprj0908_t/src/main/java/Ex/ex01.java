package Ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex1")
public class ex01 extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};

		
		req.setAttribute("num", num);
		req.getRequestDispatcher("WEB-INF/views2/ex1.jsp").forward(req, resp);
	}

}
