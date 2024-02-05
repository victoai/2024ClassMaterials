package day12.상속_생성자.현수님;

public class Notebook { //
	
	String cpu;
	int ram;
	
	public Notebook() {
		System.out.println("dkdkdfkfkf");
		//this("i5", 8);
	}
	
	public Notebook(String cpu, int ram) {
		
		this.cpu = cpu;
		this.ram = ram;
	}

}
