package day2.lamda.학생;

@FunctionalInterface
interface MaxInterface{
	int max(int a, int b);
}
public class 람다연습_나정 {

	public static void main(String[] args) {

		//1.
		class MaxInterfaceImp implements MaxInterface{

			@Override
			public int max(int a, int b) {
				return a>b? a:b;
			}
			
		}
		MaxInterfaceImp f1 = new MaxInterfaceImp();
		int result = f1.max(6, 5);
		System.out.println(result);
		
		//2.
		MaxInterface f2 = new MaxInterface() {

			@Override
			public int max(int a, int b) {
				return a>b? a:b;
			}
			
		};
		int result2 = f2.max(4, 2);
		System.out.println(result2);
		
		//3.
		MaxInterface f3= (a,b) -> a>b? a:b;
		
		int result3 = f3.max(1, 4);
		System.out.println(result3);
		
	}

}
