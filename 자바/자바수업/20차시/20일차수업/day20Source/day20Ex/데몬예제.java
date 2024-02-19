package javaprj.day0128.day20Ex;

 

public  class 데몬예제 {
	public static void main(String[] args)  	{
		 
 
		//스레드 실행 요청 ,스레드시작됨
		MyThread4 th1 = new MyThread4();
		th1.setDaemon(true);   // 데몬스레드로 생성, 자동으로 메인 스레드가 끝나면 종료됨
		th1.start();		 
		System.out.println("main 종료");
		 
	 
	}
}


 