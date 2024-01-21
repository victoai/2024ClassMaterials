package java_day6;

import java.util.Scanner;

public class Java_1_1_약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
        int[] yak = new int[20];
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력: ");
        num = sc.nextInt();


        int j = 0; // 배열시작 0...19
        for (int i = 1; i <= num; i++) {   //   i:  12  => 12/1  ~12/12   
            if (num % i == 0){//약수 구하는식 
                yak[j] = i; // i 가 배열에 들어가게함
                j++;	
            }
        }
        
        System.out.print(num + " : ");
        for (int i = 0; i < j; i++) {
            System.out.print(yak[i] + " ");
        }
        
    }
}