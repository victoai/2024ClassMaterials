package day5;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
// 4. 일정관리 프로그램 만들기 (1번) (1.등록, 2.조회, 3.변경, 4.삭제)
		System.out.println("메뉴 : 1. 등록  2. 조회  3. 변경  4. 삭제");
		Scanner sc = new Scanner(System.in);
		int menu;
		
		menu=sc.nextInt();
		
		switch (menu) {
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
		default:
			System.out.println("1~4 중에서 입력하세요");
			break;
		}
		sc.close();
		}
	}
