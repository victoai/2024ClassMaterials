package javaprj.day0201;

// Customer 클래스 정의
 public class Customer {
      String name;
      int age;
      String address;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
    public Customer(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}