package prjDay12;

public class PersonInfo {
	private String name;
	private int year;
	private int month;
	private int day;
	String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public PersonInfo() {
	}
	public PersonInfo(String name, int year,int month, int day,String address) {
		setName(name);
		setYear(year);
		setMonth(month);
		setDay(day);
		this.address = address;
	}
	
	public String getInfo() {
		return "이름은 " + getName() + "이고 생년월일은" + getYear() + "년 " + getMonth() + "월"
				+ getDay() + "일이며, 주소는 " + address + "입니다.";
	}
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름은 " + getName() + "이고 생년월일은" + getYear() + "년 " + getMonth() + "월"
		+ getDay() + "일이며, 주소는 " + address + "입니다.";
	}
	
}
