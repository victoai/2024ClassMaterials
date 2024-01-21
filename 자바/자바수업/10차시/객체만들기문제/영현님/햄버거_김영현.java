package week03.day2.영현님;

public class 햄버거_김영현 {
	
	//속성
	private String 햄버거;
	private String 사이드;
	private String 음료;
	private int 칼로리;
	private int 가격;
	
	//입력
	public void input(String n, String s, String d, int c, int m) {
		햄버거 = n;
		사이드 = s;
		음료 = d;
		칼로리 = c;
		가격 = m;
	}
	
	//치즈추가
	public void cheese() {
		System.out.println("★치즈추가★");
		칼로리 += 20;
		가격 += 500;
		햄버거 = 햄버거 + " + 치즈";
	}
	
	//패티추가
	public void beef() {
		System.out.println("★패티추가★");
		칼로리 += 20;
		가격 += 1000;
		햄버거 = 햄버거 + " + 패티";
	}
		
	//야채추가
	public void veg() {
		System.out.println("★야채추가★");
		칼로리 += 10;
		가격 += 500;
		햄버거 = 햄버거 + " + 야채";
	}
	
	//사이드추가
	public void side() {
		System.out.println("★치즈스틱추가★");
		칼로리 += 30;
		가격 += 2000;
		사이드 = 사이드 + ", 치즈스틱";
	}
		
		
	
	//출력
	public void order() {
		System.out.println("<====주문서====>");
		System.out.println("햄버거 종류: " + 햄버거);
		System.out.println("사이드 종류: " + 사이드);
		System.out.println("음료 종류: " + 음료);
		System.out.println("칼로리: " + 칼로리 + "kcal");
		System.out.println("가격: " + 가격 + "원");
	}
}
