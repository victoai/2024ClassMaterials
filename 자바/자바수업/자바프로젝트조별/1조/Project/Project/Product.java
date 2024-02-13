package Project;

public class Product {
	String name;
	int originalPrice;
	int discountedPrice;
	int stock; // 재고 수량 변수로 수정
	

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int originalPrice, int discountedPrice, int stock) {
		this.name = name;
		this.originalPrice = originalPrice;
		this.discountedPrice = discountedPrice;
		this.stock = stock;
	}
	public void setStock(int s) {
		this.stock-= s;
	}
}
