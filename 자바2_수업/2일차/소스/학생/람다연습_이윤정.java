package day2.lamda.학생;


@FunctionalInterface
interface Sub{
	int sub(int x, int y);
}

@FunctionalInterface
interface Multi{
	int Multi(int x, int y);
}


@FunctionalInterface
interface divide{
	int divide(int a, int b);
}



public class 람다연습_이윤정 {
	

		public static void main(String[] args) {
				
			
			class ramdaCal implements Sub{
			
			@Override
			public int sub(int x, int y) {
				return x-y;
				
			}
		}	
			
		
		
			ramdaCal r1 = new ramdaCal();
			int result = r1.sub(5, 3);
			System.out.println(result);
		
		
		
			Multi r2 = new Multi() {

			@Override
			public int Multi(int x, int y) {
				// TODO Auto-generated method stub
				return x*y;
			}};
			
			int result2 = r2.Multi(5, 3);
			System.out.println(result2);
				
			 
			
			
			divide r3 = (a, b) -> {
				int sum;
				sum = a / b;
				return sum;
			};
			
			
			int result3 = r3.divide(20, 4);
			System.out.println( result3);
			
			
				
		}
	
	

}
