package day1.interfaceEx.myarrys;

import java.util.Arrays;

public class ScoreTest2 {

	public static void main(String[] args) {
		 
		
		Score[] list = new Score[4];
		
		list[0]= new Score(100,90);
		list[1]= new Score(80,99);
		list[2]= new Score(99,87);
		list[3]= new Score(70,60);		
		
		
		//객체배열 출력			
		for( Score  score: list) {
			System.out.println( score);
		}
				
		Arrays.sort( list);
		
		
		// 정렬 후 ===>
		System.out.println( "정렬 후  ====>");
		for( Score  score: list) {
			System.out.println( score);
		}

	}

}
