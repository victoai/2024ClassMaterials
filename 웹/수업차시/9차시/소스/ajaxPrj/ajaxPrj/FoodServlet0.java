package ajaxPrj;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/foodInfo")
public class FoodServlet0  extends HttpServlet {	
	 @Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	 
		  
		 response.setCharacterEncoding("utf-8");
		 response.setContentType("text/html;charset=utf-8");		 
		 String food="아메리카노"; 		 
		 response.getWriter().println( food);  
	}
}
