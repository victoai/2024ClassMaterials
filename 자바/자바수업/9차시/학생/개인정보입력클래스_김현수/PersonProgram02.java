package 실습9차시;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonProgram02 {
	
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		Boolean isMarreid;
		int number_of_children;
		
		for(int i=0; i<3; i++) {
			System.out.println("이름 : "); name = sc.next();
			System.out.println("나이 : "); age = sc.nextInt();
			System.out.println("결혼여부 : "); isMarreid = sc.nextBoolean();
			System.out.println("자녀수 : "); number_of_children = sc.nextInt();
			
			Person p = new Person(name, age, isMarreid, number_of_children);
			list.add(p);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
	}

}
