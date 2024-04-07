package java2.day3.reflect.animal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ex04 {
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException  {		 
		 Animal animal1= getAnimal();
		 Animal animal2= getAnimal();
		 Animal animal3= getAnimal();
		 Animal animal4= getAnimal();	
		 animal1.bark();
		 animal2.bark();
		 animal3.bark();
		 animal4.bark();
	}		
	public static Animal getAnimal() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException  {
		Properties  p = new Properties();
		p.load(new FileReader("src/java2/reflect/animal/config.txt"));
		Class clazz =Class.forName( p.getProperty("animal"));
		Animal animal =(Animal)clazz.newInstance();
		return animal;
	}

}
