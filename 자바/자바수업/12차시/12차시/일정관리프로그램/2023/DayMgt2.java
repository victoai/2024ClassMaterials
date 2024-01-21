package prjDay13;

import java.util.Scanner;

public class DayMgt2 {
	Day[] days  ;
	int index=0;		
	public DayMgt2() {
		days  = new Day[10];
	}	
	//일정등록	
	public void reg() {
		Scanner sc = new Scanner(System.in);
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
		reg();
		reg();		
		list();		
		
	}
	
	public static void main(String[] args) {
		DayMgt2  mgt = new DayMgt2();
		mgt.run();	 
	}

}
