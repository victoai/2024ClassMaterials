package java_day4.quiz;

import java.util.Scanner;

public class Java_2수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
       Scanner sc = new Scanner (System.in);
       
       int num = sc.nextInt();
       int sum = 0;
       
       for(int i=1; i<=num ; i++) {
    	   sum += i;
    	   
    	   System.out.println(sum);
    			   
       }
       
       
        
    }
}