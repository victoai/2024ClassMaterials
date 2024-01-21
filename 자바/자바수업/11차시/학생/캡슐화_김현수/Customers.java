package 실습10차시;

public class Customers {

	private String name;
	private String id;
	private String pw;
	private String address;
	
	
	
	public void inputData(String name, String id, String pw, String address) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.address =address;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.pw);
		System.out.println(this.address);
	}
	
	
}
