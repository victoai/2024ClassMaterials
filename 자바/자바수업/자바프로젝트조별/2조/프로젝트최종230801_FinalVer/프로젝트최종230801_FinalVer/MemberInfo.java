package 프로젝트최종230801_FinalVer;

public class MemberInfo {
	private String id, pw, name, phonNum;
	public MemberInfo(String id, String pw, String name, String phonNum) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phonNum =phonNum;
	}
	public String getPhonNum() {
		return phonNum;
	}
	public void setPhonNum(String phonNum) {
		this.phonNum = phonNum;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return id + " " + pw + " " + name + " " + phonNum;
	}
	
	

}
