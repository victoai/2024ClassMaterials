package 연습문제1;
/*다형성 구현하기   (
     ( 상속에서가능, 오버라이딩으로 구현됨).
     자식형 type을  부모형으로 다룰 수 있다. 
    고양이, 강아지, 늑대를  동물로 다룰 수있다.
    동물들을 모두 짖게 만들어 보세요 !     */
public class Animal {
	
	public void sound() {
		System.out.println("동물들 짖는 소리");
	}

	public void animalsound() {
	}
}