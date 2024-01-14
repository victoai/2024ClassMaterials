package day0726;

import java.util.Scanner;

public class 화폐문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("출장비를 입력하세요.");
		int in = sc.nextInt(); // 출장비 입력

		int cnt1 = 0; // 50000
		int cnt2 = 0; // 10000
		int cnt3 = 0; // 5000
		int cnt4 = 0; // 1000
		int cnt5 = 0; // 500
		int cnt6 = 0; // 100
		int cnt7 = 0; // 50
		int cnt8 = 0; // 10

		while (true) {
			if (in / 50000 > 0) {
				cnt1 = in / 50000;
				in = in % 50000;
			} else if (in / 10000 > 0) {
				cnt2 = in / 10000;
				in = in % 10000;
			} else if (in / 5000 > 0) {
				cnt3 = in / 5000;
				in = in % 5000;
			} else if (in / 1000 > 0) {
				cnt4 = in / 1000;
				in = in % 1000;
			} else if (in / 500 > 0) {
				cnt5 = in / 500;
				in = in % 500;
			} else if (in / 100 > 0) {
				cnt6 = in / 100;
				in = in % 100;
			} else if (in / 50 > 0) {
				cnt7 = in / 50;
				in = in % 50;
			} else if (in / 10 > 0) {
				cnt8 = in / 10;
				in = in % 10;
			} else {
				break;
			}
		}

		System.out.println("50,000원 : " + cnt1 + " 10,000원 : " + cnt2 + " 5,000원 : " + cnt3 + " 1,000원 : " + cnt4);
		System.out.println("500원 : " + cnt5 + " 100원 : " + cnt6 + " 50원 : " + cnt7 + " 10원 : " + cnt8);
	}
}