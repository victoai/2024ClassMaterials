package prjDay12;

import java.util.ArrayList;
import java.util.Scanner;

public class GameEx {

	public static void main(String[] args) {
		ArrayList<Game> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		list.add(new Game("호그와트 레거시", 68800, 2023));
		list.add(new Game("세키로", 59800, 2019));
		list.add(new Game("슬레이 더 스파이어", 26000, 2019));

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).toString());
		

		//가격 또는 년도 출력
		System.out.print("원하는 게임정보?(가격, 년도): ");
		String str = sc.next();

		if (str.equals("가격")) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getTitle() + " : " + list.get(i).getPrice() + "원");
			}
		} else if (str.equals("년도")) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getTitle() + " : " + list.get(i).getYear());
			}
		}
	}

}
