package iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Object쓰기_ {

	public static void main(String[] args) {	 
		
		Score s = new Score("kim",100,90);
		Score s2 = new Score("lee",50,90);
		
 
		
		try {
			ObjectOutputStream  os = new ObjectOutputStream
					              ( new FileOutputStream("obj2.txt"));
			
			os.writeObject(s);
			os.writeObject(s2);	
			
			os.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		

	}

}
