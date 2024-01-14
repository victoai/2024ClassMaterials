package 실습10차시;

public class VendingMachine {
	
	public static void main(String[] args) {
		CoffeData coffedata = new CoffeData();
		
		coffedata.setupMachine(100, 100, 500, 1000);
		
		coffedata.printInfo();
	}
}
