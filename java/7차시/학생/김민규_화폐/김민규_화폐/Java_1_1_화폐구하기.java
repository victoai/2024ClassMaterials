package java_day6;

import java.util.Scanner;

public class Java_1_1_화폐구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//화폐단위 50000 10000 5000 1000 500 100 50 10
		/* 
		 * 고액권부터 화폐매수 구하기
		예시)325100 -> 6 2 10 0 1 0 0 
		출장비가 입력될대 고액권부터 매수 구하기
		
		화폐단위배열 사용가능함
		화폐를 구하는 방식으로 해결가능
		화폐단위50000으로 시작해서 /5 /2방식으로 구해질수있다.
		 * */
		
		int [] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int [] moneyArrMain = new int [moneyArr.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("출장비입력: ");
		int money = sc.nextInt();	
		
		for(int i = 0 ; i <moneyArr.length; i++ ) {
			moneyArrMain[i]= money / moneyArr[i];
			money %= moneyArr[i];
		}
		
        System.out.print("돈 매수 구하기: ");
        for(int i=0 ; i < moneyArrMain.length; i++) {
            System.out.print(moneyArrMain[i] + " ");
        }
	}

}
