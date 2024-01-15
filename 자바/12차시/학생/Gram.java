package day12.상속;

public class Gram extends Notebook {
	String name;
	String gpu;
	
	public Gram(String cpu, int ram, String name, String gpu) {
		super(cpu, ram );
		this.cpu = cpu;
		this.ram = ram;
		this.name = name;
		this.gpu = gpu;
	}
	
	public String toString() {
		return name + cpu + ram + gpu;
	}
}
