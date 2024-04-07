package java2.day4.변경이유리한코드.animal;

public class Ex03 {
	
	public static void main(String[] args) {		
		Animal animal = getAnimal(); 
		
		animal.bark();
		
		Animal animal2 = getAnimal();		
		Animal animal3 = getAnimal(); 
		Animal animal4 = getAnimal();
		Animal animal5 = getAnimal();
	}
	
	
	public static Animal getAnimal() {	
		return new Cat();  // Cat -> Dog 
	}

}
