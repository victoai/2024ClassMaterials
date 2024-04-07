package java2prj1.lamda.practice;

import java.util.function.Supplier;

public class Supplier_cooking {

	public static void main(String[] args) {
		 
		Supplier<String> cooking = ()->{
		
			System.out.println("1.땅콩버터 1/2 큰 스푼, 식초 1/2 큰 스푼, 진간장 1/2 큰 스푼, 설탕 2 큰 스푼, msg(미원) 약간, 참기름 1/2 큰 스푼, 라오깐마 소스 1 큰 스푼을 넣고 소스를 만듭니다.");
			System.out.println("2. 물을 500ml 정도 넣고 끓입니다. 라면 면을 넣고 삶은 후 찬물에 넣고 헹굽니다. 만들어 놓은 소스를 면에 넣고 비빕니다. 그리고 썰어 놓은 오이와 삶은 계란을 올리면 맛있는 라오깐마 비빔면이 완성됩니다");
			return "땅콩버터 비빔면 완성!";
		 
		};
		String result = cooking.get();
		System.out.println(result);
		
		
	}

}
