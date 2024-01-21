package prjDay12;

import java.util.ArrayList;

public class PersonEx {

	public static void main(String[] args) {
		PersonInfo p  = new PersonInfo("김", 1995, 5, 19, "강서구");
		p.setDay(29);
		String result = p.getInfo();
		
		System.out.println(result);
		
		ArrayList<PersonInfo> list = new ArrayList<>();
		
		list.add(new PersonInfo("박", 1990, 8, 22,"강원도"));
		list.add(new PersonInfo("최", 1987, 6, 3,"충청도"));
		list.add(new PersonInfo("이", 2000, 4, 16,"제주도"));
		
		Object obj = new PersonInfo("남궁", 1882, 2, 22, "전라도");
		
		System.out.println(((PersonInfo)obj).getInfo());
		
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

	}

}
