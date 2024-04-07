package java2.day3.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;
 

public class Vote2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		        BufferedReader reader = new BufferedReader(  new FileReader("src/java2/optional/stream/vote.txt")  );		 
		        ArrayList<String> list = new ArrayList<>();
		 
		        String str;
		        while ((str = reader.readLine()) != null) {
		        	
		        	 String[] result= str.split(",");
		        	  for( String s : result) {
		        		  list.add(s);
		        	  }
		        }		        
		        
		        
		       //참여자명단
		        String[] names = { "김소영" , "박초희" , "이호진"  , "원재호" , "임영빈" , "김영현" , "고기현" , "임지수" , "조재연" , "김준서" ,"조은진" , "유다현" ,"함희원"} ;
		        		        
		        for( String name: names) {	        
			        Stream<String> stream  = list.stream();        			      
			        long count = stream.filter( s -> s.trim().equals(name)).count();
			        System.out.println( name + "님 투표수 ="  +   count);			  
		        }		        
		 
	}

}
