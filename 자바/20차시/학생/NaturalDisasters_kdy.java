package day20.Thread연습;

public class NaturalDisasters {

	public static void main(String[] args) {
		
//		for(int i=0; i<100; i++)
//			System.out.println((i+1) + "다운로드 하시겠습니까?");
		NaturalDisastersStorm s = new NaturalDisastersStorm();
		s.start();
		
		NaturalDisastersEarthQuake e = new NaturalDisastersEarthQuake();
		e.start();

		NaturalDisastersDefense d = new NaturalDisastersDefense();
		d.start();
		
	}

}

class NaturalDisastersStorm extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(5000);
				System.out.println((i+1) + "폭풍이 몰려옵니다");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class NaturalDisastersEarthQuake extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(10000);
				System.out.println((i+1) + "진도 6의 지진이 시작됩니다");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class NaturalDisastersDefense extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(1000);
				System.out.println((i+1) + "자연재해를 대비하세요!!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
