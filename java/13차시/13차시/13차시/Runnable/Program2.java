package week04.day3.Runnable;

public class Program2 {
	
	 	
	public void mainrun( MyRunnable runnable) {
		runnable.run();		
	}

	
	public static void main(String[] args) {
		Program2 p = new Program2();		
		 
		//p.mainrun( new A());  //익명객체 
		//p.mainrun(new Battle());
		//p.mainrun(new Coffee());
		
		//p.mainrun(new Jjyrun());
		//p.mainrun(new Jjyrun());
		//p.mainrun(new kjs());
		//p.mainrun(new Mandarin());
		//p.mainrun(new ScoreAverage());
		//p.mainrun(new YhRun());
		//p.mainrun(new Star소영());
		// p.mainrun(new gugudan());
		 
		
		// p.mainrun( new MyRunnable() { });   // 빨간줄생기면 클릭한다 . - > 오버라이딩함
		 p.mainrun( new MyRunnable() {    
			@Override
			public void run() {
				System.out.println("실행해 주세요  !!");
				
		}});
	}

}
