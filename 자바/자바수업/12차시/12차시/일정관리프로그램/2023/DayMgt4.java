package prjDay13;

import java.util.Scanner;

public class DayMgt4 {
	Day[] days  ;
	int index=0;
	Scanner sc = new Scanner(System.in);
	public DayMgt4() {
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
			if(! days[i].getTitle().equals(""))   
			   System.out.println( days[i].toString());
		}
	} 	
	
	
	//변경
	public void update() {
		System.out.println("변경할 순서");
		int updateIndex =   Integer.parseInt(sc.nextLine());
		System.out.println("변경할 내용 입력");
		String tmpTitle = sc.nextLine();		
		days[updateIndex-1].setTitle(tmpTitle);		
	}
	
	
	
	//삭제
	public void delete() {
		System.out.println("삭제할 순서");
		int deleteIndex =   Integer.parseInt(sc.nextLine());
		days[deleteIndex-1].setTitle("");
	}
	
	public void run() {		
		  //실행
		//reg();
		//reg();		
		//list();
		
		loop:while(true) {			
			System.out.println(" 메뉴를 선택하세요  1.  등록  2. 조회  3. 종료   4.변경  5.삭제" );
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
			case 4: 
				System.out.println("변경");
				update();
				break ;
			case 5: 
				System.out.println("삭제");
				delete();			
			default:
				System.out.println("잘못메뉴");
			} 
			
		}
		
		
	}
	
	public static void main(String[] args) {
		DayMgt4  mgt = new DayMgt4();
		mgt.run();	 
	}

}
