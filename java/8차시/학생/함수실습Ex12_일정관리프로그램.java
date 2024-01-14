package day0727;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 함수실습Ex12_일정관리프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴 : 1.등록, 2.조회, 3.변경, 4.삭제, 5.종료");
		int menu; 
		
		String[] reg = new String[10];
		int reg_cnt = 0;
		
		loop : while(true) {
			menu = sc. nextInt();
			switch(menu) {
			case 1 : 
				System.out.println("일정을 등록하세요.");
				reg[reg_cnt] = sc.next();
				reg_cnt++;
				break;
			case 2 : 
				System.out.println("일정을 조회합니다.");
				for(int i=0; i<reg_cnt; i++) {
					System.out.println(i+1 + "." + reg[i]);
				}
				break;
			case 3 : 
				System.out.println("일정을 변경하세요.");
				for(int i=0; i<reg_cnt; i++) {
					System.out.println(i+1 + "." + reg[i]);
				}
				int num = sc.nextInt();
				reg[num-1]=sc.next();
				break;
			case 4 : 
				System.out.println("일정을 삭제하세요.");
				for(int i=0; i<reg_cnt; i++) {
					System.out.println(i+1 + "." + reg[i]);
				}
				int num1 = sc.nextInt();
				reg_cnt--;
				break;
			case 5 : 
				System.out.println("종료");
				break loop;
			default :
				System.out.println("잘못된 입력입니다.");
				break;
		}
		
				
			
		}

	}
}