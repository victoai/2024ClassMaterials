package day20.thread;

import java.util.Iterator;

public class 실습2_준태 {

	public static void main(String[] args) {
				
		end s =new end();
		s.start();		
//		map s2 =new map();//	
//		s2.start();

	}

}

class end extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {			
			Makemap s2 =new Makemap();	 	
 			s2.start(); 
 	
 
 			
			try {
				sleep(1600);
				
				System.out.println("==================");
				System.out.println(i+"번째 마을 지도 완성");
				System.out.println("==================");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}


class  Makemap extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=100; i=i+10) {
			try {
				sleep(100);
				System.out.println("지도 만드는중...."+"("+i+"%)");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

