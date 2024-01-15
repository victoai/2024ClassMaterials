package iostream;

import java.util.Objects;

public class Customer {
	String name;
	int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
 
	

}
