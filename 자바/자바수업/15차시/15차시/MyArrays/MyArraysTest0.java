package MyArrays;

import java.util.Comparator;

public class MyArraysTest0 {

	public static void main(String[] args) {
		Score0[] arr = new Score0[3];		
		arr[0]= new Score0("이길동",90,71);
		arr[1]= new Score0("김길동",70,99);
		arr[2]= new Score0("박길동",90,89);
 
		
		
		MyArrays.sort(arr, new MyComparator(){
			@Override
			public int compare(Object o1, Object o2) {
				Score0 s1 =(Score0) o1;
				Score0 s2 = (Score0) o2;
				
				return  s2.getEng()- s1.getEng();
			}});
		
		
		//
		System.out.println("<<<<영어점수를 기준으로 정렬하기>>>>");		
		for( int i=0 ;  i< arr.length ; i++ ) {
			System.out.println(  arr[i]);
		} 
		
	}

}
