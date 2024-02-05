package prjDay12;

import java.util.Scanner;


public class FruitEx {

public static void main(String[] args) {
		
		Fruit f1= new Fruit(); //기본생성자 , this("과일","맛",0);
		f1.setName("사과"); //setter 사용
		f1.setFlavor("단맛");
		f1.setPrice(1000);
		
		Object f2= new Fruit("레몬","신맛",1500); // Object형 으로 생성, 업캐스팅
		
		Fruit f3= new Fruit("리치","단맛",2000);
		Fruit f4= new Fruit("오이","무맛",2000);
		
		Market m = new Market();
		
		m.addFruit(f1); //내부 ArrayList에 추가함 , fs.add(f);
		m.addFruit((Fruit)f2); 		// 다운캐스팅, 다시 과일로 부름
		m.addFruit(f3);
		
		
		m.printFruits();
		
	}

}
