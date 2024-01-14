package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Object읽기_ {

	public static void main(String[] args) {
		 
		
		try {
			
			 ObjectInputStream oi = new ObjectInputStream(  new FileInputStream("obj2.txt"));
			 Score s = (Score) oi.readObject();			
			 System.out.print(s);
			 
			 Score s2 = (Score) oi.readObject();			
			 System.out.print(s2);
			 
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
