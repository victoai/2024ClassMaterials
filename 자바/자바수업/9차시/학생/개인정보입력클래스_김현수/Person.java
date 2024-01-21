package 실습9차시;

public class Person {
	
	//멤버변수
	private String name;
	private int age;
	private Boolean isMarreid;
	private int number_of_children;
	
	// 생성자
	public Person(String name, int age, Boolean isMarried, int number_of_children) {
		this.name = name;
		this.age = age;
		this.isMarreid = isMarried;
		this.number_of_children = number_of_children;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setIsMarreid(Boolean isMarreid) {
		this.isMarreid = isMarreid;
	}
	
	public void setNumberOfChildren(int number_of_children) {
		this.number_of_children = number_of_children;
	}
	
	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + ", isMarreid = " + isMarreid + ", number_of_children = " + number_of_children + "]"; 
	}
	
	
	
	
}
