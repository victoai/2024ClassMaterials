package 연습문제1;

public class AnimalProgram {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Wolf();
		
		for(int i=0; i<animals.length; i++) {
			animals[i].sound();
			animals[i].animalsound();
			System.out.println("===========");
		}	
	}
}