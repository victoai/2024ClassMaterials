package week03.day2.영빈님;


public class 요기요 {

	private String[] 맛집 = {
			"엉터리 생고기",
			"영빈식당",
			"싸다김밥",
			"열정타코"
	} ;
	private String[] 위치 = {
			"동교동 115-1",
			"동교동 115-2",
			"동교동 115-3",
			"동교동 115-4"
	};
	private String[] 점심= {
			"김밥",
			"라면",
			"햄버거",
			"타코야키",
	};
	int index;
		


	public void printInfo() {
		System.out.println("===홍대 맛집===");
		for(int i=0; i<맛집.length; i++) {
			System.out.println(맛집[i]);
			System.out.println(위치[i]);
		}
	}
	
	public String 오늘점심추천() {
		System.out.println("===랜덤 점심===");
		int index=(int)(Math.random()*4);
		this.index=index;
		String result = 점심[index];
		return result;
	}
	
}


