package java2.day3.stream2;

import java.util.Arrays;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		 
		 Function<Integer, Integer[]> f  = a -> {
			 Integer[] b = {a*2,a*3,a*4};
			 return  b;
		 };		 
		 
		Integer[] result  = f.apply(3);		
		System.out.println( Arrays.toString(result));

	}

}
