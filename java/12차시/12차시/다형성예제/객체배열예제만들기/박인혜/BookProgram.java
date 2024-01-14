package prjDay12;

import java.util.ArrayList;

public class BookProgram {
	

	public static void main(String[] args) {
		
		/*
		Book book = new Book ( "구해줘, " , "기욤 뮈소, " , " 2010년 09월 13일, " , 414 );
		System.out.println(book.toString());
		*/
		
		ArrayList<Book> list = new ArrayList<>();
		
		list.add( new Book ("'구해줘' " , "'기욤 뮈소' " , " '2010년 09월 13일' " , 414 ));
		list.add( new Book ("'용의자X의 헌신' " , "'히가시노 게이고' " , "'2017년 08월 30일 ' " , 448 ));
		list.add( new Book ("'파피용 ' " , "'베르나르 베르베르 ' " ,"'2013년 05월 30일 ' " , 790 ));
		list.add( new Book ("'1퍼센트 부자의 법칙' " ,"'사이토 히토리' " , "'2023년 01월 30일' " , 176 ));
		
		for ( int i=0; i< list.size(); i++ ) {
			System.out.println( list.get(i).toString());
		}
	}

}
