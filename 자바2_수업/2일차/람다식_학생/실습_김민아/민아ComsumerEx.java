package MyEx;

import java.util.function.Consumer;

public class 민아ComsumerEx{
	
	public static void main(String[] args) {

		
		
		Consumer<Integer> c  =   money  -> {
			
			System.out.println(money + "원으로 장보기");
			System.out.println(" '시금치 알리오 올리오' " );
			System.out.println("-------------------------");
			
			System.out.println( "시금치: 2430원");
			money= money-2430;
			
			System.out.println( "파스타 면: 1980원");
			money= money-1980;
			
			System.out.println( "올리브 오일: 7900원");
			money= money-7900;
			
			System.out.println( "굴소스: 3900원");
			money= money-3900;
			
			System.out.println( "깐마늘: 1990원");
			money= money-1990;
			
			System.out.println( "다진마늘: 2400원");
			money= money-2400;
			
			System.out.println( "파마산치즈: 4900원");
			money= money-4900;
			
			System.out.print( "잔액 : "+ money + "원");
			
		};
		
		 c.accept(30000);
		
		
//		Consumer<Integer> c2 =  new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer a) {
		 
//			}
//		};
//		c2.accept(30000);

	}

}
