package java2.day4.변경이유리한코드.animal;

public class Dog extends Animal {

	public Dog() {
		System.out.println( "dog 생성");
	}
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println( "멍멍");
	}
}
