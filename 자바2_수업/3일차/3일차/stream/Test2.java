package java2.day3.stream;

 

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*lotto 번호 뽑기*/
		
		 //스트림 사용하기
         IntStream s = new Random().ints(1,46);
		 s.distinct().limit(6).sorted().forEach( x->System.out.print(x + "  ,"));		 
		  
		 
		 
		 //스트림 사용하지 않기
		 HashSet<Integer> lottos = new HashSet<Integer>();	  
		 Random r = new Random();
		 
		 //중복제거를 위해 set에 저장 , 같은건 두 번 저장되지 않음
		 for( int  i=0; i< 20; i++) {		  
			  lottos.add(  r.nextInt(46));
		 }
		 
		 System.out.println("size=" + lottos.size());
		 
		 Object[] lottosArry= lottos.toArray();
		 
		 Integer[] result= new Integer[6];  // 배열카피	  
		 
		 System.arraycopy(lottosArry, 0, result, 0, 6);  
		 
		 for( int  i=0 ; i< result.length ;i++ ) {
			  System.out.print( result[i] + ",");
		 }
		 

	}

}
