package week04.day3.Runnable;

import java.util.Scanner;

public class Battle implements MyRunnable {

	String a;
	String b;
	
	public Battle() {
		
	}
	
	public Battle(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 대결");
		System.out.println("1p 선택(가위, 바위, 보)");
		String a = sc.next();
		System.out.println("2p 선택(가위, 바위, 보)");
		String b = sc.next();
		
		if(a.equals(b))				System.out.println("비겼습니다");
		else if(a.compareTo(b) > 0) {
			if(a.equals("보") && b.equals("가위")) {
				System.out.println("2p가 이겼습니다");
			}
			else	System.out.println("1p가 이겼습니다");	
		}
		else if(a.compareTo(b) < 0) {
			if(a.equals("가위") && b.equals("보")) {
				System.out.println("1p가 이겼습니다");
			}
			else	System.out.println("2p가 이겼습니다");
		}
		else	System.out.println("잘못입력하셨습니다");
	}
		
}
