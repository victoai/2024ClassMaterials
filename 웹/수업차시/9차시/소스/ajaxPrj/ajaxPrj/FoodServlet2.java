package ajaxPrj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;


@WebServlet("/foodJsonArr")
public class FoodServlet2  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		ArrayList<Food> foods = new ArrayList<>();
		foods.add(new Food("밥" , "제육덮밥" , 9000));
		foods.add(new Food("면" , "칼국수" , 8000));
		foods.add(new Food("분식" , "납작만두" , 6500));	
				
		JSONArray arr = new JSONArray();		
		for( int i=0;  i< foods.size() ; i++){
			  Food f  = foods.get(i);
			  JSONObject o = new JSONObject();
			  o.put("type", f.getType());
			  o.put("menu", f.getMenu());
			  o.put("price" , f.getPrice());
			  arr.put(o);		
		}			 	
		response.getWriter().println(arr);		
	}
}
