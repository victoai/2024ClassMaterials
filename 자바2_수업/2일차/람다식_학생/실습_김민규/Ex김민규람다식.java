package jaba2prj1.lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import jaba2prj1.lamda.람다연습김민규.SqureInterface;

public class Ex김민규 {
public static void main(String[] args) {
	
	//1번
	
	Runnable bucket =  ()->{
		System.out.println("돈벌기");
		
	};
	bucket.run();
	
	//2번
	System.out.println("========================");
	Consumer<Integer> buy = (money) -> {
		 int 삼겹살600g = 16000;
		 int 허브솔트 = 4000;
		 int 쌈채소 = 2000;
		 int 쌈장 = 2000;
		 int 햇반 =1500;
		 int 제로콜라 =3000;
		    int result = money - 삼겹살600g- 허브솔트 -쌈채소-쌈장-햇반-제로콜라;
		    System.out.println("삼겹살600g"
		    		+ 삼겹살600g
		    		+ "원\n\n"		    		
		    		+ "허브솔트"
		    		+ 허브솔트+"원\n\n"	
		    				+ "쌈채소"
		    				+ 쌈채소
		    				+ "원\n\n"
		    				+ "쌈장"
		    				+ 쌈장
		    				+ "원\n\n"
		    				+ "햇반"
		    				+ 햇반
		    				+ "원\n\n"
		    				+ "제로콜라"
		    				+ 제로콜라
		    				+ "원\n\n"
		    				+ "남은돈"+result+"원");
	};
	buy.accept(30000);
	System.out.println("========================");
	//3번
	
	Supplier<String> food = () -> {
	    System.out.println("삼겹살 굽기"
	            + "\n얼추 구워지면 허브 솔트 뿌리기"
	            + "\n쌈 채소 씻기"
	            + "\n쌈장 뚜껑까기"
	            + "\n햇반 데우기"
	            + "\n제로 콜라 따르기"
	            + "\n맛밥");
	    return "삼겹살 정식";
	};

	String result = food.get();
	
	System.out.println("음식 이름: " + result);
	System.out.println("========================");
	//4번
	Predicate<String> dish = (str)->{
		if(str.equalsIgnoreCase("삼겹살정식"))
			return true;
		else
			return false;
	};
	System.out.println(dish.test("삼겹살정식"));
	
	System.out.println("========================");
	
	Function<Integer, Integer> square = (num) -> {
	    // 입력으로 들어온 수의 제곱을 반환합니다.
	    return num * num;
	};
	
	System.out.println(square.apply(20));
	

	
	Function<Integer , Integer> random = (num) -> {
	return ((int)(Math.random()*num));
	};
	System.out.println("========================");
	System.out.println(random.apply(30));
	
	System.out.println("========================");
	Function<Integer , int[]> count = (num)->{
		int 오만원 = (num/50000);
		int 만원 = (num%50000)/10000;
		int 오천원 = (num%10000)/5000;
		int 천원= (num%5000)/1000;
		int 오백원= (num%1000)/500;
		int 백원= (num%500)/100;
		
		int[] r = new int[6];
		r[0]=오만원;
		r[1]=만원;
		r[2]=오천원;
		r[3]=천원;
		r[4]=오백원;
		r[5]=백원;
		
		
		return r ;
	};
	
	
	  int[] result5=  count.apply(377900);

	    for(int i =0; i<result5.length; i++) {
	    	  System.out.println(result5[i]);
	    }  
	   
}

}
