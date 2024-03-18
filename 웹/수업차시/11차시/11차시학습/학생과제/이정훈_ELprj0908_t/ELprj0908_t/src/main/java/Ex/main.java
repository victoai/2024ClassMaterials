package Ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/main")
public class main extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id =  req.getParameter("id");
		HttpSession s = req.getSession();
		
		s.setAttribute("id",id);
		req.getRequestDispatcher("WEB-INF/views/main.jsp").forward(req, resp);
	}

}
