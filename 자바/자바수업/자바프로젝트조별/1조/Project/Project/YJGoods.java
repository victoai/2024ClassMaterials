package Project;

public class YJGoods {

	int num;
	String name;
	int pdprice;
	
	public YJGoods() {
		// TODO Auto-generated constructor stub
	}

	public YJGoods(int num,String name, int pdprice) {
		super();
		this.num = num;
		this.name = name;
		this.pdprice = pdprice;
	}

	

	

	@Override
	public String toString() {
		return "Goods [상품번호=" + num + ", name=" + name + ", price=" + pdprice + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPdprice() {
		return pdprice;
	}

	public void setPdprice(int pdprice) {
		this.pdprice = pdprice;
	}
	
	
}
