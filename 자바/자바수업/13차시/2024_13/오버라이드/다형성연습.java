package day13.오버라이드;

public class 다형성연습 {

	public static void main(String[] args) {
		
		
		System.out.println("<<김민지님이 춤을 춘다>>");
		김민지사람  p = new 김민지사람();
		p.dance2();				
				
		Person[] 사람들  =  new Person[4];
		사람들[0] = new 김민규사람();
		사람들[1]= new 김민지사람();
		사람들[2] = new  문나정사람();
		사람들[3] = new 허재혁사람();
		System.out.println("<<<<모든 학생이 춤을 춘다 >>");
		for( Person  person : 사람들) {
			 person.dance();
		}
		
		
		 
	}

	
	
}
