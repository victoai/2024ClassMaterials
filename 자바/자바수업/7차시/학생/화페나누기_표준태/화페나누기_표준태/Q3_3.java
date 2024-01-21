package day7;

import java.util.Scanner;

public class Q3_3 {

	public static void main(String[] args) {
		//배열 이용
		int [] m= new int[8];
		int [] u= {50000,10000,5000,1000,500,100,50,10};	
		int a = 0;
		
		System.out.println("금액을 적어주세요.");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		for(int i=0; i<m.length; i++) {
			m[i]=a/u[i];
			a%=u[i];
			System.out.print(u[i]+"원권 ");
			System.out.println(m[i]+"개");
		}
		
	}

}
