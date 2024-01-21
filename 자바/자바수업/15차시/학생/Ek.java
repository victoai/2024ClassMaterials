package day0807.인터페이스;

public class Ek implements MyRunnable {

	@Override
	public void run() {
		System.out.println("은경코드를 실행합니다");
		int sum=0;
		for(int i =1; i<=10; i++) {
			sum +=i;
		}
		System.out.println(sum);
		
	}

	
}
