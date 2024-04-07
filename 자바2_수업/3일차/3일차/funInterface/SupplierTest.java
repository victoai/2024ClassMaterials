package funInterface;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		
		Supplier<String[]>  s = () ->{
			 String[]  ss=  {"레시피1", "레시피2"};
			 return ss;			
		};
		
		Supplier<ArrayList<Object>>  s2 = () ->{
			ArrayList< Object>   list = new ArrayList<>();			
			list.add( new A());
			list.add( new B());			
			return list;
			
		};
		
		ArrayList<Object> re= s2.get();
		
		 A a  = (A)re.get(0);
		 a.레시피만들기();

	}

}
