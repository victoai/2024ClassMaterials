package ajaxPrj;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class FoodService {	
	FoodDAO dao;	
	
	public FoodService() {
		// TODO Auto-generated constructor stub
	}	
	public FoodService(FoodDAO dao) {		
		this.dao = dao;
	}	
	public JSONArray  getRealMenuList(){	
		ArrayList<Food> list= dao.getFoodList();		
		JSONArray arr = new JSONArray();
		for( Food food: list){
			JSONObject o = new JSONObject();
			o.put( "type", food.getType());
			o.put("menu" , food.getMenu());
			o.put("price", food.getPrice());
			arr.put(arr);
			 		
		}		
		return arr;
	}	
	public JSONArray  getMenuList(){		
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
		return arr;
	}
}
	
