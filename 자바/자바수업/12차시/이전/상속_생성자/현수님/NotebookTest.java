package day12.상속_생성자.현수님;

public class NotebookTest {
	
	public static void main(String[] args) {
		
		//Gram g2 = new Gram();
		
		Gram g = new Gram("i7", 16, "Gram", "RTX4090");
		System.out.println(g.toString());
	}

}
