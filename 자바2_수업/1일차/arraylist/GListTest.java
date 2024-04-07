package java2.generic.arraylist;

public class GListTest {

	public static void main(String[] args) {
		
		 
		GList<Student> list = new GList<>();
		
		list.add( new  Student("홍길동" , "서울시") );
		list.add( new  Student("김길동" , "부산") );
		
				
		for( int i=0 ; i < list.size() ; i++) {
			//Student student =  list.get(i);
			//student.special();
			 list.get(i).special();				
		}				
		
	}
}
