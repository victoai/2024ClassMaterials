package Snack;

import java.util.ArrayList;

public class SnackEx {

	public static void main(String[] args) {
		ArrayList<Snack> list = new ArrayList<>();
		
		list.add(new Snack("빼빼로",1200,"달콤한",40));
		list.add(new Snack("맛동산",2300,"달콤한",40));
		list.add(new Snack("프링글스",1700,"어니언",40));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//가격변경
		((Snack)list.get(0)).setPrice(800);
		System.out.println(list.get(0).toString());
	}

}
