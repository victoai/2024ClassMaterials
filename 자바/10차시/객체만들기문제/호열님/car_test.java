package week03.day2.호열님;

import week03.day2.재호님.Singer;

public class car_test {

	public static void main(String[] args) {
		car c = new car();
		
		c.print();
		
		c.input("Avante", "Hyundai", 2022, "white", 50);
		c.print();
		
		c.start();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.now();
		
		Singer singer = new Singer();
		 
	}

}
