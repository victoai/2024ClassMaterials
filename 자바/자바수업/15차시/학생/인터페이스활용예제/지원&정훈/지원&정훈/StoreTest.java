package store;

import java.util.Scanner;

public class StoreTest {

	public static void main(String[] args) {

		Store s = new Store();
		냉우동집 w= new 냉우동집();
		한식 h = new 한식();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("일식 한식 중 고르세요");
		System.out.println("1. 일식 2. 한식");
		int n = sc.nextInt();
		if(n==1) {
			s.store(w);
		}else if(n==2) {
			s.store(h);
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		
		
		
		
	}

}
