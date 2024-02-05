package day12.업다운캐스팅.병진님;


//상속받을 때 사용하는 키워드    extends 
// 확장하다
public class Cat  extends Animal {

	public void 쥐를잡는다() {
		System.out.println(" 쥐를 잡는다");
	}
	
	//오버라이딩(부모에 있는 매서드를 재정의)
	@Override
	public void 짖는다() {
		System.out.println("야옹");
	}
}
