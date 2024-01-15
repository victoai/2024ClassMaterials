package ReservationSystem;

public class UserInfo {
	
	private String id, pw, name;
	public UserInfo(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public String getId() {return id;}
	public String getPw() {return pw;}
	public String getName() {return name;}
	public void setPw(String pw) {this.pw = pw;}
	public void setName() {this.name = name;}
	
}
