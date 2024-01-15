package week04.day3.MyArrays;

 

public class MyArraysTest {

	public static void main(String[] args) {

		Score[] arr = new Score[3];		
		arr[0]= new Score("이길동",90,100);
		arr[1]= new Score("김길동",70,99);
		arr[2]= new Score("박길동",90,89);
		MyArrays.sort( arr);
		
		
		for( int i=0 ;  i< arr.length ; i++ ) {
			System.out.println(  arr[i]);
		} 
		
		
		
	}

}
