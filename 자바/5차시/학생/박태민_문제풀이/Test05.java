package day5;

import java.util.Scanner;

import algo.day3.if문;

public class Test05 {

	public static void main(String[] args) {
// 5. 일정관리 프로그램 만들기 (반복)
		System.out.println("메뉴 : 1. 등록  2. 조회  3. 변경  4. 삭제");
		Scanner sc = new Scanner(System.in);
		int menu;
		int i=0;
		
		while(i<5) {
			menu=sc.nextInt();
			switch (menu) { 
				case 1:
					System.out.println("등록 선택");
					break;
				case 2:	
					System.out.println("조회 선택");
					break;
				case 3:
					System.out.println("변경 선택");
					break;
				case 4:
					System.out.println("삭제 선택");
					break;
				default:
					System.out.println("1~4 중에서 입력하세요");
					break;
			}i++;
		}
		sc.close();
	}

}
