package day3.day3.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamEx {

	public static void main(String[] args) {
		
		//IntStream => 기본형스트림
		//Stream<Integer> -> IntStream  (기본형일 경우 성능상 유리함 : 기본형스트림을 사용하는 이유 )
 
		
		 // 정수 배열로부터 IntStream 생성
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(numbers);

        // 범위를 지정하여 IntStream 생성
        IntStream stream2 = IntStream.range(1, 6); // 1부터 5까지의 범위

        // 기타 메소드를 이용한 IntStream 생성
        IntStream stream3 = IntStream.of(1, 2, 3, 4, 5); // 명시적으로 값 전달

	
        stream1.forEach( item  -> System.out.println( item));        
        stream2.filter( item -> item> 2 ).forEach( item -> System.out.println( item));
        
	
        
	
	}

}
