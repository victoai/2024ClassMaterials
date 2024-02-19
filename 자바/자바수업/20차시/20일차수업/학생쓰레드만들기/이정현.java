package thread;

import java.util.Scanner;

public class 실습Thread2 {
	
	public static void main(String[] args){
		Thread th = new Thread(new Count());
		th.start();
	}

}

class Count implements Runnable{
	Scanner sc = new Scanner(System.in);
	stop st = new stop();
	stop2 st2 = new stop2();

	
	@Override
	public void run() {
		loop : while(true){
			System.out.println("1번을 눌러 룰렛을 돌리고,2번을 눌러 룰렛을 멈추세요.");
			System.out.println("1번 숫자와 2번 숫자를 맞춰보세요!!");

			switch(sc.next()){
			case "1" :
				st.start();
				st2.start();
				break;
			case "2" :
				st.run = false;
				st2.run = false;
				break loop;
			}
		}
	System.out.println(" 1번 : " + st.num + "" + " 2번 :" + st2.num);
	if(st.num == st2.num){
		System.out.println("대박사건!!");
	}

	}
}

class stop extends Thread{
	Boolean run = true;
	int num=0;
	
	@Override
	public void run() {
		while(run){
			if(num >= 100){
				num = 0;
			}
			num++;
			System.out.println("1번" + num);
		}
		System.out.println(" 최종은 = " + num);
	}
}

class stop2 extends Thread{
	Boolean run = true;
	int num = 100;
	
	@Override
	public void run() {
		while(run){
			if(num<=0){
				num= 100;
			}
			num--;
			System.out.println("2번" + num);
		}
		System.out.println(" 최종은 = " + num);

	}


}
