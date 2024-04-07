package funInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class util {
	
	public static void main(String[] args) {
		
		
		
		Runnable  r = () -> {
			System.out.println(" hi ");};
			
			
	      r.run();
	    
	      
	    Supplier<String>  s  = () -> { return "dkdkfkf";} ;
	    
	    String resultStr  = s.get();
	    
	    Supplier<String>  s2  = () ->  "dkdkfkf" ;
	    
	    
	    Consumer<Integer>    c =   n -> System.out.println(n*n);
	    
	    
	    c.accept(10);
	    
	    
	    Function<Integer, Integer>  f =  n ->  { return n*n;};
	    
	    
	    int result0 = f.apply(5);
	    
	    
	    Predicate<String> p =  x ->   x.equals("이승원");
        
	    
	    boolean result  = p.test("이승원00");
	    		
	    
	}

}
