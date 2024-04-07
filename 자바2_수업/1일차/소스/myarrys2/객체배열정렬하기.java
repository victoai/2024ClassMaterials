package day1.interfaceEx.myarrys2;

import java.util.Arrays;

public class 객체배열정렬하기 {

	public static void main(String[] args) {
		
		Score0[] arr = new Score0[3];		
		arr[0]= new Score0("이길동",90,71);
		arr[1]= new Score0("김길동",70,99);
		arr[2]= new Score0("박길동",90,89);
 
		
		// 배열 정렬해줘 !! 라이브러리 사용하려고 한다
		Arrays.sort(arr);
		
		// Score0 cannot be cast to class java.lang.Comparable 오류를 만나다
		// 왜?
		// 그럼 어떻게 해야 하는가?
		
		//Arrays.sort(Object[] arr)	 이해하기 위해서
		 //MyArrays.sort( Object[] arr) 만들면서  동작원리를 이해한다
		
		
		
		//정렬방법은 라이브러리를 만든 사람들이 정말 좋은 알고리즘으로 구현할 수 있다.
		//그러나 객체비교는 어떻게 할지는 미리 결정해서 사용할 수 없다
		// (객체의 어떤 변수가 있을 지 그 많은 값들 중에서 무엇으로 정렬하고 싶은지를 알 수가 있을까 ? )
		//  ==> 없다  (생각타입) 
		
		
		// 라이브러리를 만든사람들은 인터페이스를 둔다
		// Interface Comparable{
		//      int compareTo( Object o );
	   //  }
		
		
	   // 이 인터페이스를 기반으로 정렬기능을 마무리 할 수 있다.
		// MyArrays.sort 구경하기
		

	}

}
