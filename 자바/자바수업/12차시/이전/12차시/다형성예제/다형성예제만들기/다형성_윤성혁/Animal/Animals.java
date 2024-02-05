package Animal;

public class Animals {

	public static void main(String[] args) {
		
		
		
		Cat cat = new Cat();
		cat.bark();
		cat.잠자기();
		
		Chicken chicken = new Chicken();
		chicken.bark();
		chicken.날기();
		
		Dog dog = new Dog();
		dog.bark();
		dog.냄새맡기();
			
		Llama llama = new Llama();
		llama.bark();
		llama.침뱉기();
		
		System.out.println();
		
		/////////////////////////////////
		Animal[] animals = new Animal[4];
		animals[0] =cat;
		animals[1] =chicken;
		animals[2] =dog;
		animals[3] =llama;
		
		animals[0].bark();
		animals[1].bark();
		animals[2].bark();
		animals[3].bark();
		printCat(cat);
		printChicken(chicken);
		printDog(dog);
		printLlama(llama);
		
		System.out.println();
		
		/////////////////////////////////
		Animal animal = new Animal();
		printAnimal(animal);
		
		printAnimal(cat);
		printAnimal(chicken);
		printAnimal(dog);
		printAnimal(llama);
		
	}
	
	public static void printAnimal(Animal animal) {
		animal.bark();
		if(animal instanceof Cat) {
			((Cat) animal).잠자기();
		}
		else if(animal instanceof Chicken) {
			((Chicken) animal).날기();
		}
		else if(animal instanceof Dog) {
			((Dog) animal).냄새맡기();
		}
		else if(animal instanceof Llama){
			((Llama) animal).침뱉기();
		}
	}

	public static void printCat(Cat cat) {
		cat.잠자기();
	}
	
	public static void printChicken(Chicken chicken) {
		chicken.날기();
	}
	
	public static void printDog(Dog dog) {
		dog.냄새맡기();
	}
	
	public static void printLlama(Llama llama) {
		llama.침뱉기();
	}
}
