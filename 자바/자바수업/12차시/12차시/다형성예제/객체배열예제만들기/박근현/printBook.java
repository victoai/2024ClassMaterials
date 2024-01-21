package test;

import java.util.ArrayList;
import java.util.Scanner;

public class printBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		
		//현재 도서관에 있는 책 확인
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("0. 해리포터1"));
		list.add(new Book("1. 해리포터2"));
		list.add(new Book("2. 해리포터3"));
		
		System.out.print("현재 도서관에 있는 전체 책: ");
		System.out.println(list);   //현재 존재하는 전체 책 출력
		System.out.print("도서관에 있는 전체 책 수량: ");
		System.out.println(list.size() + "권");
		
		System.out.println();
		
		//책 대여
		System.out.print("대여하고 싶으신 책 번호 선택해주세요: ");
		int title3 = sc.nextInt();
		list.remove(title3);
		System.out.print("현재 도서관에 있는 전체 책: ");
		System.out.println(list);
		System.out.print("도서관에 있는 전체 책 수량: ");
		System.out.println(list.size() + "권");
		
		System.out.println();
		
		//책 반납
		System.out.print("도서관에 반납하실 책 제목을 입력해주세요: ");
	    String title2 = sc.next();
	    System.out.println();
				
		list.add(new Book(title2));
		System.out.print("현재 도서관에 있는 전체 책: ");
		System.out.println(list);
		System.out.print("도서관에 있는 전체 책 수량: ");
		System.out.println( list.size() + "권");
		
		System.out.println();
		
		//반납해야될 책 안내
		Object book2 = new Book("어린왕자");
		String book3 = ((Book)book2).returnBook();
		System.out.println(book3);
	}
}