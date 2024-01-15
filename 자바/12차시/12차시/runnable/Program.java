package prjDay11.runnable;

public class Program {
	 
	
	 public void  mainrun(  MyRunnable  r) {				
		r.run(); 
	 }
	 
	 
	public static void main(String[] args) {
		
		 Program p  = new Program();
		 
		//  p.mainrun( new Print10());   //혜리님
		 // p.mainrun( new PMJA());
		  // p.mainrun( new Runing());
		  // p.mainrun( new Menu());
		  // p.mainrun( new Dayoff());
		  // p.mainrun( new SayHello());
		  // p.mainrun( new PGHRun());
		  // p.mainrun( new CIH());
		   p.mainrun( new Dog());
		  
		 
	}

}
