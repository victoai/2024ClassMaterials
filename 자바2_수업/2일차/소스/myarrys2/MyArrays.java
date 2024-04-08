package day1.interfaceEx.myarrys2;


//Arrays를 간단하게 구현하였다.


public class MyArrays {
	
	public static   void  sort (Object[]  arr) {		
		for( int i=0 ; i< arr.length-1 ; i++) {
			for( int j=i+1 ; j< arr.length ;j++) {
				
				MyComparable  m =(MyComparable)arr[i];  // MyComparable로 형변환을 해야 compareTo 매서드를 사용할 수 있다.
				if( m.compareTo(arr[j]) >0) {
					Object tmp;
					tmp= arr[i];
					arr[i] = arr[j];
					arr[j]=tmp;
				}
			}
		}
		
	}
	
	
	
	//정렬기능 (이것을 먼저 테스트해 본다) 
	
	public static   void  sort (Object[]  arr , MyComparator c ) {		  // c가 인터페이스라면 인터페이스를 구현한 객체를 매개변수로 받겠다는 의미
		for( int i=0 ; i< arr.length-1 ; i++) {
			for( int j=i+1 ; j< arr.length ;j++) {
				
			 // 두 객체를 비교한 값이 양수이면 정렬을 수행하겠다.  
				if( c.compare(arr[i], arr[j]) >0) {
					Object tmp;
					tmp= arr[i];
					arr[i] = arr[j];
					arr[j]=tmp;
				}
			}
		}
		
	}

}
