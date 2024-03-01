package ajaxPrj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/foodList")
public class FoodListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	 
		
		
		FoodDAO dao = new FoodDAO();
		ArrayList<Food> list  = dao.getFoodList();
		System.out.println( list);
		
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/listView.jsp").forward(request, response);
		 
	}

}
