package Ex;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex8")
public class ex8 extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		ArrayList<Coffee> coffee = new ArrayList<>();
		
		coffee.add(new Coffee("c001","아메리카노",2000));
		coffee.add(new Coffee("c002","카페라떼",2500));
		coffee.add(new Coffee("c003","카푸치노",3000));
		coffee.add(new Coffee("c004","바닐라라떼",4000));
		
		req.setAttribute("coffee",coffee);
		req.getRequestDispatcher("WEB-INF/views2/ex8.jsp").forward(req, resp);
	}

}
