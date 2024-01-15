package inheritance실습;

public class AnimalProgram {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.기다려();
		dog.달려();
		dog.먹어();
		dog.울어();
		dog.집지키기();
		System.out.println("=================");
		
		Cat cat = new Cat();
		cat.기다려();
		cat.울어();
		cat.츄르();
		System.out.println("=================");
		
		Wolf wolf = new Wolf();
		wolf.울어();
		wolf.공격();
		System.out.println("=================");
		
		
		Animal_Training[] training = new Animal_Training[3];
		training[0] = dog;
		training[1] = cat;
		training[2] = wolf;
		
		training[0].울어();
		training[1].울어();
		training[2].울어();
		System.out.println("=================");
		
		
		for(int i=0; i<training.length; i++) {
			training[i].울어();
		}
		System.out.println("=================");
		
		
		
		printDog(dog);
		printCat(cat);
		printWolf(wolf);
		
		printAnimal_Training(dog);
		printAnimal_Training(cat);
		printAnimal_Training(wolf);

	}
	
	
	public static void printDog(Dog dog) {
		dog.울어();
	}
	
	public static void printCat(Cat cat) {
		cat.울어();
	}
	
	public static void printWolf(Wolf wolf) {
		wolf.울어();
	}
	
	public static void printAnimal_Training(Animal_Training training) {
		training.울어();
		if(training instanceof Dog) {
			((Dog)training).집지키기();
		}
		if(training instanceof Cat) {
			((Cat)training).츄르();
		}
		if(training instanceof Wolf) {
			((Wolf)training).공격();
		}
	}

}
