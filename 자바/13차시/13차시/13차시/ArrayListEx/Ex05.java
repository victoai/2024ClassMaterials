package week04.day2.ArrayListEx;

import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {

		
		ArrayList<Score> list = new ArrayList<>();
		
		//등록
		list.add(new Score("hong",100,100));
		list.add(new Score("kim",90,99));
		list.add(new Score("lee",88,100));
		 
		System.out.println( "삭제 전 ==>");
		for( int i=0; i< list.size() ; i++) {
			//list.get(i).printInfo();
			System.out.println( list.get(i).toString());
		}
		//변경
		Score  s=list.get(1);
		s.setEng(88);		
		
		for( int i=0; i< list.size() ; i++) {
			//list.get(i).printInfo();
			System.out.println( list.get(i).toString());
		}
		
		
		 list.remove(0);	 
		System.out.println( "삭제 후 ==>");
		for( int i=0; i< list.size() ; i++) {
			//list.get(i).printInfo();
			System.out.println( list.get(i).toString());
		}

	}

}
