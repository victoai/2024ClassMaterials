package ajaxPrj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;



@WebServlet("/fooddb")
public class FoodServlet4  extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
				 
		FoodDAO dao = new FoodDAO();		 
		FoodService service = new FoodService( dao);
		JSONArray list = service.getRealMenuList();		 
		response.getWriter().println( list);
		
		
		
	}
	
}
