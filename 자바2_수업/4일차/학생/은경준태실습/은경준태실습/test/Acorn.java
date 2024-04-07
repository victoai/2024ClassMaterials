package java2.test;

public class Acorn {
	String id;
	String name;
	
	public Acorn() {
		this("acorn","에이콘");
	}

	public Acorn(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + "]";
	}
	public void printInfo() {
		System.out.println( "id=" + id);
		System.out.println( "name=" + name);
	}
	
	
}
