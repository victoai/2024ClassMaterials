package day2.lamda.학생;

import java.util.ArrayList;
import java.util.function.Consumer;

public class 병진님 {

	public static void main(String[] args) {
		 
		
		ArrayList<Good> list2 = new ArrayList<Good>();
		list2.add(new Good("앞다리살 1근", 15000));
		list2.add(new Good("다진마늘(대량)", 8000));
		list2.add(new Good("간장 1L", 3000));
		list2.add(new Good("올때 메로나", 500));
		
		Consumer<Integer> f2 = new Consumer<>() {
		 
			@Override
			public void accept(Integer t) {
				
				int buyIndex=0;
		 
			     while( t>=0  ) { 					
						  for( int i=0; i< list2.size(); i++) {
							  int price  =list2.get(i).price;
							  if( t >= price) {
								 buyIndex=i;								 
							  }
							  else {
								  buyIndex=-1;	
								  
							  } 
							  break;
						  }	
					
				 if( buyIndex != -1) {
					  Good buy = list2.get(buyIndex);
					  t -= buy.price;
					  buy.count++; 
				 }
				} 
				
				for(  Good  good: list2) {
					System.out.println( good.name  + good.count +"개 구매");
				}
			} 			
		 
		 
		};
		f2.accept(30000);
	}

}
