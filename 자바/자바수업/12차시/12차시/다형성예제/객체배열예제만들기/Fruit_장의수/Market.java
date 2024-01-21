package prjDay12;

import java.util.ArrayList;

public class Market {
	private ArrayList<Fruit> fs; //과일바구니 , ArrayList를 사용
	private int count;

	
	public Market() { // 생성자 호출시 ArrayList를 생성
		fs = new ArrayList<Fruit>();
	}

	public void addFruit(Fruit f) { //과일을 담는다.
		fs.add(f);
	}
	public void printFruits() { //과일바구니 내용물 출력
		for(int i=0;i<fs.size();i++) {
			System.out.println(fs.get(i)); //getInfo를 사용하여 출력
			count++;
		}
		System.out.println("생성된 과일의 수: "+Fruit.getCount());
		System.out.println("바구니에 담긴 과일의 수: "+count);
	}
}
