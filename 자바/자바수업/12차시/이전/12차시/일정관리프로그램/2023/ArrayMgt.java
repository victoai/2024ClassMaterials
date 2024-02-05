package prjDay13;

import java.util.ArrayList;

public class ArrayMgt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String>  days = new ArrayList<>();
		
		//일정등록
		
		days.add("학습모듈 시험준비1");
		days.add("학습모듈 시험준비2");
		days.add("학습모듈 시험준비2");
			
		
		//일정조회
		
		for(int i=0 ; i< days.size();i++) {
			System.out.println( days.get(i));
		}
		
		for( String day : days) {
			System.out.println( day);
		}
		
		
		//일정변경
		
		//2
	   String   day  = days.get(1);
	   day="애플리케이션배포학습모듈";
		

	   //삭제 
	   //
	   days.remove(1);
	   
	   
	}

}
