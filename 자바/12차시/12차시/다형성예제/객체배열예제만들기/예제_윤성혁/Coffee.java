package Cafe;

public class Coffee {

	private String name;
	private int price;
	
	public Coffee(String name, int price) {
		this.name =name;
		this.price =price;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public void setPrice(int price) {
		this.price =price;
	}
	
	@Override
	public String toString() {
		return name + " " + price +"원";
	}
	
}
