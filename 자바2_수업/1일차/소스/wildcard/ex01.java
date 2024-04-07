package day1.generic.wildcard;

import java.util.ArrayList;

public class ex01 {

	public static void main(String[] args) {
	 
		
		//  ? =>    ? extends Object 
		ArrayList<?> list  = new ArrayList<Fruit>();
		ArrayList< ? extends Fruit>  list2  = new ArrayList<Apple>();
		ArrayList< ? super Fruit>  list3  = new ArrayList<Fruit>();
		
		

	}

}
