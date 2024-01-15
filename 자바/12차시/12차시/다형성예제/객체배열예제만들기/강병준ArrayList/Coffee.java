package prjDay12;

public class Coffee {

	String name;
	int caffeine;
	int kcal;
	int price;
	
	
	
	public Coffee() {}
	
	public Coffee(String name, int caffeine, int kcal, int price) {
		this.name = name;
		this.caffeine = caffeine;
		this.kcal = kcal;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "메뉴: "+name +"\n"+ "카페인량(mg): " + caffeine +"\n"+ "칼로리: " + kcal + "\n" + "가격: " +price + "원";
	}
	
}
