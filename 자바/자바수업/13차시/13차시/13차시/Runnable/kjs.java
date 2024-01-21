package week04.day3.Runnable;
import java.util.ArrayList;

import java.util.Scanner;

 

public class kjs implements MyRunnable{
	String name;
	String id;
	String pw;
	
	ArrayList<kjs> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public String toString() {
		return " [name=" + name + ", id=" + id + ", pw=" + pw + "]";
	}
	
	public kjs() {
		
	}
	
	public kjs(String name, String id, String pw) {
		this.name=name;
		this.id=id;
		this.pw=pw;
	}

	public int 메뉴() {
		System.out.println("1.등록 2.변경 3.조회 4.삭제 5.종료");
		int menu = sc.nextInt();
		return menu;
	}
	public void 등록() {
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("id를 입력하세요");
		String id = sc.next();
		System.out.println("pw를 입력하세요");
		String pw = sc.next();
		
		list.add(new kjs(name,id,pw));
	}
	
	public void 변경() {
		System.out.println("몇번째를 변경하시겠습니까?");
		int a = sc.nextInt();
		kjs b = list.get(a-1);
		System.out.println("어떤것을 변경하시겠습니까?  	ex)name,id,pw   ex2)이름,아이디,비밀번호");
		String c = sc.next();
		
		if(c.equals("name") || c.equals("이름")) {
			System.out.println("변경하실 이름을 입력하세요");
			String d = sc.next();
			b.setName(d);
		}else if (c.equals("id") || c.equals("아이디")) {
			System.out.println("변경하실 아이디를 입력하세요");
			String d = sc.next();
			b.setId(d);
		}else if (c.equals("pw") || c.equals("비밀번호")) {
			System.out.println("변경하실 비밀번호를 입력하세요");
			String d= sc.next();
			b.setPw(d);
		}
	}
	
	public void 조회() {
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void 삭제() {
		
		System.out.println("몇번째를 삭제하시겠습니까?");
		int a = sc.nextInt();
		list.remove(a-1);
		
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	


	@Override
	public void run() {
		kjs k = new kjs();
		
		
		loop1: while(true) {
			int menu=k.메뉴();
			switch(menu) {
			case 1:
				k.등록();
				break;
			case 2:
				k.변경();
				break;
			case 3:
				k.조회();
				break;
			case 4:
				k.삭제();
				break;
			case 5:
				
				break loop1;
			default :
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}

}
