package 자바문제_문나정;
import java.util.Scanner;
public class Qz_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		loop: while(true) {
			System.out.printf("숫자를 입력하세요. (-1입력시 종료됩니다.)");
			num = sc.nextInt();
			if(num==-1) break loop;
			sum += num;
			
		}
		System.out.println("입력값의 합: "+sum);

	}

}
