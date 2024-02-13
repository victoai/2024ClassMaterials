package 복습및정리.배열;

import java.util.ArrayList;

public class 객체배열2 {

	public static void main(String[] args) {
		  
		
		ArrayList<Score> list  = new ArrayList<>();

		list.add( new Score("장주원" , 100, 100));
		list.add( new Score("이미현" , 99, 80));
		list.add(new Score("김두식" , 80, 70));		
		 
		
		//향상된 for문
		for( Score s : list) {			
			System.out.println(s);
		}
		
		
		//list.size사용하여 출력하기 

	}

}
