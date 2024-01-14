package day10.classType;

public class 영화데이터 {
	
	
	private String name;
	private int date;
	private String supervise;
	
	
	public void input(String name, int date, String supervise) {
		
		this.name = name;
		this.date = date;
		this.supervise = supervise;
		
	}
	
	
	
	public void printInfo() {
		System.out.println("영화 이름은 "+name);
		System.out.println("개봉 일자는 "+date);
		System.out.println("감독은 "+supervise);
	}
	

}
