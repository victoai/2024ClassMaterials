package java2.day3.reflect;

public class Member {
	
	String id;
	String pw;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}
		 
	
	public void printInfo(  ) {
		System.out.println( "id=" + id);
		System.out.println( "pw=" + pw);
	}
	
	
	public void method2( int su) {
		
		System.out.println( su*su);
	}
}
