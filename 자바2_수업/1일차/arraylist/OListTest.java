package java2.generic.arraylist;

public class OListTest {

public static void main(String[] args) {
		
		OList list = new OList();   //  어떤자료형이든 다 담을 수 있다.			                            //  
		 
		list.add(5);
		list.add("hello"); 		 
		list.add(new Student("김길동", "노원1"));		 
	
		for(int i=0; i< list.size(); i++) {
			System.out.println( list.get(i));			
		}
		
	}

}
