package java2prj1.day0926.lamda.실습;

import java.util.ArrayList;

import java.util.function.Supplier;
 

public class SupplierEx {

	public static void main(String[] args) {
		
		ArrayList<Material> m = new ArrayList<>();
		m.add(new Material("라면", 3000));
		m.add(new Material("계란", 6000));
		m.add(new Material("대파", 3000));
		m.add(new Material("양파", 8000));
		m.add(new Material("마늘", 9000));
		m.add(new Material("쌈장", 3000));
		m.add(new Material("삼겹살", 12000));
		m.add(new Material("목살", 11000));
		m.add(new Material("김치", 20000));
		m.add(new Material("순두부", 2000));
		m.add(new Material("상추", 2000));
		m.add(new Material("깻잎", 2000));
		m.add(new Material("쌈채소", 5000));
		
		
		ArrayList<Food> food = new ArrayList<>();
		ArrayList<Material> ramen = new ArrayList<>();
		ramen.add(m.get(0));
		ramen.add(m.get(1));
		ramen.add(m.get(2));
		ramen.add(m.get(3));
		ramen.add(m.get(4));
		food.add(new Food("일반라면", ramen));
		
		ArrayList<Material> bacon = new ArrayList<>();
		bacon.add(m.get(6));
		bacon.add(m.get(7));
		bacon.add(m.get(9));
		bacon.add(m.get(10));
		bacon.add(m.get(11));
		bacon.add(m.get(12));
		food.add(new Food("삼겹살", bacon));
		
		ArrayList<Material> softTofu = new ArrayList<>();
		softTofu.add(m.get(0));
		softTofu.add(m.get(1));
		softTofu.add(m.get(2));
		softTofu.add(m.get(3));
		softTofu.add(m.get(4));
		softTofu.add(m.get(9));
		food.add(new Food("순두부열라면", softTofu));
		
		
		Supplier<Food> s = () -> {
			int index = (int)(Math.random()*food.size());
			Food select = food.get(index);
			return select;
		};
		Food result = s.get();
		System.out.println(result);
		
		
	}
}
