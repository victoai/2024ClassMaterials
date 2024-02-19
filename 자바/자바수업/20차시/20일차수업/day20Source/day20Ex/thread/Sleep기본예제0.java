package javaprj.day0128.day20Ex.thread;

public class Sleep기본예제0 {

	public static void main(String[] args) {
		 

		new SleepThread().start();
	}

}




class  SleepThread extends Thread{	
	@Override
	public void run() {
		System.out.println(" 3초후에 공개합니다");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {     //   sleep 하고 있는데 외부의   interrup()가 호출되면   interruptedExceptio  객체가 발생하여 catch블럭으로 넘어감
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("짜짠 ~~~  3초가 지났어요  .. ");
	}
}