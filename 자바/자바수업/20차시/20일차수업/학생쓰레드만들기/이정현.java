package thread;

import java.util.Scanner;

public class �ǽ�Thread2 {
	
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
			System.out.println("1���� ���� �귿�� ������,2���� ���� �귿�� ���߼���.");
			System.out.println("1�� ���ڿ� 2�� ���ڸ� ���纸����!!");

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
	System.out.println(" 1�� : " + st.num + "" + " 2�� :" + st2.num);
	if(st.num == st2.num){
		System.out.println("��ڻ��!!");
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
			System.out.println("1��" + num);
		}
		System.out.println(" ������ = " + num);
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
			System.out.println("2��" + num);
		}
		System.out.println(" ������ = " + num);

	}


}
