package java2.day3.stream;

import java.util.stream.IntStream;

public class Test5 {

	public static void main(String[] args) {	
		
		//3개 건너뛰기		
		IntStream intStream = IntStream.range(1, 10); // 1 ~ 10의 요소를 가진 스트림
		intStream.skip(3).limit(5).forEach(  num ->System.out.println( num)); // 45678
		
		System.out.println("=========================>");
		
		
		//중복된 것 제거 
		IntStream intStream2 = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
		intStream2.distinct().forEach( num ->System.out.println( num));
		
		
		//filter로 조건에 맞는것만 선택 		
		System.out.println("=========================>");
		IntStream intStream3 = IntStream.range(1, 10); // 1 ~ 10의 요소를 가진 스트림
		intStream3.filter(i -> i % 2 == 0).forEach( num ->System.out.println( num));
		
		
		
	}

}
