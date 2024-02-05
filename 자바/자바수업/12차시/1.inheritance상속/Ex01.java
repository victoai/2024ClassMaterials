package javaprj.day0205;

public class Ex01 {

	public static void main(String[] args) {
		 
		
		Cat c = new Cat();
		c.쥐를잡는다();
		
		
	
		// 	 상속관계에서 
		// Animal : 부모 (상위 )
		// Cat :  자식 ( 하위)
		//부모형참조형변수로 다룰 수 있다 . 상속관계에서는 
		//다룰수 있는 이유 :  부모의 내용이 반드시 있다 그러므로 부모형으로 다룰 수 있다.
		
		

		//부모형으로 다루면 부모형의 값만큼 인식한다.(부모형으로 축소된다)
		//animal로 다루면 쥐를 잡는다() 기능이 인식되지 않는다.
		// type : 크기, 해석 
		
		
		//상속관계에서  upcasting (업캐스팅)  :가능하다
		//단 부모형으로 해석이 축소됨 
		//animal만큼만 해석가능함 
		
		
		//상속관계에서만 가능함
	  	 Animal animal = new Cat();	  //업캐스팅   (자동형변환)			
		//다운캐스팅 , new된 실체가 중요함
		 Cat c2 = (Cat)animal;        // 다운캐스팅 (명시적형변환)
		 c2.쥐를잡는다();
		
		  
		 //질문 !!!!	 		 
		 //
		 Animal animal2 = new Animal();
		 Cat cat3 =(Cat)animal2;  // Cat형으로 형변환 가능한가요? ?????		 
		 cat3.쥐를잡는다();  // 문법적으로 허용한다. 하지만 불가능하다. 
		 
		 
		    
		 
		 
		 
		
	}

}
