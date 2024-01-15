package week04.day3.MyArrays;

public class MyArrays {
	
	public static   void  sort (Object[]  arr) {		
		for( int i=0 ; i< arr.length-1 ; i++) {
			for( int j=i+1 ; j< arr.length ;j++) {
				
				MyComparable  m =(MyComparable)arr[i];
				if( m.compareTo(arr[j]) >0) {
					Object tmp;
					tmp= arr[i];
					arr[i] = arr[j];
					arr[j]=tmp;
				}
			}
		}
		
	}

}
