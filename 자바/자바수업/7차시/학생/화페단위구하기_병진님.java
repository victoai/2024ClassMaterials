package javalang.day4;

import java.util.Scanner;

public class 화페단위구하기 {

	public static void main(String[] args) {
		// 고액권부터 화폐개수 구하기
		int num = 0;
		int[] result = new int[8]; //화폐 배열
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 = ");
		int money = sc.nextInt();
		
		money = money/10; //일원단위 없애기
		//금액판별
		while(money != 0) { 
			if((money/5000)!=0) {
				num = money/5000;
				money -= 5000*num;
				result[0] = num;
				System.out.printf("5만원 = %d장\n",num);
			}
			else if((money/1000)!=0) {
				num = money/1000;
				money -= 1000*num;
				result[1] = num;
				System.out.printf("1만원 = %d장\n",num);
			}
			else if((money/500)!=0) {
				num = money/500;
				money -= 500*num;
				result[2] = num;
				System.out.printf("5천원 = %d장\n",num);
			}
			else if((money/100)!=0) {
				num = money/100;
				money -= 100*num;
				result[3] = num;
				System.out.printf("1000원 = %d장\n",num);
			}
			else if((money/50)!=0) {
				num = money/50;
				money -= 50*num;
				result[4] = num;
				System.out.printf("500원 = %d개\n",num);
			}
			else if((money/10)!=0) {
				num = money/10;
				money -= 10*num;
				result[5] = num;
				System.out.printf("100원 = %d개\n",num);
			}
			else if((money/5)!=0) {
				num = money/5;
				money -= 5*num;
				result[6] = num;
				System.out.printf("50원 = %d개\n",num);
			}
			else if((money/1)!=0) {
				num = money/1;
				money -= 1*num;
				result[7] = num;
				System.out.printf("10원 = %d개\n",num);
			}
			else {
				break;
			}
		}
		
		//최종 배열 출력
		System.out.print("\n최종 배열 =");
		for(int i = 0; i<result.length; i++) {
			System.out.printf(" %d ", result[i]);
		}
	}

}
