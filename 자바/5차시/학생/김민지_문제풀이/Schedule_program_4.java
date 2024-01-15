package day5;

import java.util.Scanner;

public class Schedule_program_4 {

	public static void main(String[] args) {
		
		System.out.println("1.등록 2.조회 3.변경 4.삭제");
		Scanner sc=new Scanner(System.in);
		
		int schedule= sc.nextInt();
		
		switch(schedule) {
			case 1:
				System.out.println("스케줄을 등록합니다");
				break;
			case 2:
				System.out.println("스케줄을 조회합니다");
				break;
			case 3:
				System.out.println("스케줄을 변경합니다");
				break;
			case 4:
				System.out.println("스케줄을 삭제합니다");
				break;
			default:
				System.out.println("잘못된 값을 입력하였습니다");
		}
		
		
	}

}
