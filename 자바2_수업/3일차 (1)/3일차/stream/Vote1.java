package java2.day3.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;
 

public class Vote1 {

	public static void main(String[] args) throws IOException {
		 
		        BufferedReader reader = new BufferedReader(  new FileReader("src/java2/optional/stream/vote.txt")  );		 
		        ArrayList<String> list = new ArrayList<>();
		 
		        String str; 
		        while ((str = reader.readLine()) != null) {    // 한 줄씩 읽어온다
		        	
		        	 String[] result= str.split(",");    // , 콤마로 분리한다
		        	  for( String s : result) {
		        		  list.add(s);
		        	  }
		        }		        
		        
		        
	  	        Stream<String> stream  = list.stream();		        
		       // stream.filter( s -> s.trim().equals("김소영") ).forEach( s-> System.out.println(s));
		        long count = stream.filter( s -> s.trim().equals("김소영")).count();
		        System.out.println(  "김소영님 : " +  count);		      
			  
	    }	 
}
