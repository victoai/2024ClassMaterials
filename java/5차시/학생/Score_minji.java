package day5;

import java.util.Scanner;

public class Score_minji {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int avg=0;
		int kor_avg=0;
		int eng_avg=0;
		int math_avg=0;
		
		int sum=0;
		int kor_sum=0;
		int eng_sum=0;
		int math_sum=0;
		
		final int MAX=3;
		final int SUBJECT=3;
		
		int i=1;
		while(i<=MAX) {
			System.out.println("이름, 국어점수, 영어점수, 수학점수 입력");
			String name=sc.next();
			int kor=sc.nextInt();
			int eng=sc.nextInt();
			int math=sc.nextInt();
			
			sum=kor+eng+math;
			avg=sum/SUBJECT;
			
			kor_sum=kor_sum+kor;
			eng_sum=eng_sum+eng;
			math_sum=math_sum+math;
			
			if(avg>=90) {
				System.out.println(name);
				System.out.println(kor);
				System.out.println(eng);
				System.out.println(math);
				System.out.println("평균");
				System.out.println(avg);
				System.out.println("Excellent");
			}else if(avg<60) {
				System.out.println(name);
				System.out.println(kor);
				System.out.println(eng);
				System.out.println(math);
				System.out.println("평균");
				System.out.println(avg);
				System.out.println("Fail");
			}else {
				System.out.println(name);
				System.out.println(kor);
				System.out.println(eng);
				System.out.println(math);
				System.out.println("평균");
				System.out.println(avg);
			}
			i++;
		}
		
		kor_avg=kor_sum/MAX;
		eng_avg=eng_sum/MAX;
		math_avg=math_sum/MAX;
		
		System.out.println("국어평균, 영어평균, 수학평균");
		System.out.println(kor_avg);
		System.out.println(eng_avg);
		System.out.println(math_avg);
	}

}
