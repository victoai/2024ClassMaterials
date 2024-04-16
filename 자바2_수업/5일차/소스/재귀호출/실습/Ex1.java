package day5.재귀호출.실습;

public class Ex1 {

	public static void main(String[] args) {

		// 매서드 (함수) 입력, 반환값
		// 1~10 합 구하기
		int result = getSum(10);
		System.out.println(result);

		
		int result2 = getSumR(10);
		System.out.println(result2);
	}

	public static int getSum(int n) {

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;

	}

	// 재귀함수
	public static int getSumR(int n) { //
		// 탈출조건
		if (n == 1) {
			return 1;
		} else {
			return getSumR(n - 1) + n;
		}
	}
	
	

}
