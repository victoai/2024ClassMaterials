package week03.day2;

import java.util.Scanner;

public class MonthSchedule {
	
		Day day = new Day();       // 무조건 한개 생성
		Scanner sc = new Scanner(System.in);
		
		
		
		public MonthSchedule() {
		}
		/*
		public MonthSchedule(String work) {
			work = day.getWork();
		}
		
		public MonthSchedule(int i) {
			MonthSchedule[] arr = new MonthSchedule[i];
		}
		*/
		
		
		public void input() {                                 // input();   // 일정등록, Day 객체생성, Scanner 사용
			System.out.println("등록합니다");
			day.setWork(sc.next());
		}
		
		
		
		public void view() {                                  // view();    // 일정보기
			System.out.println("출력합니다");
			day.show();
			
		}
		public void finish() {                                // finish();  // System.exit(0);   // 종료
			System.out.println("종료합니다");
			System.exit(0);
		}
		
		
		
		public void run() {                                  // run();	  // 메뉴보기 기능
			
			while(true) {
			System.out.println("메뉴 : 1.등록  2.조회  3.종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : input();
			break;
			case 2 : view();
			break;
			case 3 : finish();
			}
			}
			
		}
		
		
	public static void main(String[] args) {
		
		// 배열
		/*
		MonthSchedule m = new MonthSchedule(30);
		m.run(30);
		*/
		
		
		
		//배열사용안함
		
		MonthSchedule m = new MonthSchedule();
		m.run();
		
		
		
		
		
		
	}

}
