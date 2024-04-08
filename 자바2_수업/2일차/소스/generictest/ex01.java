package day1.generic.generictest;

import java.util.ArrayList;

public class ex01 {

	public static void main(String[] args) {
	 
		
		//ArrayList< Fruit>  list = new ArrayList< Fruit>();
		ArrayList< ? extends Fruit>  list = new ArrayList< Apple>();		
		ArrayList<Fruit> list2 = new ArrayList<>();
		

	}

}
