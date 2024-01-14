package prjDay10.inheritance.Bar;

public class BarProgram {

	public static void main(String[] args) {
		
		Bluehawai bh = new Bluehawai();
		bh.Cocktail();
		bh.Bluehawai();
		
		Peachcrush pc = new Peachcrush();
		pc.Cocktail();
		pc.Peachcrush();
		
		Tequilasunrise ts = new Tequilasunrise();
		ts.Cocktail();
		ts.Tequilasunrise();
		
		
		System.out.println("====배열 활용====");
		
		// 배열활용
		
		Cocktail[] cocktails = new Cocktail[3];
		
		cocktails[0] = new Bluehawai();
		cocktails[1] = new Peachcrush();
		cocktails[2] = new Tequilasunrise();
		
		System.out.println("====다형성====");
		
		// 다형성 
		
		for(int i=0;i<cocktails.length;i++) {
			cocktails[i].Cocktail();
		}
		
	
		
	}

}
