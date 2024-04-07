package java2prj1.lamda.practice;

import java.util.function.Consumer;

public class Consumer_shopping {

	public static void main(String[] args) {
		 
		Consumer<Integer> shopping = budget->{
			
			String[] items = {"rummo","source","shrimp","pepper","bacon"};
			int [] prices = {3880,4980,14940,6000,6990};
			int sum=0;
		 
			
			for(int i=0;i<items.length;i++) {
				if(budget>=prices[i]) {
					sum+=prices[i];
					budget-=prices[i];
					System.out.println("구매한 물품: " + items[i] + " (￦: " + prices[i] + ")");
				}else {
					break;
				}
			}
			 System.out.println("남은 잔액: " + budget+"￦");
		};
		shopping.accept(30000);
	}

}
