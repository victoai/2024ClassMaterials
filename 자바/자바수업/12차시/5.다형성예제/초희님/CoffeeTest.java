package week03.day5.상속3;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee coffee = new Coffee();
		Americano americano = new Americano();
		CafeLatte cafeLatte = new CafeLatte();
		VanillaLatte vanillaLatte = new VanillaLatte();
		
		coffee.makeEspresso();
		coffee.printInfo();
		System.out.println("==============");
		americano.makeAmericano();
		americano.printAmericanoInfo();
		System.out.println("==============");
		cafeLatte.makeCafeLatte();
		cafeLatte.printCafeLatteInfo();
		System.out.println("==============");
		vanillaLatte.makeVanillaLatte();
		vanillaLatte.printVanillaLatteInfo();
		System.out.println("==============");
		
		
		
	}

}
