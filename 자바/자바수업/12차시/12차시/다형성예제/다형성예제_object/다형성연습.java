package 다형성예제;

import java.util.ArrayList;

public class 다형성연습 {

	public static void main(String[] args) {
		
		
		
		Car car = new Car();
		Cat cat = new Cat();
		Person p = new Person();
		Wolf w= new Wolf();
		
		
		Object[] arr = new Object[4];
		arr[0] = car;
		arr[1]= cat;
		arr[2]= p;
		arr[3]= w;
		
		for( Object  o: arr){
			System.out.println(   o);
			
		}
		
		
		
		
		// 가변길이 배열
		ArrayList list = new ArrayList();
		
		list.add(car);  // 자식의 오버라이딩 매서드가 호출됨  
		list.add(cat);  // 자식의 오버라이딩 매서드가 호출됨
		list.add( p);   // 자식의 오버라이딩 매서드가 호춛됨
		list.add(w);     // 부모의 매서드가 호출됨
		
		
	 
		for( Object o  : list){
			System.out.println( o);
		}
		
		//모든 객체의  Object형으로 다뤄질수 있다.
		// 자바의 라이브러리에서는 우리가 만든 객체를  Object로 다루고 있다 !!
		
		
		// Object의 필요성 !!!!!
		
		System.out.println("다형성이 무엇이라고 생각합니까?");
		System.out.println("자바의 Object라는 클래스가 있습니다. 모든 클래스는 Object를 상속받습니다");
		System.out.println("모든 객체는 Object 참조형변수로 다뤄질 수 있습니다");
		System.out.println("각 객체를  Object로 다루면서 객체의 정보를 객체에 맞게 올바르게 (다르게) 얻어올 수 있습니다 . 단 toString() 매서드를 오버라이딩을 해야합니다");
		
		
		

	}

}
