package java_day4.quiz;

import java.util.Scanner;

public class Java_4일정관리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch
		// while , for 반복문에서 break;
		// 자신이 속한 반복문 빠져나옴
		// 1-10까지합

		Scanner sc =new Scanner (System.in);
		
		int menu;
		
			menu=sc.nextInt();
			System.out.println("선택 1.등록 2.조회 3.변경 4.삭제 5.종료 나머지 error");
			
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
				System.out.println("error");
			}
			
		}
		

	}


