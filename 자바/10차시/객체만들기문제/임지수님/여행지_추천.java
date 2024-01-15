package week03.day2.임지수님;

public class 여행지_추천 {

	private String[] 여행지 = {
			"가평" , "부산" , "인천", "제주" , "전주"
	} ;
	private String[] 탈것  = {
			"렌트카", "ktx", "비행기", "스쿠터", "고속버스"
	};
	private String[] 숙소 = {
			"에어비앤비" ,  "호텔", "풀빌라", "펜션", "캠핑"
	};
	int index;
		


	public String 여행지추천() {
		
		System.out.println("===어디로 갈까요?===");
		
		int index=(int)(Math.random()*5);
		this.index=index;
		String result1 = 여행지[index];
		return result1;
		
		
	}
	
	public String 탈것추천() {
		
		System.out.println("===뭐 타고 갈까요?===");
		
		int index=(int)(Math.random()*5);
		this.index=index;
		String result2 = 탈것[index];
		return result2;
	}
		
	public String 숙소추천() {
		
		System.out.println("===숙소는 어디로 할까요?===");
		
		int index=(int)(Math.random()*5);
		this.index=index;
		String result3 = 숙소[index];
		return result3;
	}

}
