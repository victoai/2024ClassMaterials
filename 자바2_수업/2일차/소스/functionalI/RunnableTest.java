package day2.lamda.functionalI;

public class RunnableTest {

	
	/*
	 * 
	 *  interface Runnable{
	 *         void run(); 
	 *  }
	 * 
	 */
	public static void main(String[] args) {		 
		//
		Runnable r  =  () -> System.out.println( "람다식 좋아요!");		
		r.run();
		
		
		Runnable r2 =  new Runnable() {

			@Override
			public void run() {
				 System.out.println( "Runnable 인터페이스를 익명으로 구현한다");
				
			}}  ;
			
		r2.run();
		
		
	  class B  implements Runnable{
		@Override
		public void run() {
			System.out.println( " Runnable 인터페이스를 이름있는 클래스로 구현함 ");
			
		}		  
	  }		
	  B b = new B();
	  b.run();
	  
	  
	  //람다식으로 실행하고싶은 코드 !!!
	  Runnable r3 = () ->{		  
		  //실행하고 싶은 코드
		   for( int i=1; i<=9; i++) {
			   System.out.println( 5*i);
		   }		  
	  };
	  
	  r3.run();
	  

	}

}
