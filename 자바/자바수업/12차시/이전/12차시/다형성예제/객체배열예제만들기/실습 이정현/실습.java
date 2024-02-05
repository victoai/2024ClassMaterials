
public class 실습 {
	
	// 맴버변수
	private String id;
	private String pw;
	private String name;
	private int amount;
	
	// 생성자
	public 실습() {
		
	}
	
	public 실습(String id, String pw, String name, int amount) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.amount = amount;
	}
		
	
	// 쎄터
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return id + " " + pw + " " + name + " " + amount + " 개";
	}
	

}
