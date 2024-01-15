package prjDay12;

public class Fruit {
	private String name;
	private String flavor;
	private int price;
	private static int count;
	
	//인스턴스변수 초기화 블럭
	{
		count++;
	}
	public Fruit() {
		this("과일","맛",0); 
		
	} //기본 생성자
	
	public Fruit(String name, String flavor,int price) { //이름,맛,가격을 받는 생성자
		this.name = name;
		this.flavor = flavor;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return name+"은(는) "+flavor+"을 가진 과일이며, "+price+"원입니다.";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getCount() {
		return count;
	}

	

	
	

	
}
