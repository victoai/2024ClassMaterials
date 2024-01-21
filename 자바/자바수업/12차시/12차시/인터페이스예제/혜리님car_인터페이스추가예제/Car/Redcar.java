package Car;

public class Redcar extends Car  implements Openable{
	private String name = "빨간차";
	
	public void go() {
		System.out.println(name+"가 나갑니다. 부르응부르응~");
	}
	
	public void open() {
		System.out.println(name+"가 썬루프를 엽니다.");
	}
	
	
}
