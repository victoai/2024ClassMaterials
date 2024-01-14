package score;

import java.util.ArrayList;

public class ScoreTest {

	public static void main(String[] args) {
		
		
		ArrayList<Score> list = new ArrayList<>();
		
		
		list.add(new Score( "다길동",100,90,100));
		list.add(new Score( "홍길동",100,90,100));
		list.add(new Score( "나길동",100,90,100));
		list.add(new Score( "최길동",100,90,100));
		list.add(new Score( "강길동",100,90,100));
		
		
		
		
		
		
		//삭제
		// 원하는 순번 삭제하기
	    int index=0;
	 	list.remove(index);
		
		
		//나길동 삭제
		
		String searchName = "나길동";
		
		for( int i=0; i< list.size(); i++){
			 if( list.get(i).getName().equals(searchName)){			 
				 list.remove(i);
			 }			
		}
		
		
		
		
	 //전체조회
		
		
		
		
	//강길동 성적 조회
		
		searchName = "강길동";		
		for( int i=0; i< list.size(); i++){
			 if( list.get(i).getName().equals(searchName)){			 
				 System.out.println("검색한 학생 성적 ==> :"+  list.get(i));
			 }	
		}
		
		
		
		//전체 조회		
		System.out.println("검색한 학생 성적 ========= ");
		for( Score s: list){			
			System.out.println( s);
		}

	}

}
