package Cafe;

import java.util.ArrayList;

public class Cafe {

	public static void main(String[] args) {
		
		ArrayList<Coffee> cafe = new ArrayList<>();
		
		cafe.add(new Coffee("아메리카노",1800));
		cafe.add(new Coffee("카페라떼",2700));
		cafe.add(new Coffee("연유라떼",3500));
		
		for(int i=0; i<cafe.size(); i++) {
			System.out.println(cafe.get(i));
		}
		
	}

}
