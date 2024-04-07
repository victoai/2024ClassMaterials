package 실습;

import java.util.function.Predicate;

public class 실습_Predicate {

	public static void main(String[] args) {
		
		Predicate<String> p = (food) -> {
			if(food.equals("라면") || food.equals("밥")){
				return true;
			}else{
				return false;
			}
		};
		
		String[] foods = {"라면", "밥", "죽", "김밥"};
		
		for(String f : foods){
			if(p.test(f)){
				System.out.println(f + "내꺼");
			}else{
				System.out.println(f + "니꺼");
			}
		}

	}

}
