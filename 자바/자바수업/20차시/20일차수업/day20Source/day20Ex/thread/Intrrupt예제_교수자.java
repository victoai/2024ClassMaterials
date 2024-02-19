package javaprj.day0128.day20Ex.thread;

 

public  class Intrrupt예제_교수자 {
	public static void main(String[] args)  	{
		 
 
		//스레드 실행 요청 ,스레드시작됨
		Counter4 counter = new Counter4 ();
		counter.start();		
		
		//시간지연을 시키기 위해 추가된 코드 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		 
			e.printStackTrace();
		}
			 	
		counter.interrupt();      // th1 스레드에  interrupt() 발생시킨다.		
		
		System.out.println("프로그램 종료");
	}
}




class Counter4 extends Thread {	
	public void run() {
		for(int i=10; i > 0; i--) { 
				try {
					sleep(1000);
					System.out.println(   i  + "!!");
				} catch (InterruptedException e) {	
					interrupt();// 자동초기화됨
					return;
					 
				}			 
		}
		
		
		if( isInterrupted()) {
			System.out.println( "인터럽트가 발생되었습니다");
		}
	}
}