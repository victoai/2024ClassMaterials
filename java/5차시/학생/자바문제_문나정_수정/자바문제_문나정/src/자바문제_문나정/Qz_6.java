package 자바문제_문나정;
import java.util.Scanner;
public class Qz_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		for(int i=0; i<10; i++) {
			System.out.printf("수를 입력하세요 ");
			num = sc.nextInt();
			if(num%2==1)continue;
			sum+=num;
		}
		System.out.println("짝수의 합: "+sum);
	}

}
