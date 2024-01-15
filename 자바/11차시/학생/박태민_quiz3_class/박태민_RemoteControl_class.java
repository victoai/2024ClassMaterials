package day10.quiz;

import java.util.Scanner;

public class 박태민_RemoteControl_class {
	public static void remote() {
		while (true) {
			System.out.println("0: 전원끄기 1: 전원켜기");
			Scanner scanner = new Scanner(System.in);
			String power = scanner.nextLine();
			int onoff = Integer.parseInt(power);

			switch (onoff) {
			case 0:
				System.out.println("전원을 종료합니다");
				break;
			case 1:
				System.out.println("전원을 켭니다");
				System.out.println("채널번호를 입력하세요");
				String channel = scanner.nextLine();
				int ch = Integer.parseInt(channel);
				System.out.println(ch+"번 채널로 이동합니다");
				break;
			default:
				System.out.println("전원버튼을 누르세요");
				break;
			}
		}
	}
}