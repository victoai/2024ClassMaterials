package java_day9_classType;

import java.util.Scanner;

public class mile_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("마일을 입력하세요 자동으로 km로 변환됩니다.");
		Scanner sc = new Scanner(System.in);
		int mile = sc.nextInt();
		mile ab = null;
		ab = new mile();
		
		
		ab.calCulator(mile);
		
		
	
		System.out.println(ab.kiloMeter + "km");
	
	
		
	}

	
}
