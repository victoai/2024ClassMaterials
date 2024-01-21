package Car;

public class Bluecar extends Car{
	private String name = "파란차";
	
	public void go() {
		System.out.println(name+"가 나갑니다. 뛰뛰빵빵");
	}
	
	public void underwater() {
		System.out.println("잠수합니다.");
	}
	public void open() {
		System.out.println(name+"가 창문을 엽니다.");
	}
	
}
