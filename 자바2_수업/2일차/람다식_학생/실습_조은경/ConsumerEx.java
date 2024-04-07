package java2prj1.day0926.lamda.실습;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerEx {
	
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
		
		
		Consumer<Integer> c = (num) -> {
			
			ArrayList<Material> list = new ArrayList<>();
			
			int sum = 0;
			
			while(true) {
				int index = (int)(Math.random()*m.size());
				sum += m.get(index).price;
				if(sum <= num) {
					list.add(m.get(index));
				}else {
					break;
				}
				m.remove(index);
			}
			
			for(Material ml : list) {
				System.out.println(ml);
			}
			
		};
		c.accept(30000);
		
	}
}
