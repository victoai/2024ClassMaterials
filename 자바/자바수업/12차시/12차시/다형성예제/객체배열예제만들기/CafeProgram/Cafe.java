package prjDay12;

public class Cafe {
	
	String name;
	String menu;
	int price;
	String open;
	String close;
	
	
	public Cafe() {
		
	}
	
	public Cafe(String name, String menu, int price, String open, String close) {
		this.name = name;
		this.menu = menu;
		this.price = price;
		this.open = open;
		this.close = close;
	} 
	
	public String getInfo() {
		return name + "입니다. " + menu + "는 " + price + "원 입니다. 오픈은 " + open + "부터 마감은 " + close + "입니다." ;
	}

	
	@Override
	public String toString() {
		return name + "입니다. " + menu + "는 " + price + "원 입니다. 오픈은 " + open + "부터 마감은 " + close + "입니다." ;
	}
}
