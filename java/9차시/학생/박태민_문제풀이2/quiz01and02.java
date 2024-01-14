package day09.quiz;

import java.security.PublicKey;
import java.util.Scanner;

public class quiz01and02 {

	static String[] favorite = new String[5];
	static Scanner sc = new Scanner(System.in);
	static int j = 0;
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("메뉴를 선택하세요! 1.등록, 2.조회");
			String menu_ = sc.nextLine();
			int menu = Integer.parseInt(menu_);
			switch (menu) {
			case 1:
				insert();
				break;
			case 2:
				read();
				break;
			default:
				System.out.println("다시! 똑바로!");
				break;
			}
		}
		

	}
	
	public static void insert() {
		System.out.println("좋아하는 것을 입력하세요");
		String likey = sc.nextLine();
		favorite[j] = likey;
		j++;
	}
	
	public static void read() {
		System.out.println("입력한 내용을 읽어옵니다.");
		for(int i = 0; i < favorite.length; i++) {
			System.out.println((i+1)+". "+favorite[i]);
		}
	}
	
}
