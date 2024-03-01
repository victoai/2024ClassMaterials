package ajaxPrj;

public class Food {
	
	String type;
	String menu;
	int price;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public Food(String type, String menu, int price) {
		super();
		this.type = type;
		this.menu = menu;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [type=" + type + ", menu=" + menu + ", price=" + price
				+ "]";
	} 

}
