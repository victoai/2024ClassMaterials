package day5;

import java.util.Scanner;

import algo.day3.if문;

public class Test11 {

	public static void main(String[] args) {
/* 11. 주차정산 프로그램을 만들어보세요
주차요금은 시간당 3천원이고 최대 3만원까지입니다.
일반 차량을 제외한 경차나 장애인 차량은 최종금액에서 50% 할인합니다.
 */
	System.out.println("차량 종류와 주차시간을 입력하세요. 1(일반차량) 2(경차) 3(장애인)");
	
	Scanner sc = new Scanner(System.in);
	
	final int price = 3000;
	final double dc = 0.5;
	int kind = sc.nextInt();
	int time = sc.nextInt();
	double total = 0;
	
	//할인이 적용된 금액을 구한다
	if(kind==1) {
		total = time * price;
	}else if(kind==2) {
		total = time * price * dc;
	}else if(kind==3) {
		total = time * price * dc;
	}
	
	if(total>=30000) {
		total=30000;	
	}
	
	if(kind==1) {
		System.out.println("총 " + time + "시간 주차했고 " + total + "입니다.");
	}else if(kind==2) {
		System.out.println("총 " + time + "시간 주차했고 " + total * dc + "입니다.");
	}else if(kind==3){
		System.out.println("총 " + time + "시간 주차했고 " + total * dc + "입니다.");
	}else {
		System.out.println("3종류의 차량 중 선택해주세요");
	}
	sc.close();
	
	}

}
