package day7;

import java.util.Scanner;

public class Q3_2 {

	public static void main(String[] args) {
		//토글 사용
		int [] m=new int[8];	 
		int a = 0;
		int b = 50000;
		int c = 0;
		
		System.out.println("금액을 적어주세요.");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		for(int i=0; i<m.length; i++) {
			m[i]=a/b;
			a%=b;
			System.out.print(b+"원권 ");
			System.out.println(m[i]+"개");
			if(c==0) {
				b/=5;
				c++;
			}else {
				b/=2;
				c--;
			}
		}
		
	}

}
