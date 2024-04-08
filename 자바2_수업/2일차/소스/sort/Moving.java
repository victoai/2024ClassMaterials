package day2.lamda.sort;

public class Moving  implements Comparable<Moving>{
	String name;
	String code;
	int power;
	
	public Moving(String name, String code, int power) {
		super();
		this.name = name;
		this.code = code;
		this.power = power;
	}
	public Moving() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Moving [name=" + name + ", code=" + code + ", power=" + power + "]";
	}
	
	@Override
	public int compareTo(Moving o) {	 
		return this.name.compareTo(o.name);
	}

	
}
