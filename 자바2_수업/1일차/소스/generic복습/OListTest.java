package day1.generic.generic복습;

public class OListTest {

	public static void main(String[] args) {
		 
		OList list = new OList();
		list.add(new Score("허재혁",100,90));
		list.add(new Score("표준태",90,90));
		list.add(new Score("조은경",80,90));
		
		for( int i=0 ; i<list.size(); i++ ) {			
			System.out.println(  list.get(i));			
			// Object toString   ->  Score toString()
			// 오버라이딩된 매서드는 부모형으로 참조해도 
			// 실제 객체의 매서드가 동작한다 =>다형성
			Object obj = list.get(i);			
			System.out.println(((Score)obj).getKor());			
		}
		
	}

}
