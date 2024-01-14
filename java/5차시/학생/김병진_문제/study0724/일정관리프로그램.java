package study0724;

import java.util.Scanner;

public class 일정관리프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일정관리 프로그램 ( 1.등록, 2.조회, 3.변경, 4.삭제 )
		
		
		Scanner sc = new Scanner(System.in);
	
		
		loop:while(true){
			System.out.print("1.등록, 2.조회, 3.변경, 4.삭제  0. 종료 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("등록");
				break;
			case 2:
				System.out.println("조회");
				break;
			case 3:
				System.out.println("변경");
				break;
			case 4:
				System.out.println("삭제");
				break;
			case 0:
				System.out.println("종료");
				break loop;
			}
		}
	}

}
