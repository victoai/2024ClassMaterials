package day2.lamda.functionalI;


//람다식 : 매서드 (함수)를 간단한 식으로 표현하는 것 
//익명함수라고도 한다.
//자바는 매서드만 존재할 수 없다. 
//인터페이스를 제공한다. 추상매서드가 한 개인 인터페이스를 제공한다. => 함수형인터페이스 
//매서드를 간단한 식형태로 사용할 수 있게 한다.

/*
 * interface AddInterface 
 *    int add( int a, int b);
 * 
 */

@FunctionalInterface
interface AddInterface{
	int add( int a, int b);	 
}

public class AddInterfaceEx {

	public static void main(String[] args) {		 
		
		//1.		
		class AddInterfaceImp  implements AddInterface{

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}			
		}
		
		AddInterfaceImp  f1 = new AddInterfaceImp();
		int result3 =f1.add(9, 3);
		System.out.println( result3);		
		
		
		//2.    AddInterface() {}  => 익명클래스 정의하는 것
		 AddInterface f2= new AddInterface() {
			@Override
			public int add(int a, int b) {
				 
				return a+b;
			}};		
		int result2 = f2.add(2, 3) ;
		System.out.println(result2);
		
		
		//3.
		//AddInterface f3 =  (int a, int b) ->{ return  a+b; };
		                   //익명클래스생성, 익명객체생성
		//AddInterface f3 =  (  a, b) ->   a+b ;
		AddInterface f3 = (a, b) ->{
			int sum;
			sum =a+b;
			return sum;		
		};
		int result =f3.add(5, 3);
		System.out.println( result);
		
		
		
		
		

	}

}
