package prjDay11;

public class Program {

		public void mainhello(MyRunnable r) {
			r.sayHello();
		}
		
		
		public static void main(String[] args) {
			
			Program p = new Program();
			p.mainhello(new SayHello());
		}

		
}
