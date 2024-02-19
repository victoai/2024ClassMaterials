package 실습;

public class 박민주실습 {

	public static void main(String[] args) {

		ThreadClass1 thc1;
		for(int i=0 ; i<200;i++){
			thc1 = new ThreadClass1(i);
			thc1.start();		
		}
		
		Thread thi2 = new Thread(new Runnable(){
			
			@Override
			public void run() {
				for(int i=0; i<400;i++){
					System.out.println("##익명클래스 작성## >>" + i + "<<");
				}
			}
		});
		thi2.start();
		for(int i=0; i<400; i++){
			Thread thi1  = new Thread(new ThreadInter1(i));
			thi1.start();
		}
		
	}

}

class ThreadClass1 extends Thread{
	int number;
	
	
	public ThreadClass1() {
		// TODO Auto-generated constructor stub
	}
	public ThreadClass1(int number) {
		this.number = number;
	}
	@Override
	public void run() {
		
		
		System.out.println(this.number + "@@클래스 상속받기@@");
		
	}
}
class ThreadInter1 implements Runnable{
	int number;
	public ThreadInter1(int number){
		this.number = number;
	}
	@Override
	public void run() {
		
		System.out.println("!!인터페이스 정의!!" + this.number);

		
	}
}
