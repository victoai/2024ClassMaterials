package 실습9차시;

import java.util.ArrayList;

public class PersonProgram01 {
	public static void main(String[] args) {
		Person person = new Person("김현수", 31, true, 1);
		
		System.out.println(person.toString());
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("송지현", 33, true, 1));
		list.add(new Person("김화평", 0, true, 0));
		
		// 고객 목록 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
