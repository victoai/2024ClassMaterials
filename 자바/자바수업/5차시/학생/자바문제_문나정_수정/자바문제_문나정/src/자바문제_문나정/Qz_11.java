package 자바문제_문나정;

public class Qz_11 {

	public static void main(String[] args) {

		// 문제를 만들어보세요.
		/*
		 
					*        *
					**      **
					***    ***
					****  ****
					**********
					****  ****
					***    ***
					**      **
					*        *
		
		
		*/
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.printf("*");
			}
			for(int j=i+1; j<5;j++) {
				System.out.printf(" ");
			}
			for(int j=5; j<9-i; j++) {
				System.out.printf(" ");
			}
			for(int j=9-i; j<=9; j++) {
				System.out.printf("*");
			}
			System.out.print("\n");
		}
		for(int i=5; i<9; i++) {
			for(int j=0; j<9-i; j++) {
				System.out.printf("*");
			}
			for(int j=9-i; j<5;j++) {
				System.out.printf(" ");
			}
			for(int j=5; j<=i; j++) {
				System.out.printf(" ");
			}
			for(int j=i+1; j<=9; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}

}
