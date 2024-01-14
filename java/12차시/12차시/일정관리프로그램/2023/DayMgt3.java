package prjDay13;

import java.util.Scanner;

public class DayMgt3 {
	Day[] days  ;
	int index=0;
	Scanner sc = new Scanner(System.in);
	public DayMgt3() {
		days  = new Day[10];
	}	
	//일정등록	
	public void reg() {
		
		//날짜, 일정내용 등록하세요
		String date;
		String title;
		date =sc.nextLine();
		title = sc.nextLine();
		days[index] =  new Day( date, title);	
		index++;
	}
	
	public void list() {	    
		for( int i=0 ; i< index ; i++) {
			System.out.println( days[i].toString());
		}
	} 	
	
	public void run() {		
		  //실행
		//reg();
		//reg();		
		//list();
		
		loop:while(true) {			
			System.out.println(" 메뉴를 선택하세요  1.  등록  2. 조회  3. 종료");
			int menu = Integer.parseInt(sc.nextLine());   //   "2"  ->  2			
			
			switch( menu) {
			case 1:
				System.out.println("등록");
				reg();
				break;
			case 2:
				System.out.println("조회");
				list();
				break;
			case 3: 
				System.out.println("종료");
				break loop;
			default:
				System.out.println("잘못메뉴");
			} 
			
		}
		
		
	}
	
	public static void main(String[] args) {
		DayMgt3  mgt = new DayMgt3();
		mgt.run();	 
	}

}
