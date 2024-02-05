package javaprj.day0205;
public class Ex03 {
	public static void main(String[] args) { 		
		Cat a = new Cat(); 		 
		Dog b = new Dog(); 
		
		
		
		Animal[] animal  = new Animal[3];
		animal[0] = a;
		animal[1]=b; 
		//
		
		for( int i =0 ; i< animal.length ; i++) {
			 animal[i].짖는다();
		} 
		
	 
	}	
	 
	
	
	
	 

}
