package day7;

public class 기온퀴즈_김민지 {

	public static void main(String[] args) {
		
		int[]  temperatures = { 27,27,28, 29,30 , 33,32,33,32,31,31,33,33,31} ;
		
		/*
		 * 	문제1. 배열의 모든 기온을 출력하시오
			문제2. 배열의 모든 기온을 거꾸로 출력하시오
			문제3. 평균기온을 출력하시오
			문제4. 평균기온보다 높은 일수를 구하시오
			문제5. 가장 높은기온 출력
			문제6. 가장 낮은기온 출력
		 */

		System.out.println("배열의 모든 기온 출력");
		for(int i=0; i<temperatures.length; i++) {
			
			System.out.print(temperatures[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("배열의 모든기온 거꾸로 출력");
		for(int i=temperatures.length-1; i>=0; i--) {
			System.out.print(temperatures[i]+" ");
		}
		
		System.out.println();
		
		int avg;
		int sum=0;
		for(int i=0; i<temperatures.length; i++) {
			sum=sum+temperatures[i];
		}
		avg=sum/temperatures.length;
		System.out.println("평균기온은?");
		System.out.println(avg+"도");
		
		int index=0;  // higher배열의 첨자,  평균기온보다 높을때 카운트할 변수
		int[] higher=new int[15];
		
		System.out.println("평균기온보다 높은 일수");
		for(int i=0; i<temperatures.length; i++) {
			if(temperatures[i]>avg) {
				higher[index]=temperatures[i];
				index++;
			}
		}
		System.out.println(index+"일");
		
		System.out.println("가장 높은기온은?");
		int max=1;
		
		for(int i=0; i<temperatures.length; i++) {
			if(max<temperatures[i]) {
				max=temperatures[i];
			}
		}
		System.out.println(max+"도");
		
		System.out.println("가장 낮은기온은?");
		int min=50;
		
		for(int i=0; i<temperatures.length; i++) {
			if(min >temperatures[i]) {
				min=temperatures[i];
			}
		}
		System.out.println(min+"도");
		
	}

}
