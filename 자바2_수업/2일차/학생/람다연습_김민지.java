package java0926.lamda;

@FunctionalInterface
interface StarInterface{
	public void printStar();
}

@FunctionalInterface
interface GetRandom{
	public int getrandom();
}


public class 람다연습_김민지 {

	public static void main(String[] args) {
	
		//1.
		System.out.println("1번 방법");
		class StarInterfacePrac implements StarInterface, GetRandom {

			@Override
			public void printStar() {
				System.out.println("***1번방법으로 별찍기***");
			}

			@Override
			public int getrandom() {
				return (int)(Math.random()*6);
			}
		}
		StarInterfacePrac star = new StarInterfacePrac();
		star.printStar();
		
		StarInterfacePrac random = new StarInterfacePrac();
		int result = random.getrandom();
		System.out.println("1번방법으로 얻은 랜덤수: " + result);
		
		
		//2.
		System.out.println("\n2번 방법");
		StarInterface star2 = new StarInterface() {

			@Override
			public void printStar() {
				System.out.println("***2번방법으로 별찍기***");		
			}
		};
		star2.printStar();
		
		GetRandom random2 = new GetRandom() {

			@Override
			public int getrandom() {
				return (int)(Math.random()*6);
			}
		};
		int result2 = random2.getrandom();
		System.out.println("2번방법으로 얻은 랜덤수: " + result2);
		
		
		//3.
		System.out.println("\n3번 방법");
		StarInterface star3 = ()->System.out.println("***3번방법으로 별찍기***");
		star3.printStar();
		
		GetRandom random3 = () -> (int)(Math.random()*6);
		int result3 = random3.getrandom();
		System.out.println("3번방법으로 얻은 랜덤수: " + result3);
	
		
	}

}
