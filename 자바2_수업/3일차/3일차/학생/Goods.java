package java2prj1.day0927.lamda;

public class Goods {

	String name;
	int price;
	int age;
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}

	public Goods(String name, int price, int age) {
		super();
		this.name = name;
		this.price = price;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", age=" + age + "]";
	}
	
	
	
}
