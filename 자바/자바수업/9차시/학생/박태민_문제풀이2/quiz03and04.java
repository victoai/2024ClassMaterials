package day09.quiz;

import java.security.PublicKey;
import java.util.Scanner;

public class quiz03and04 {

	static String[] favorite = new String[5];
	static Scanner sc = new Scanner(System.in);
	static int j = 0;
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("메뉴를 선택하세요! 1.등록, 2.조회, 3.변경, 4.삭제");
			String menu_ = sc.nextLine();
			int menu = Integer.parseInt(menu_);
			switch (menu) {
			case 1:
				insert();
				break;
			case 2:
				read();
				break;
			case 3:
				change();
				break;
			case 4:
				delete();
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
	
	public static void change() {
		read();
		System.out.println("내용을 변경하고싶은 번호와 다시 작성할 내용은?");
		String reNum1 = sc.nextLine();
		int reNum2 = Integer.parseInt(reNum1);
		String reLikey = sc.nextLine();
		favorite[reNum2-1] = reLikey;
	}

	public static void delete() {
		read();
		System.out.println("삭제하고 싶은 번호를 입력하세요");
		String delete1 = sc.nextLine();
		int delete2 = Integer.parseInt(delete1);
		favorite[delete2-1] = "null";
	}
	
}
