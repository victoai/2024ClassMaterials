package MyArrays;

import java.util.Arrays;

public class 객체정렬배우기 {

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
		 //1. 객체배열을 직접하기 
		 //2. MyArrays.sort( Object[] arr) 만들면서  동작원리를 이해한다		
		
		
		//정렬기능은 어떻게 구현될까? 생각해보기
		//정렬방법(알고리즘 선택정렬, 퀵정렬, 삽입정렬 ...) 은 라이브러리를 만든 사람들이 정말 좋은 알고리즘으로 구현할 수 있다.
		//그러나 객체비교는 어떻게 할지는 미리 결정해서 사용할 수 없다
		// (객체의 어떤 변수가 있을 지 그 많은 값들 중에서 무엇으로 정렬하고 싶은지를 알 수가 있을까 ? )
		//  ==> 없다  (생각하기) 
		
		
		//해결책  => interface (약속으로 정하기, 라이브러리만드는 사람   < ->  라이브러리 사용하는 사람 사이의 약속 
		// 라이브러리를 만든사람들은 인터페이스를 둔다
		// interface Comparable{
		//      int compareTo( Object o );     // 자신과 다른객체 비교한 후 자신이 크면 양수 다른객체가 크면 음슈를 반환하게 한다.
	   //  }
		
		
	    // 이 인터페이스를 기반으로 정렬기능을 마무리 할 수 있다.
		// MyArrays.sort 구경하기
		
		
		/*
		Sorts the specified array of objects into ascending order, accordingto the natural ordering of its elements.All elements in the array must implement the Comparableinterface. Furthermore, all elements in the array must be mutually comparable (that is, e1.compareTo(e2) mustnot throw a ClassCastException for any elements e1and e2 in the array). 
	  	해당 요소의 자연스러운 순서에 따라 지정된 개체 배열을 오름차순으로 정렬합니다. 배열의 모든 요소는 Comparable 인터페이스를 구현해야 합니다. 또한 배열의 모든 요소는 상호 비교 가능해야 합니다(즉, e1.compareTo(e2)는 배열의 모든 요소 e1 및 e2에 대해 ClassCastException을 발생시키지 않아야 합니다).
		*/

	}

}
