package java2prj1.day0926.lamda.실습;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<>();
		food.add("순두부열라면");
		food.add("김치찌개");
		food.add("된장찌개");
		food.add("순두부찌개");
		food.add("콩나물국");
		food.add("오이냉국");
		
		Predicate<String> p = name -> {
			System.out.println( "name" +  name);
			boolean result = false;
			int cnt = 0;
			for(int i=0; i < food.size(); i++) {
				if(name.equals(food.get(i))){
					result = true;
					cnt++;
					break;
				}
			}
			if(cnt !=0) {
				food.add(name);
			}
			return result;
		};
		
		boolean result = p.test("된장국");
		System.out.println(result);
		boolean result1 = p.test("된장찌개");
		System.out.println(result1);
	}
}
