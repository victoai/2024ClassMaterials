package day20.thread.interrupt;

 

public  class Intrrupt예제 {
	public static void main(String[] args)  {
		 
 
		//스레드 실행 요청 ,스레드시작됨
		Counter2  counter = new Counter2 ();
		counter.start();		
		
		//시간지연을 시키기 위해 추가된 코드 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		 
			e.printStackTrace();
		}
		
		//5초후에 카운터애 인터럽트 발생시킴 그래서 종료시키고 싶다면?? 
		counter.interrupt();      // counter 스레드에  interrupt() 발생시킨다.
		
		System.out.println("프로그램 종료");
	}
}




class Counter2  extends Thread {	
	public void run() {
		for(int i=10; i > 0; i--) { 
				try {
					sleep(1000);
					System.out.println(   i  + "!!");
				} catch (InterruptedException e) {				 
					  	                          // 인터럽트 발생했을 때 종료하게 하기			  인터럽트가 발생한다고 멈추지 않는다 ,쓰레드가 멈추지 않는다.
					e.printStackTrace();   //인터럽트게 발생했을 때 해야할 일 코드로 작성
					//return;	
				}			 
		} 
		 
	}
}