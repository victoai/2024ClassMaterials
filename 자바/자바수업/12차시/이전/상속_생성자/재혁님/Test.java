package day12.상속_생성자.재혁님;

public class Test {

	public static void main(String[] args) {
		
		
		Animal p = new Animal("고양이","야옹이");
				
		AnimalInfo s = new AnimalInfo("강아지","멍멍이",3);
		
		System.out.println(s.toString());

	}

}
