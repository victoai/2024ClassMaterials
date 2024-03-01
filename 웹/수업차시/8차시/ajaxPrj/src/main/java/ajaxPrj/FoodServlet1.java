package ajaxPrj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;


@WebServlet("/foodJson")
public class FoodServlet1  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		Food food = new Food("음료", "아메리카노",3500);	
		JSONObject o = new JSONObject();				
		o.put("type",  food.getType());
		o.put("menu" , food.getMenu());
		o.put("price" , food.getPrice());		
		response.getWriter().println(o);		
	}
}
