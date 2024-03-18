package Ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex4")
public class ex4 extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String[] like = {"잠자기","게임하기","맛있는것 먹기"};
		
		req.setAttribute("like", like);
		req.getRequestDispatcher("WEB-INF/views2/ex4.jsp").forward(req, resp);
	}

}
