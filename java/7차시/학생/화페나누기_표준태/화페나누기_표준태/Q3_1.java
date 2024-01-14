package day7;

import java.util.Scanner;

public class Q3_1 {

	public static void main(String[] args) {
		//한번에 두번씩
		int [] m=new int[8];	 
		int a = 0;
		int b = 50000;
		
		System.out.println("금액을 적어주세요.");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		for(int i=0; i<m.length; i++) {
			m[i]=a/b;
			a%=b;
			System.out.print(b+"원권 ");
			b/=5;
			System.out.println(m[i]+"개");
			i++;
			m[i]=a/b;
			a%=b;
			System.out.print(b+"원권 ");
			b/=2;
			System.out.println(m[i]+"개");
		}
		
	}

}
