package java_day6;

public class Java_1_1_온도구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// max의 값 = 값의범위에서 최소값 or 배열의 첫번째 값
		/*
		 * for(int i=0 ; arr.length; i++){ if(max <arr[i]){ max=arr[i]} }
		 */

		int[] temperatures = { 27, 27, 28, 29, 30, 33, 32, 33, 32, 31, 31, 33, 33, 31 };

		int sum = 0;
		double avg = 0;

		// 모든기온출력
		System.out.println("기온출력");
		System.out.println(" ");
		for (int i = 0; i < temperatures.length; i++) {
			System.out.println(temperatures[i]);
		}

		// 거꾸로출력
		System.out.println(" ");
		System.out.println("거꾸로출력");
		System.out.println(" ");
		for (int i = temperatures.length - 1; i >= 0; i--) {

			System.out.println(temperatures[i]);
		}

		// 평균기온
		for (int i = 0; i < temperatures.length; i++) {
			sum += temperatures[i];

		}
		avg = sum / temperatures.length;

		// 평균기온출력
		System.out.println(" ");
		System.out.println("평균기온" + avg);

		// 평균보다 높은일수
		System.out.println(" ");
		System.out.println("평균보다높은일수");
		System.out.println(" ");
		int cnt=0;
		for (int i = 0; i < temperatures.length; i++) {
			if (avg < temperatures[i]) {
				//(temperatures[i]);
				cnt++;

			}
		}
			System.out.println(cnt);
		// 제일 높은 온도
		System.out.println(" ");
		System.out.println("제일높은온도구하기");
		int max = 27;
		for (int i = 0; i < temperatures.length; i++) {
			if (max < temperatures[i]) {
				max = temperatures[i];
			}
		}
		System.out.println(max);

		// 제일 낮은 온도
		System.out.println(" ");
		System.out.println("제일낮은온도구하기");
		int min = 100;
		for (int i = 0; i < temperatures.length; i++) {
			if (min > temperatures[i]) {
				min = temperatures[i];
			}
		}
		System.out.println(min);

		// 모든기온 출력
		/*
		 * System.out.println(temperatures [0]); System.out.println(temperatures [1]);
		 * System.out.println(temperatures [2]); System.out.println(temperatures [3]);
		 * System.out.println(temperatures [4]); System.out.println(temperatures [5]);
		 * System.out.println(temperatures [6]); System.out.println(temperatures [7]);
		 * System.out.println(temperatures [8]); System.out.println(temperatures [9]);
		 * System.out.println(temperatures [10]); System.out.println(temperatures [11]);
		 * System.out.println(temperatures [12]); System.out.println(temperatures [13]);
		 */

		// 기온 거꾸로출력
		/*
		 * System.out.println("  "); System.out.println("기온거꾸로출력");
		 * System.out.println(temperatures [13]); System.out.println(temperatures [12]);
		 * System.out.println(temperatures [11]); System.out.println(temperatures [10]);
		 * System.out.println(temperatures [9]); System.out.println(temperatures [8]);
		 * System.out.println(temperatures [7]); System.out.println(temperatures [6]);
		 * System.out.println(temperatures [5]); System.out.println(temperatures [4]);
		 * System.out.println(temperatures [3]); System.out.println(temperatures [2]);
		 * System.out.println(temperatures [1]); System.out.println(temperatures [0]);
		 */

	}

}
