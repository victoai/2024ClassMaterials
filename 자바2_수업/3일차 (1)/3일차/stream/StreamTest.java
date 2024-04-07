package java2.day3.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;
 

public class StreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		        BufferedReader reader = new BufferedReader(  new FileReader("aa.txt")  );		 
		        ArrayList<String> list = new ArrayList<>();
		 
		        String str;
		        while ((str = reader.readLine()) != null) {
		            list.add(str);
		        }		        
		        
		       // System.out.println( list.size());		        
		        Stream<String> stream  = list.stream();		        
		        stream.filter( s -> s.startsWith("BB")).forEach( s-> System.out.println(s));	 
		        //  stream.filter( s -> s.endsWith("BB")).forEach( s-> System.out.println(s));	 
		      //  stream.filter( s ->   s.substring(0, 2).equals("BB")  ).forEach( s-> System.out.println(s));
		  
		        
		        
		 
	}

}
