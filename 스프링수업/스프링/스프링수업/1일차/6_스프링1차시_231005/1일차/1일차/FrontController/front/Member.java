package front;

public class Member {		
	long num;	 
	String userName;
	int age;
	
	
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Member( String userName, int age) {
		super();
	 
		this.userName = userName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [num=" + num + ", userName=" + userName + ", age=" + age + "]";
	}
	 

	
	
}
