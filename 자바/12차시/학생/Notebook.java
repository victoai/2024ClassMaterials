package day12.상속;

public class Notebook {
	
	String cpu;
	int ram;
	
	public Notebook() {
		this("i5", 8);
	}
	
	public Notebook(String cpu, int ram) {
		this.cpu = cpu;
		this.ram = ram;
	}

}
