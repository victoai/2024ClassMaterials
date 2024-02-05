package day12.업다운캐스팅.병진님;

public class 오버라이딩 {
	public static void main(String[] args) { 		
		Cat a = new Cat(); 
		 // Cat이 Animal을 상속 받았다면
		 // Cat형 객체는 Cat형으로 다룰 수도 있고  Animal형으로 다룰 수도 있다
		Dog b = new Dog(); 
		 // Dog형 Animal을 상속 받았다면
		 // Dog형 객체는 Dog형으로 다룰 수도 있고  Animal형으로 다룰 수도 있다
//		print(a);
//		print(b);		
//		
//		printCat(a);
//		printDog(b);
		
		System.out.println("\nㅡㅡㅡㅡㅡ업캐스팅ㅡㅡㅡㅡㅡ");
		//업캐스팅
		Animal c = new Cat();
//		Animal c = new Cat();
//		Animal c = new Cat();
//		Animal c = new Cat();
//		Animal c = new Cat();
		c.먹는다(); //공통기능
//		c.쥐를잡는다(); //특수기능
		c.짖는다();
//		String d = "Cat";
//		System.out.println(d);
		System.out.println("ㅡㅡㅡㅡㅡ다운캐스팅ㅡㅡㅡㅡ");
		//다운 캐스팅
		Cat Ani = (Cat) c;
//		Cat Ani = (Dog) c;
		Ani.쥐를잡는다();
		
		System.out.println("ㅡㅡ관리예시");
		Animal f = new Dog();
		Animal g = new Animal();
		
		Animal[] all = {a,f,a,g,a};
		
		for(int i = 0; i<all.length; i++) {
			all[i].짖는다();
			if(all[i] instanceof Dog) {
				((Dog)all[i]).집을지킨다();
			}
		}
		
//		

	}	
	                         // Animal형을 매개변수로 받음 
	                         // Cat형과 Dog형을  Animal형으로 다룰 수 있다.
	public static void print( Animal animal) {		
		animal.짖는다();		
	}
	
	public static void printCat( Cat animal) {		
		animal.짖는다();		
	}
	
	public static void printDog( Dog animal) {		
		animal.짖는다();		
	}

}
