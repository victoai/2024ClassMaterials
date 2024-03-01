package prj;

public class Ex07_boook {
	String 책재목;
	String 작가;
	int 가격;
	public Ex07_boook() {
	// TODO Auto-generated constructor stub
}
	public Ex07_boook(String 책재목, String 작가, int 가격) {
		super();
		this.책재목 = 책재목;
		this.작가 = 작가;
		this.가격 = 가격;
	}
	@Override
	public String toString() {
		return "Ex07_boook [책재목=" + 책재목 + ", 작가=" + 작가 + ", 가격=" + 가격 + "]";
	}
	
}
