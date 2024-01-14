package Snack;

public class Snack {
	String name;
	int price;
	String flavor;
	int gram;
	
	public Snack(){
	}
	public Snack(String name,int price, String flavor, int gram) {
		this.name = name;
		this.price = price;
		this.flavor = flavor;
		this.gram = gram;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
	@Override
	public String toString() {
		return name+" "+price+"원 "+flavor+"맛 "+gram+"g";
	}
}
