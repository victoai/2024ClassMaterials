package java2.day3.reflect.animal;

public class Cat  extends Animal{

	public Cat() {
		System.out.println(" cat생성");
	}
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println( "야옹~~");
	}
}
