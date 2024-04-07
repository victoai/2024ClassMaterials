package java2prj1.day0926.lamda.실습;

public class Material {

	String name;
	int price;
	
	public Material() {
		// TODO Auto-generated constructor stub
	}

	public Material(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Material [name=" + name + ", price=" + price + "]";
	}
	
	
}
