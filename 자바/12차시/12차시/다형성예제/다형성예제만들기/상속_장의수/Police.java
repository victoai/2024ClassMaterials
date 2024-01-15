package 상속_장의수;

public class Police extends Person {

	public Police() {
	}

	public Police(String name) {
		super(name);
	}

	public void arrest(String name) {
		System.out.println(this.name + "은(는) "+name+"을 체포했다!");
	}
}
