package day5.annotation.sample1;

  

public class FruitStore {	
	@Count(value=3)
	private int apples;
	
	@Count(5)   //value생략할 수 있다
	private int bananas; 

	public FruitStore(int apples, int bananas) {
		super();
		this.apples = apples;
		this.bananas = bananas;
	}
}
