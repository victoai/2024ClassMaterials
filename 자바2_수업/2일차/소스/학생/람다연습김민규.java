package day2.lamda.학생;

public class 람다연습김민규 {

@FunctionalInterface
	interface MaxInterface {
		 int max(int a , int b);
	  }


	//	return a>b ? a:b;}
@FunctionalInterface
	interface  PrintInterface{
		int prinVar(String name, int age);
		}
@FunctionalInterface
	interface SqureInterface{
		int squre(int x);
	}
@FunctionalInterface
	interface getRandomInterface{
		int getRandom();
		
	}
	public static void main(String[] args) {
	

		
		MaxInterface max1 = (a , b ) -> a>b?a:b;
		int maxresult = max1.max(5,3);
		System.out.println(maxresult);
		
		
		PrintInterface print1 = (name , age)-> {
		System.out.println(name + "씨는" +age +"살");
		return 0;
		
		};
	 print1.prinVar("가나다",30);
	
	
	 SqureInterface squre1 = (x)->x*x;
	 int squreresult = squre1.squre(5); 
	 System.out.println(squreresult);
	 
	getRandomInterface getRandom1 = () -> (int) (Math.random() * 6);
	    int randomresult= getRandom1.getRandom();
	    System.out.println(randomresult);
	 
		
	
		
		
		
		
		
		


////	==> (int a , int b )  -> {return a?b>a:b;}
////	==> (a , b ) -> a?b >a:b;
////	2)
//	int printVar(String name , int age){
//	Sysout(name+"="+age);
//	}
////	==> String name, int age ) - > (sysout(name+"="+age);}
////	=> name , age -> sysout (name+"="+age);
////	3)
//	int squre(int x) {
//	return x*x;
//	}
////	==> int x -> return x*x;
////	==> x -> x*x;
//		int getRandom(){
//		return (int)Math.random()*6);
//		}
//
////	==>  () -> (int)math.random()*6);

		
	}
	
}
