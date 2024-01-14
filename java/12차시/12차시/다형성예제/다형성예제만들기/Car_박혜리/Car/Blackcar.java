package Car;

public class Blackcar extends Car{
private String name = "검은차";
	
	public void go() {
		System.out.println(name+"가 나갑니다. 부르르르릉");
	}
	
	public static void fly() {
		System.out.println("하늘을 납니다.");
	}
}
