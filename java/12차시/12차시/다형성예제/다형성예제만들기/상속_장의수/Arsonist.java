package 상속_장의수;

public class Arsonist extends Person{
	
	public Arsonist() {
	}

	public Arsonist(String name) {
		super(name);
	}
	
	public void arson() {
		System.out.println(name+"은(는) 불을 질렀다!");
	}
}
