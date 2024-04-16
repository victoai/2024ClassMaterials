package day5.interfaceEx;

public class LIbAEx {

	
	
	public static void main(String[] args) {
		 
		
		
		LibA   lib = new LibA();
		
		lib.forCharacter('?');
		
		//lib.forSomethingDo(   new SomethingDoI() {});
		 lib.forSomethingDo(   new SomethingDoI() {

			@Override
			public void doing() {
				System.out.println("코딩한다");
				
			}});
		 
		 
		 
		 //람다식 
		 //함수형인터페이스인경우 람다식을 사용가능함 
		 lib.forSomethingDo(  () ->System.out.println("코딩한다"));
		 
		 
		 
		 
		 
		 
		 class LibImp implements SomethingDoI{

			@Override
			public void doing() {
				System.out.println("<<코딩시작 >>");
				for( int i=1 ; i<= 3 ;i++) {
					System.out.println( i + "==>코딩하기");
				}				
			}			 
		 }	
		 
		 
		 ///
		 
		 
		 lib.forSomethingDo( new LibImp());
		 
		 
		 lib.forSomethingDo(  () ->System.out.println("휴식을 취한다"));
		 
		  

	}

}
