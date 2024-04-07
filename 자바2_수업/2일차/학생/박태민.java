package java2prj1.lamda;

@FunctionalInterface
interface Add {
	int add(int a, int b);
}

@FunctionalInterface
interface subtract {
	int subtract(int a, int b);
}

@FunctionalInterface
interface multiple {
	int multiple(int a, int b);
}

@FunctionalInterface
interface divide {
	double divide(int a, int b);
}

public class 박태민 {
	public static void main(String[] args) {

		System.out.println("클래스 생성");
		// 1.
		class AddInterfaceImp implements Add {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		}
		AddInterfaceImp t1 = new AddInterfaceImp();
		int tr1 =t1.add(10, 5);
		System.out.println(tr1);

		class SubtractInterfaceImp implements subtract {
			@Override
			public int subtract(int a, int b) {
				return a - b;
			}
		}
		SubtractInterfaceImp t2 = new SubtractInterfaceImp();
		int tr2 = t2.subtract(10, 2);
		System.out.println(tr1);

		class MultipleInterfaceImp implements multiple {
			@Override
			public int multiple(int a, int b) {
				// TODO Auto-generated method stub
				return a * b;
			}
		}
		MultipleInterfaceImp t3 = new MultipleInterfaceImp();
		int tr3 = t3.multiple(3, 4);
		System.out.println(tr2);

		class DivideInterfaceImp implements divide{
			@Override
			public double divide(int a, int b) {
				// TODO Auto-generated method stub
				return a/b;
			}
		}
		DivideInterfaceImp t4 = new DivideInterfaceImp();
		double tr4 = t4.divide(10, 3);
		System.out.println(tr4);
		
		System.out.println("익명");
		
		// 2. AddInterface f2 = new AddInterface() {}; -> 익명클래스 정의
		// 더하기
		Add f1 = new Add() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		int result1 = f1.add(6, 1);
		System.out.println(result1);

		//빼기
		subtract f2 = new subtract() {
			@Override
			public int subtract(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		int result2 =f2.subtract(20, 11);
		System.out.println(result2);
		
		//곱하기
		multiple f3 = new multiple() {
			@Override
			public int multiple(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		int result3 = f3.multiple(9, 8);
		System.out.println(result3);
		
		//나누기
		divide f4 = new divide() {
			@Override
			public double divide(int a, int b) {
				// TODO Auto-generated method stub
				return a/b;
			}
		};
		double result4 = f4.divide(20, 6);
		System.out.println(result4);
		

		System.out.println("람다식");
		// 3.
		// 더하기
		Add aa  = (a, b) -> a + b;
		int r1 = aa.add(20, 40);
		System.out.println(r1);
		
		// 빼기
		subtract bb  = (a, b) -> a - b;
		int r2 = bb.subtract(20, 40);
		System.out.println(r2);
		
		// 곱하기
		multiple cc  = (a, b) -> a * b;
		int r3 = cc.multiple(20, 40);
		System.out.println(r3);
		
		// 나누기
		divide dd  = (a, b) -> a / b;
		double r4 = dd.divide(20, 40);
		System.out.println(r4);
	}
}
