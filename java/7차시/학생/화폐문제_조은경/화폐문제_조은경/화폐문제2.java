package day0726;

import java.util.Scanner;

public class 화폐문제2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("출장비를 입력하세요.");
		int in = sc.nextInt(); // 출장비 입력

		int[] cnt = new int[8];
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		// 매수 구하기
		for (int i = 0; i < cnt.length; i++) {
			cnt[i] = in / money[i];
			in = in % money[i];
			System.out.println(money[i] + "권 : " + cnt[i]);
		}
	}
}