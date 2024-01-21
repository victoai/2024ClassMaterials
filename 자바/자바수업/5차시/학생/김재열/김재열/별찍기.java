package 문법.day4;

public class 별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// *****
		// *****
		// *****
		// *****
		// *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// ***
		// *****
		// *******
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// ***
		// *****
		// *******
		// *********

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// 다이아 별

		// 위에 별
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j < 4 - i; j++) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) { // 별
				System.out.print("*");

			}
			System.out.println();
		}
		// 아래별
		for (int i = 2; i >= 0; i--) {
			for (int j = 0; j < 3 - i; j++) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {// 별
				System.out.print("*");
			}

			System.out.println();
		}

		// 쌍다이아

		// 다이아 별

		// 위에 별
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j < 4 - i; j++) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) { // 별
				System.out.print("*");

			}
			for (int j = 1; j < 4 - i; j++) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) { // 별
				System.out.print("*");

			}
			System.out.println();
		}
		// 아래별
		for (int i = 2; i >= 0; i--) {
			for (int j = 0; j < 3 - i; j++) { // 공백
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {// 별
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
