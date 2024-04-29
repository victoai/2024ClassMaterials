package aa.bb.zz;

import java.util.Date;

public class MyData {
	String id;
	String pw;
	Date   birth;   //  2002/02/10  이형식은 스프링이 기본적으로  convert 해 줌
	String[] sns;
	
	
	public String[] getSns() {
		return sns;
	}
	public void setSns(String[] sns) {
		this.sns = sns;
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
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "MyData [id=" + id + ", pw=" + pw + ", birth=" + birth + "]";
	}
	
	 

}
