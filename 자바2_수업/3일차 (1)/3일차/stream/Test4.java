package java2.day3.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Test4 {

	
	public static void main(String[] args) {
	
		/* 
		
		HashSet<Integer> lottos = new HashSet<>();
		Random r= new Random();		 
		
		for( int i=0; i< 20; i++) {
			lottos.add( r.nextInt(46));
		}		
		System.out.println( " size= " + lottos.size());		
		
		Object[] lottoArr =   lottos.toArray();
		
		Integer[] result  = new Integer[6];		
		System.arraycopy(lottoArr, 0, result, 0, 6);
				
		
		for( Integer lotto: result) {
			System.out.print( lotto + " ,");
		}	
		
		*/		
		IntStream stream  = new Random().ints( 1 ,46);		
		stream.distinct().limit(6).sorted().forEach( lotto -> System.out.print( lotto  + ", "));
		

	}

}
