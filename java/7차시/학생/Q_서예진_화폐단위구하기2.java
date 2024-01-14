package day7;

import java.util.Scanner;

public class Q_서예진_화폐단위구하기2 {

	public static void main(String[] args) {
		
		System.out.println("출장비 입력");
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int rem=money;
		
		int money1 = rem/50000;
		rem=rem-(50000*money1);
		//System.out.println(rem); //15000
		//System.out.println(money1); //7
		
		int money2 = rem/10000;
		rem= rem-(10000*money2);
		//System.out.println(rem);
		//System.out.println(money2);
		
		int money3 = rem/5000;
		rem= rem-(5000*money3);
		
		int money4 = rem/1000;
		rem=rem-(1000*money4);
		
		int money5 = rem/500;
		rem=rem-(500*money5);
		
		int money6 = rem/100;
		rem=rem-(100*money6);
		
		int money7 = rem/50;
		rem=rem-(50*money7);
		 
		int money8 = rem/10;
		rem=rem-(10*money8);
		
		System.out.println("50000=>"+money1+" 10000=>"+money2+" 5000=>"+money3+" 1000=>"+money4+" 500=>"+money5+" 100=>"+money6+" 50=>"+money7+" 10=>"+money8);
		
		
		
				
		

	}

}
