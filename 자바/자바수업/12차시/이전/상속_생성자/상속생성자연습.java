package day12.상속_생성자;

public class 상속생성자연습 {

	public static void main(String[] args) {
		 //Person p = new Person();  // 불가능하다, 기본생성자가 없으므로 불가능
		Person p = new Person("허재혁", "h100");			
		
		Student s = new Student("김민규" ,"k100", 1);	
		System.out.println( s.toString());
		
		
	}

}
