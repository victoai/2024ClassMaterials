import java.util.ArrayList;

public class 실습Program {

	public static void main(String[] args) {
		
		실습 실습 = new 실습("아이디", "비번", "이름", 12);
		
		System.out.println(실습.toString());
		
		
		ArrayList<실습> list = new ArrayList<>();
		list.add(new 실습("아이디1", "비번1", "이름1", 12));
		list.add(new 실습("아이디2", "비번2", "이름2", 13));
		list.add(new 실습("아이디3", "비번3", "이름3", 14));
		list.add(new 실습("아이디4", "비번4", "이름4", 15));
		list.add(new 실습("아이디5", "비번5", "이름5", 16));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
