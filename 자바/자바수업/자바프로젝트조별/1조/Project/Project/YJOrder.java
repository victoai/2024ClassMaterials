package Project;

public class YJOrder {

	
	int count;
	YJGoods goods;
	int total;
	
	
	public YJOrder(int count,YJGoods goods) {
		super();
		this.count = count;
		this.goods = goods; 
		this.total = (int) (goods.pdprice*this.count);
		
		
	}

	

	@Override
	public String toString() {
		return "Order [상품번호" + goods.num + ", 상품명=" + goods.name + ", 수량=" +count + " 가격 "+goods.pdprice+" 총금액=" +total+"]";
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	public YJGoods getGoods() {
		return goods;
	}



	public void setGoods(YJGoods goods) {
		this.goods = goods;
	}



	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
