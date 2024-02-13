package Project;

public class Cosmetic {

	String name;
	Product[] products;
	public Cosmetic() {
		// TODO Auto-generated constructor stub
	}

	public Cosmetic(String name, Product[] products) {
		this.name = name;
		this.products = products;
	}

	public void showMenu() {
		System.out.println(name + "의 상품 목록:");
		for (int i = 0; i < products.length; i++) {
			System.out.println((i + 1) + ". " + products[i].name);
		}
	}
	public void showProduct() {
		System.out.println(name + "의 상품 목록:");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].name+"\t"+products[i].originalPrice+"\t"+products[i].discountedPrice);;
		}
	}

	public void showStock() {
		System.out.println(name + "의 재고 및 가격 조회:");
		System.out.println(" ");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].name + " = " + products[i].discountedPrice + "원 - 할인가격 ("
					+ products[i].originalPrice + "원 - 원래가격) - 재고: " + products[i].stock + "개");

		}
		System.out.println(" ");
	}

	public void changeStock(int i, int newStock) {
		if (i >= 0 && i < products.length) {
			products[i].stock = newStock;
			System.out.println(products[i].name + "의 재고가 " + newStock + "개로 수정되었습니다.");
			System.out.println(" ");
		} else {
			System.out.println("없는 번호입니다.");
		}
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}
}
