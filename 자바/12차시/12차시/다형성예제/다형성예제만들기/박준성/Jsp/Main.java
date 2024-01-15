package prjDay11.Jsp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eat e=new Eat();
		Sleep s=new Sleep();
		
		System.out.println("-----하루 계획-----");
		e.activity();
		e.meal();
		s.activity();
		s.sleepp();
		
	}

}
