package thread;

public class slaythespire {

		public static void main(String[] args) {
			
				AT at = new AT();
				at.start();
				
				DF  df= new DF();
				df.start();
				
				EX ex = new EX();
				ex.start();
				
				
			
		}
}
class AT extends Thread{
	@Override
	public void run() {
		for(int i=0; i<80; i++) {
		System.out.println("캐릭터가 상대방을 공격하였습니다.");
		}
	}
}
class DF extends Thread{
	@Override
	public void run() {
		for(int i=0; i<70; i++) {
		System.out.println("캐릭터가 상대방의 공격을 방어합니다.");
		}
	}
}
class EX extends Thread{
	@Override
	public void run() {
		for(int i=0; i<40; i++) {
		System.out.println("캐릭터가 상대의 공격을 회피합니다.");
		}
	}
}
