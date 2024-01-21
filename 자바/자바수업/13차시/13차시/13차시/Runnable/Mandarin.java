package week04.day3.Runnable;

public class Mandarin implements MyRunnable {
	public Mandarin() {
		System.out.println("수업이 시작해요");
	}
	@Override
	public void run() {
		System.out.println("그런데 저는 또 중간에 졸았네요! ");
	//추상매서드 강제 => 이부분은 언제든지 바뀔수 있는 것
	}

}
