package day3.day3.lamda복습;



/* 
 SubInterface를 각 3가지 방법으로 구현하고 실행하시오

 1. 이름이 있는 클래스를 만들고 실행하기 
 2. 익명객체를 만들고 실행하기
 3. 람다식으로 만들고 실행하기
*/


interface SubInterface{
	int sub( int su1, int su2);
}


public class 문제 { 
	
	public static void main(String[] args) {
		
		
		class SubImp  implements SubInterface{

			@Override
			public int sub(int su1, int su2) {
				// TODO Auto-generated method stub
				return  su1-su2;
			}
			
		}
		
		
		
		SubImp obj = new SubImp();
		int result =obj.sub(5, 3);
		
		
		
		//
		SubInterface obj2 = new SubInterface() {

			@Override
			public int sub(int su1, int su2) {			 
				return su1-su2;
			}};
	 
			
		int result2= obj2.sub(5, 3);
		
		
		
		//람다식
		//구현할 명령이 한 줄 인경우  {  } 중괄호 블럭을 생략할 수 있다. 이때  return도 같이 생략해야 한다
		
		SubInterface obj3  = ( su1, su2) -> su1-su2;


		SubInterface obj4 =  ( su1, su2) ->  {
			
			return su1-su2;
		};

	}

}
