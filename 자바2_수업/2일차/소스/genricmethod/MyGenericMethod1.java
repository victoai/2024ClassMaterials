package day1.generic.genricmethod;

public class MyGenericMethod1 {
	//  제네릭 메소드
	//  T : 타입변수. 원하는 어떤 이름으로든 명명 가능
	
	// 둘 중 하나를 선택해서 반환함 
	public static <T> T pick (T a, T b) {
		return Math.random() > 0.5 ? a : b;
	}
	 
	
	 
	public static void main(String[] args) {
		
		int randNum = pick(7, 9);
		
        boolean resultBool = MyGenericMethod1.pick(true, false);
        String resultStr = MyGenericMethod1.pick("짜장", "짬뽕");	 
        double resultDbl = MyGenericMethod1.pick(3.5, 6.5);
        
        
        System.out.println( resultBool);
        System.out.println( resultStr);
        System.out.println( resultDbl);
        
        
	}

	
	
}
