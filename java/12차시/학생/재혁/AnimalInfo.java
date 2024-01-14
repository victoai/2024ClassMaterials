package java_day12.상속연습;

public class AnimalInfo extends Animal {

	int age;

	public AnimalInfo(String name, String fname, int age) {
		
		super(name , fname);
		this.age = age;

	}

	public String toString() {
		return "이름:"+ name +" 별명:"+  fname + " 나이:" + age;
	}

}
