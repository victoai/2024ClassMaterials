package prjDay12;

import java.util.ArrayList;

public class CoffeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Coffee> list = new ArrayList<Coffee>();
		
		
		
		list.add(new Coffee("아메리카노",237,13,2000));
		list.add(new Coffee("콜드브루",195,19,	4000));
		list.add(new Coffee("더블에스프레소",237,22,1500));
		
		Object obj = new Coffee("카페모카",237,365,3500);
		//String rtn = obj.toString();
		String rtn2 = (	(Coffee) obj ).toString();
		
		System.out.println(	( (Coffee)list.get(0) ).toString()	+"\n");
		
		//System.out.println( list.get(0) );
		System.out.println( list.get(1) +"\n" );
		System.out.println( list.get(2) +"\n");
		

		System.out.println(rtn2);
		
		/*for(int i=0; i<list.size(); i++) {
			System.out.println( list.get(i) +"\n");
		}*/
	}

}
