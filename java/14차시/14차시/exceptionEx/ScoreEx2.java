package prjDay12;

public class ScoreEx2 {

	public static void main(String[] args) {
		 
		
		//성적관리 프로그램 
		
		Score[]  list = new Score[3];  // 참조형변수 5개
		list[0]= new Score( "홍학생", 100,90,70);
		list[1]= new Score( "김학생", 90,90,70);
		list[2]= new Score( "박학생", 80,90,70);
		
		
		System.out.println(   list[0]);  // list[0].toString()
		System.out.println(   list[1]);  // list[1].toString()
		System.out.println(   list[2]);  // list[2].toString()
		
		for( int i=0;  i< list.length; i++) {
			System.out.println( list[i]);
		}		

	}

}
