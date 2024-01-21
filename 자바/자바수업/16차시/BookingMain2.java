package 프로젝트;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class BookingMain2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
 
		ObjectInputStream ois = null;
	 
				ois = new ObjectInputStream(new FileInputStream("res/testin.txt"));				 
 		       Booking booking = (Booking) ois.readObject();  		    
			    System.out.println(booking );
		
	}

}
 