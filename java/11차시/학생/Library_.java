package day10.classType;

import java.util.Scanner;


public class Library_ {

	static int index=0;
	public static void main(String[] args) {
		libraryMng lvrArr[] = new libraryMng[5];
		for(int i=0; i<lvrArr.length; i++) {
			lvrArr[i]= new libraryMng();
		}
		Scanner sc = new Scanner(System.in);
		
		lvrArr[index++].input("혼자 공부하는 컴퓨터 구조 + 운영체제", "강민철", 9791162243091L, "004.22-강38ㅎ", "[중앙]자료열람실1(3층)", "대출가능");
		lvrArr[index++].input("그림으로 이해하는 네트워크 용어", "기타미 류지", 9791165219659L, "004.5-기882ㄱ", "[중앙]자료열람실1(3층)", "대출불가");
		lvrArr[index++].input("모두의 딥러닝", "조태호", 9791165210397L, "004.73-조883ㅁ2", "[중앙]자료열람실1(3층)", "대출가능");
		lvrArr[index++].input("데이터베이스의 정석", "박성진", 9788989383789L, "005.75-박54ㄷ", "[중앙]자료열람실1(3층)", "대출가능");
		lvrArr[index++].input("이것이 안드로이드다 with 코틀린", "고돈호", 9791162243947L, "005.58-고25ㅇ2 ", "[중앙]자료열람실1(3층)", "대출불가");
		
		while(true) {
			System.out.println("1. 전체 도서 목록 조회");
		    System.out.println("2. 대출 가능 도서 목록 조회");
		    System.out.println("3. 도서 대출 ");
		    System.out.println("4. 도서 반납 ");
		    System.out.println("0. 종료");
		    System.out.print("메뉴 선택=> ");
		    String menu_ = sc.nextLine();
		    int menu = Integer.parseInt(menu_);
		    switch(menu) {
		    case 1:
		    	System.out.println("1. 전체 도서 목록 조회");
		    	for(int i=0; i<index; i++) {
		    		System.out.println(i+1+"번. ");
		    		lvrArr[i].print_lbr();
		    	}
		    	break;
		    case 2:
		    	System.out.println("2. 대출 가능 도서 목록 조회");
		    	for(int i=0; i<index; i++) {
		    		if(lvrArr[i].dc()=="대출가능") {
		    			System.out.println(i+1+"번. ");
		    			lvrArr[i].print_lbr();
		    		}
		    	}
		    	break;
		    case 3:
		    	System.out.println("3. 대출 실행");
		    	System.out.println("==대출 가능 도서 목록 조회");
		    	for(int i=0; i<index; i++) {
		    		if(lvrArr[i].dc()=="대출가능") {
		    			System.out.println(i+1+"번. ");
		    			lvrArr[i].print_lbr();
		    		}
		    	}
		    	System.out.print("대출 실행할 도서의 번호를 입력하세요");
		    	String num_ = sc.nextLine();
		    	int num = Integer.parseInt(num_);
		    	lvrArr[num-1].dc_1("대출불가");
		    	break;
		    case 4:
		    	System.out.println("4. 반납 실행");
		    	System.out.println("1. 전체 도서 목록 조회");
		    	for(int i=0; i<index; i++) {
		    		System.out.println(i+1+"번. ");
		    		lvrArr[i].print_lbr();
		    	}
		    	System.out.print("반납 실행할 도서의 번호를 입력하세요");
		    	String num1_ = sc.nextLine();
		    	int num1 = Integer.parseInt(num1_);
		    	lvrArr[num1-1].dc_1("대출가능");
		    	break;
		    
		    case 0:
		    	return;
		    default:
		    	System.out.println("잘못된 입력입니다.");
		    		
		    	}
		    
		    }
		}
	}


class libraryMng{
	private String title;
	private String writer;
	private double ISBN;
	private String symbol;
	private String place;
	private String daechul;
	
	public void input(String title, String writer,double ISBN,String symbol,String place,String daechul)
	{
		this.title=title;
		this.writer = writer;
		this.ISBN= ISBN;
		this.symbol=symbol;
		this.place=place;
		this.daechul=daechul;
	}
	public void print_lbr() {
		System.out.println("---------------------------");
		System.out.println("제목 : "+title);
		System.out.println("저자 : "+writer);
		System.out.println("ISBN : "+ISBN);
		System.out.println("청구기호 : "+symbol);
		System.out.println("자료실 : "+place);
		System.out.println("대출여부: "+daechul);
		System.out.println("---------------------------");
		
	}
	public String dc() {
		return daechul;
	}
	public void dc_1(String a) {
		daechul=a;
	}
	
	
	
}
