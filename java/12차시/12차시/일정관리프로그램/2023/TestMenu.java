package prjDay13;

import java.util.Scanner;

public class TestMenu {

	public static void main(String[] args) {		 
		Scanner sc = new Scanner(System.in);
		
		loop:while(true) {			
			System.out.println(" 메뉴를 선택하세요  1.  등록  2. 조회  3. 종료");
			int menu = Integer.parseInt(sc.nextLine());   //   "2"  ->  2			
			
			switch( menu) {
			case 1:
				System.out.println("등록");
				break;
			case 2:
				System.out.println("조회");
				break;
			case 3: 
				System.out.println("종료");
				break loop;
			default:
				System.out.println("잘못메뉴");
			} 
			
		}

	}

}
