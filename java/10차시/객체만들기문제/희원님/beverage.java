package week03.day2.희원님;

import java.util.Scanner;

public class beverage {   // 클래스  => 객체를 만들기 위한 설계도  ( 객체 : 한 개)

	private String[] 이름= {"콜라","포카리스웨트","알로에쥬스"};
	private int 개수;
	private int 가격;
	private int 값;
	private int index;
	
	Scanner sc = new Scanner(System.in);
	
	public String 음료이름() {
		int index = (int)(Math.random()*3);
		System.out.println(index);
		this.index=index;
		String result =이름[index];
		System.out.println("result"+result);
		return result;
	}
	
	public void 개수고르기() {
		System.out.println("개수를 입력하세요");
		개수=sc.nextInt();
	}
	public void 가격정하기() {
		if(이름[index].equals("콜라"))
			가격=2000;
		else if(이름[index].equals("포카리스웨트")) 
			가격=1800;
		else
			가격=2200;
	}
	public void 값() {
		값=가격*개수;
	}

	
//	public String 출력() {
//		String result=이름[index];
public void printinfo() {
		System.out.println("이 음료는 탄산음료입니다.");
		//System.out.println("이 음료는 이온음료입니다.");
		//System.out.println("이 음료는 탄산이나 이온 음료가 아닙니다.");
		System.out.println("음료명: "+이름[index]);	
		System.out.println("수량: "+개수+"개");
		System.out.println("가격: "+가격+"원");
		System.out.println("값: "+값+"원");
		
	}
		public void printinfo2() {
		//System.out.println("이 음료는 탄산음료입니다.");
		System.out.println("이 음료는 이온음료입니다.");
		//System.out.println("이 음료는 탄산이나 이온 음료가 아닙니다.");
		System.out.println("음료명: "+이름);	
		System.out.println("수량: "+개수+"개");
		System.out.println("가격: "+가격+"원");
		System.out.println("값: "+값+"원");
		
	}
		public void printinfo3() {
		//System.out.println("이 음료는 탄산음료입니다.");
		//System.out.println("이 음료는 이온음료입니다.");
		System.out.println("이 음료는 탄산이나 이온 음료가 아닙니다.");
		System.out.println("음료명: "+이름);	
		System.out.println("수량: "+개수+"개");
		System.out.println("가격: "+가격+"원");
		System.out.println("값: "+값+"원");
		
	}

}
