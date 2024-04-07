package java2prj1.day0926.lamda.실습;

import java.util.ArrayList;

public class Food {

	String name;
	ArrayList<Material> ma;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(String name, ArrayList<Material> ma) {
		super();
		this.name = name;
		this.ma = ma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Material> getMa() {
		return ma;
	}

	public void setMa(ArrayList<Material> ma) {
		this.ma = ma;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", ma=" + ma + "]";
	}
	
}
