package algo.day4;
import java.util.Scanner;
public class Score_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int avg = 0;
		int kor_avg=0, eng_avg=0, math_avg=0;
		int sum=0;
		int kor_sum=0, eng_sum=0, math_sum=0;
		final int MAX = 3; 
		final int SUBJECT = 3;
		int kor, eng, math;
		String name;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<MAX; i++){
			System.out.printf("이름을 입력하시오 ");
			name= sc.next();
			System.out.printf("국어점수를 입력하시오 ");
			kor= sc.nextInt();
			System.out.printf("영어점수를 입력하시오 ");
			eng= sc.nextInt();
			System.out.printf("수학점수를 입력하시오 ");
			math= sc.nextInt();
			sum = kor+ eng+ math;
			
			avg = sum/ SUBJECT;
			
			kor_sum += kor;
			eng_sum += eng;
			math_sum += math;

			if(avg >= 90) {
				System.out.println("이름: "+name);
				System.out.println("국어점수: "+kor);
				System.out.println("영어점수: "+eng);
				System.out.println("수학점수: "+math);
				System.out.println("평균점수: "+avg);
				System.out.println("EXCELLENT");
				
			}
			else {
				if(avg<60){
					System.out.println("이름: "+name);
					System.out.println("국어점수: "+kor);
					System.out.println("영어점수: "+eng);
					System.out.println("수학점수: "+math);
					System.out.println("평균점수: "+avg);
					System.out.println("FAIL");
					
				}
				else{
					System.out.println("이름: "+name);
					System.out.println("국어점수: "+kor);
					System.out.println("영어점수: "+eng);
					System.out.println("수학점수: "+math);
					System.out.println("평균점수: "+avg);
				}
			}
		}
		System.out.println("=======================");
		System.out.println("국어평균: "+kor_sum/MAX);
		System.out.println("영어평균: "+eng_sum/MAX);
		System.out.println("수학평균: "+math_sum/MAX);
		
		

	}

}
