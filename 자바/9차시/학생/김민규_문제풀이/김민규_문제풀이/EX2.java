package java_day8_class자료형;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		James j = new James();
		j.age = 40;
		j.name= "james";
		j.isMarried = true;
		j.children = 3;
		
		Shopping sp = new Shopping();
		
		sp.num = "201803120001";
		sp.id = "abc123";
		sp.name = "홍길순";
		sp.item_Num = "😛D0345-12";
		sp.item_Adress = " 서울시 영등포구 여의도동 20번지";
				
		Score score = new Score();
		System.out.println("이름입력");
		

		score.name= sc.nextLine();
		System.out.println("국어 점수 ");
		score.kor = sc.nextInt();
		System.out.println("영어 점수 ");
		score.eng = sc.nextInt();
		System.out.println("평균 점수 ");
		score.avg = ((score.kor+score.eng)/2);
		
		
		System.out.println("나마에 " + score.name);
		System.out.println("국어 점수 " + score.kor);
		System.out.println("영어 점수 " + score.eng);
		System.out.println("평균 점수 " + score.avg);
	}
	
	
	
	
	
}
