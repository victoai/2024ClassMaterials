package java2.interfaceEx.cook;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
	 

		//Cook형을 담을 수 있는 ArrayList를 준비한다
		ArrayList<Cook> list = new ArrayList<Cook>();
		  
		// Cook을 상속받았으므로 각 각의 요리사 클래스를 담을 수 있다
		list.add(new Cookus("장의수"));
		list.add(new HjwCook("홍정원"));
		list.add(new HrCook("박혜리"));
		list.add(new InhoCook("최인호"));
		list.add(new LKICook("이광일"));
		list.add(new making_pizza("이정현"));
		list.add(new minjoo("박민주"));
		list.add(new pgh_Koreanfood("박근현"));
		list.add(new shCook("윤성혁"));
		list.add(new SunCook("김선명"));
		list.add(new Cookus("장의수"));		 
		list.add(new Cookus("홍윤성"));
		list.add(new LswCook("이승원"));
		list.add(new bumjunCook("최범준"));
		list.add(new MinaCook("김민아"));
		list.add(new JunSungCook("박준성"));

		// 요리사별로 ArrayList 준비하기
		ArrayList<한식가능한> 한식요리사 = new ArrayList<한식가능한>();
		ArrayList<중식가능한> 중식요리사 = new ArrayList<중식가능한>();
		ArrayList<양식가능한> 양식요리사 = new ArrayList<양식가능한>();

		
		// 요리사종류별로 목록을 구성한다.
		for (Cook cook : list) {
			if (cook instanceof 한식가능한) {
				한식요리사.add((한식가능한) cook);
			} else if (cook instanceof 중식가능한) {
				중식요리사.add((중식가능한) cook);
			} else if (cook instanceof 양식가능한) {
				양식요리사.add((양식가능한) cook);
			}
		}

		System.out.println("--한식 요리사 입니다--");
		System.out.println(한식요리사);

		System.out.println("--중식 요리사 입니다--");
		System.out.println(중식요리사);

		System.out.println("--양식 요리사 입니다--");
		System.out.println(양식요리사);

		
		// 랜덤한 값 얻어오기
		int random = (int) (Math.random() * 3); // 0~2; 
		
		
		//선택한 요리사종류 출력하기
		String[] kinds = { "한식가능한", "중식가능한", "양식가능한" };
		String selectedKind = kinds[random];
		System.out.println("==========>선택된 요리사 kind  ====>" + selectedKind);

		 
		//선택된 요리사종류  중에서 한 명의 요리사 선택하기 
		int randomRange = 0;
		int finalOne;
		Cook fianlCook = null;

		switch (selectedKind) {
		case "한식가능한":
			for (한식가능한 cook : 한식요리사) {
				System.out.println(cook);
			}
			 randomRange = 한식요리사.size();
			System.out.println("randomRange="+ randomRange);
			finalOne = (int) (Math.random() * randomRange);
			fianlCook = (Cook) 한식요리사.get(finalOne);
			System.out.println("====>최종선발");
			System.out.println(fianlCook);
			break;

		case "중식가능한":
			for (중식가능한 cook : 중식요리사) {
				System.out.println(cook);
			}
			randomRange = 중식요리사.size();
			System.out.println("randomRange="+ randomRange);
			finalOne = (int) (Math.random() * randomRange);
			fianlCook = (Cook) 중식요리사.get(finalOne);
			System.out.println("====>최종선발");
			System.out.println(fianlCook);
			break;

		case "양식가능한":
			for (양식가능한 cook : 양식요리사) {
				System.out.println(cook);
			}
			randomRange = 양식요리사.size();
			System.out.println("randomRange="+ randomRange);
			finalOne = (int) (Math.random() * randomRange);
			fianlCook = (Cook) 양식요리사.get(finalOne);
			System.out.println("====>최종선발");
			System.out.println(fianlCook);
			break;
		}

	}

}
