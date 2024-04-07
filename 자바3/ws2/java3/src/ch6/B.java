package ch6;

//public class B extends Object {
public class B {
	
	int age=10; //명시적 초기화
	int height;
	
	
	public B() {  }
	public B( int age , int height) { // 생성자 초기화
		this.age  = age;
		this.height = height;		
	}	
	
	//초기화블럭
	{	
		System.out.println("객체생성");
	 	height=170;
	}
	
	@Override
	public String toString() {
		return  age  +" " + height;
	}
	
	
	public static void main(String[] args) {
		B  b = new B();
		System.out.println( b);		
		
		B b2 = new B( 25 , 180);
		System.out.println( b2); 
		
	}
	
}




