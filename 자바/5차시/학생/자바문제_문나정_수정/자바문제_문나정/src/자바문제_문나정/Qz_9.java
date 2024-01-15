package 자바문제_문나정;
import java.util.Scanner;
public class Qz_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 단을 입력하세요: ");
		num = sc.nextInt();
		System.out.println(num+"단 출력");
		for(int i=1; i<=9; i++) {
		    System.out.println(num +" * "+i+" = "+num*i);
			
		}
		
	}

}
