package week04.day2.ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		 
		
		//3개만 학생정보를 입력 받아서 출력  
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		
		for( int i =0 ; i<3; i++) {
			System.out.println("이름 국어 영어");
			String name =sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();		
			list.add(  new Score( name, kor, eng));			
		}
		
		//
		
		for(  int i=0; i<list.size(); i++) {
			System.out.println( list.get(i));
			//System.out.println( list.get(i).toString());
		}

	}

}
