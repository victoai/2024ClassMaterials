package MyArrays;

import java.util.Comparator;

public class MyArraysTest {

	public static void main(String[] args) {

		Score2[] arr = new Score2[3];		
		arr[0]= new Score2("이길동",90,71);
		arr[1]= new Score2("김길동",70,99);
		arr[2]= new Score2("박길동",90,89);
		
		
		MyArrays.sort( arr);
		System.out.println( "정렬 후 ==>");
		
		for( int i=0 ;  i< arr.length ; i++ ) {
			System.out.println(  arr[i]);
		} 
		
		
		
		
		MyArrays.sort(arr, new MyComparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Score2 s1 =(Score2) o1;
				Score2 s2 = (Score2) o2;
				
				return s1.getEng()- s2.getEng();
			}});
		
		
		
		
		System.out.println( "정렬 후 ==>");
		
		for( int i=0 ;  i< arr.length ; i++ ) {
			System.out.println(  arr[i]);
		} 
		
	}

}
