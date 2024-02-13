package Project;

public class Customer{
	private String id;
	private String pw;
	private String address;
	private String phone;
	private int totalCost;
	private int totalPoint;
	private Membership mmsh;
	private YJOrder order;
	
	public Customer() {}
	
	public Customer(String id,String pw, String address, String phone, int totalCost, int totalPoint, Membership mmsh) {
		super();
		this.id = id;
		this.pw = pw;
		this.address = address;
		this.phone = phone;
		this.totalCost = totalCost;
		this.totalPoint = totalPoint;
		this.mmsh = mmsh;
	}
	
	public int gettotalCost() {
		return totalCost;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", pw = " + pw + ", address=" + address + ", phone=" + phone + ", totalCost=" + totalCost
				+ ", totalPoint=" + totalPoint + ", mmsh=" + mmsh.getGrade() + "]";
	}
	
	public int compareTo(Customer customer) {
		return this.totalCost - customer.totalCost;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	public Membership getMmsh() {
		return mmsh;
	}
	public void setId(String id) {
		this.id= id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost += totalCost;
	}
	public void setTotalPoint(int totalPoint) {
		this.totalPoint += totalPoint;
	}
	public int getPoint() {
		return totalPoint;
	}
	public void setMmsh(Membership mmsh) {
		this.mmsh = mmsh;
	}
	
	
 
	

}