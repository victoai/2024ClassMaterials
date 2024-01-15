package 문법.day4;

public class 별찍기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 쌍다이아

		// 다이아 별

		// 위에 별
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j < 4 - i; j++) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) { // 별
				System.out.print("★");

			}
			for (int j = 6; j > 2 * i + 1; j--) {// 공백
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				if (i == 3 && j == 2 * i) {
					continue;
				} else {
					System.out.print("★");
				}

			}

			System.out.println();
		}
		// 아래별
		for (int i = 2; i >= 0; i--) {
			for (int j = 0; j < 3 - i; j++) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {// 별
				System.out.print("★");
			}
			for (int j = 6; j > 2 * i + 1; j--) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) { // 별
				System.out.print("★");

			}

			System.out.println();
		}

	}

}
