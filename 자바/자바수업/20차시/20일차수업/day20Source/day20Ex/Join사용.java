package javaprj.day0128.day20Ex;

 

public  class Join사용 {
	public static void main(String[] args)  	{
		 
 
		//스레드 실행 요청 ,스레드시작됨
		MyThread4 th1 = new MyThread4();
		th1.start();	
		
		
		try {
			if(th1.isAlive())
				th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main 종료");
		 
	 
	}
}


 