package day1.interfaceEx.myarrys;

import java.util.Arrays;
import java.util.Comparator;

public class ScoreTest3 {

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
				
		MyArrays.sort( list); 
		
		// 정렬 후 ===>
		System.out.println( "정렬 후  ====>");
		for( Score  score: list) {
			System.out.println( score);
		}
		
		//1.익명클래스
		MyArrays.sort(list,  new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score s1=  (Score) o1;
				Score s2 = (Score) o2;				
				return s1.kor -s2.kor;
			}});
		
		
		//2. 인터페이스를 구현한 클래스를 작성하고 사용
		class ComparatorImp implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				Score s1=  (Score) o1;
				Score s2 = (Score) o2;				
				return s1.kor -s2.kor;
			}			
		}
		MyArrays.sort(list,  new ComparatorImp());
		
		

		// 정렬 후 ===>
		System.out.println( "정렬 후  ====>");
		for( Score  score: list) {
			System.out.println( score);
		}
		

	}

}
