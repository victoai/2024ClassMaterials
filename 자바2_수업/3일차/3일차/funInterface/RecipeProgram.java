package funInterface;

import java.util.ArrayList;
import java.util.function.Supplier;
public class RecipeProgram {			
	public void print레시피(  Supplier< String> c ) {		
		String   레시피 = c.get();			
		System.out.println(" 레시피******");
		System.out.println(레시피);		
	}	 
	public static void main(String[] args) {		 
		RecipeProgram  p = new RecipeProgram();		
		p.print레시피( new Cook1());
		p.print레시피( new Supplier<>() {
			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "감바스 레시피";
			}});
		
		p.print레시피( () -> "  짜장면 만들기 레시피");	 

	}

}
