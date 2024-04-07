package lamda;

@FunctionalInterface
interface MaxInterface{
	int max(int a,int b);
}

@FunctionalInterface
interface PrintVarInterface{
	String printVar(String name, int age);
}

@FunctionalInterface
interface SqureInterface{
	int squre(int x);
}
@FunctionalInterface
interface GetRandomInterface{
	int getRandom();
}

public class HJHEx {


	public static void main(String[] args) {
		//1.
		class MaxInterfaceImp implements MaxInterface{

			@Override
			public int max(int a, int b) {
				
				return a>b ? a:b;
			}
			
		}
		MaxInterfaceImp f1 = new MaxInterfaceImp();
		int result1 = f1.max(5, 9);
		System.out.println("1-1=================");
		System.out.println(result1);
		
		//2.
		MaxInterface f2 = new MaxInterface() {
			
			@Override
			public int max(int a, int b) {
				return a>b ? a:b;
			}
		};
		
		int result2 = f2.max(18, 2);
		System.out.println("1-2=================");
		System.out.println(result2);
		
		//3.
		MaxInterface f3 = (a,b)->a>b ? a:b;
		int result3 = f3.max(3, 4);
		System.out.println("1-3=================");
		System.out.println(result3);
		
		////////////////////////////////////////////////
		//1.
		class PrintVarInterfaceImp implements PrintVarInterface{

			@Override
			public String printVar(String name, int age) {
				
				return name+ "=" +age;
			}
			
		}
		
		PrintVarInterfaceImp f4 = new PrintVarInterfaceImp();
		String result4 = f4.printVar("김모모", 16);
		System.out.println("2-1=================");
		System.out.println(result4);
		
		//2.
		PrintVarInterface f5 = new PrintVarInterface() {
			
			@Override
			public String printVar(String name, int age) {
				return name+ "=" +age;
			}
		};
		
		String result5 = f5.printVar("김미미", 17);
		System.out.println("2-2=================");
		System.out.println(result5);
		
		//3.
		PrintVarInterface f6 = (name,age) ->name+ "=" +age;
		String result6 = f6.printVar("홍길동", 13);
		System.out.println("2-3=================");
		System.out.println(result6);

		
		SqureInterface f7 = x->x*x;
		int result7 = f7.squre(15);
		System.out.println("3-3=================");
		System.out.println(result7);
		
		GetRandomInterface f8 = ()->(int)(Math.random()*6);
		int result8 = f8.getRandom();
		System.out.println("4-3================");
		System.out.println(result8);
	}

}
