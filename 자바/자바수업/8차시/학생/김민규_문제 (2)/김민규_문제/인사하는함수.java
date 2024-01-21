package java_day7;

import java.util.Scanner;

public class 인사하는함수 {
	public static void main(String[] args) {		
		//0~34 사이의 난수를 만드는 코드 		
		// Math.random();  0~ 1이 안되는 임의의 실수를 반환함
		// 이 값을 이용하여 일정범위의 난수를 만들수 있음 		
     
		
	


        randomHello();

    }

	public static void randomHello( ) {
		int randomNumber = (int) (Math.random() * 2);
		if (randomNumber == 0) {
            System.out.println("ㅎㅇ");
        } else if (randomNumber == 1) {
            System.out.println("ㅂ2");
        }
	}
}