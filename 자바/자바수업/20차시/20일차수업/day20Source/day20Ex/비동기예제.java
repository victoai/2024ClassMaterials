package javaprj.day0128.day20Ex;

import javax.swing.JOptionPane;

public  class 비동기예제 {
	public static void main(String[] args) throws Exception 	{
		MyThread1 th1 = new MyThread1();
		th1.start();		
		//이 흐름이 끝나고 다음이 실행됨 = >
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}

class MyThread1 extends Thread {
	public void run() {
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e ) {}
		}
	}
}