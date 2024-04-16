package day5.interfaceEx.학생.이정훈;

public class LibAEx  implements SomethingDoI{

		public static void main(String[] args) {			
			// 객체 생성 
			LibA a = new LibA();
			//
			a.forStart();
			
			//
			a.forCharactier('★');
			
			
			//  (   ); 
			a.forSomethingDo( new LibAEx());
			a.forSomethingDo(  new B() );
			
			
			
			
		}	
		

		@Override
		public void doing() {
			for(int i=0; i<5;i++) {
				System.out.println("안녕");
			}
		}
		
}
class B  implements SomethingDoI{
	@Override
	public void doing() {
		System.out.println("△");		
	}	
}
