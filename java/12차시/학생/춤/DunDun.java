package day12.다형성예제;

public class DunDun extends Person{
	@Override // Person의 public void dance()를 오버라이드
	public void dance() {
		System.out.println("오마이걸 던던댄스를 춘다. 둠칫둠칫");
	}
}
