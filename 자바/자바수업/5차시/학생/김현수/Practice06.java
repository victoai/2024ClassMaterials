package day04;

import java.util.Scanner;

public class Practice06 {
	
	public static void main(String[] args) {
		int num;
		int sum=0;
		int cnt=0;
		
		while(cnt<10) {
			
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			if(num%2==0) {
				sum += num;
				cnt++;
			} else {
				cnt++;
				continue;
			}
			
		}
		System.out.println(sum);
	}

}
