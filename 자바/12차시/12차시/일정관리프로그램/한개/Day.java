package week03.day2;

public class Day {
	
	private String work;
	
	public void setWork(String work) {
		this.work=work;
	}
	public String getWork() {
		return work;
	}
	
	public void show() {
		System.out.println( work + "입니다");
	}
	
	// 멤버메서드
	// input();   // 일정등록, Day 객체생성, Scanner 사용
	// view();    // 일정보기
	// finish();  // System.exit(0);   // 종료
	// run();	  // 메뉴보기 기능
	
}
