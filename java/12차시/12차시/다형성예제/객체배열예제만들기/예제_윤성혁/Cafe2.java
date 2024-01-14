package Cafe;

import java.util.ArrayList;

import java.util.Scanner;

public class Cafe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Coffee> cafe = new ArrayList<>();
		
		String name;
		int price;
		final int MAX =3;

		for(int i=0; i<MAX; i++) {
			System.out.print("메뉴: ");
			name = sc.next();
			System.out.print("가격: ");
			price = sc.nextInt();
			cafe.add(new Coffee(name,price));
			
		}
		
		for(int i=0; i<cafe.size(); i++) {
			System.out.println(cafe.get(i));
		}
		
	}

}
