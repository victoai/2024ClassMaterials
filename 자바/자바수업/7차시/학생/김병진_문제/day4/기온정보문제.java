package javalang.day4;

public class 기온정보문제 {

	public static void main(String[] args) {
		// 문제1. 배열의 모든 기온을 출력하시오
		// 문제2. 배열의 모든 기온을 거꾸로 출력하시오
		// 문제3. 평균기온을 출력하시오
		// 문제4. 평균기온보다 높은 일수를 구하시오
		// 문제5. 가장높은기온 출력하시오
		// 문제6. 가장낮은기온 출력하시오
		int[] temperatures = { 27, 27, 28, 29, 30, 33, 32, 33, 32, 31, 31, 33, 33, 31 };
		int count = 0; //평균보다 높은 일수
		int sum = 0; //기온들의 합
		double avg = 0; //평균 기온
		int max = 0;
		int min = 60;
		
		// 문제1 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("문제1");
		System.out.print("배열의 모든 값 출력 =");
		for (int i = 0; i < temperatures.length; i++) {
			System.out.printf(" %d ", temperatures[i]);
		}
		
		// 문제2 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("\n\n문제2");
		System.out.print("배열의 모든 값 거꾸로 =");
		for (int i = temperatures.length-1; i >= 0; i--) {
			System.out.printf(" %d ", temperatures[i]);
		}
		
		// 문제3 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("\n\n문제3");
		System.out.print("평균 기온 =");
		for (int i = 0; i < temperatures.length; i++) {
			sum += temperatures[i];
		}
		avg = (double)sum/(temperatures.length); 
		System.out.printf(" %.2f도", avg);
		
		// 문제4 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("\n\n문제4");
		System.out.print("평균 기온 보다 높은 일수 =");
		for (int i = 0; i < temperatures.length; i++) {
			if(temperatures[i]>avg) {
				count++;
			}
		}
		System.out.printf(" %d일", count);
		
		// 문제5 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("\n\n문제5");
		System.out.print("가장 높은 기온 =");
		for (int i = 0; i < temperatures.length; i++) {
			if(temperatures[i]>max) {
				max = temperatures[i];
			}
		}
		System.out.printf(" %d도", max);
		
		// 문제6 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("\n\n문제6");
		System.out.print("가장 낮은 기온 =");
		for (int i = 0; i < temperatures.length; i++) {
			if(temperatures[i]<min) {
				min = temperatures[i];
			}
		}
		System.out.printf(" %d도", min);
	}

}
