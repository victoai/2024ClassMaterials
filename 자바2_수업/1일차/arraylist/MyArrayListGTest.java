package java2.generic.arraylist;

 


 

public class MyArrayListGTest {

	public static void main(String[] args) {
		
		MyArrayListG<Student>  arrys = new MyArrayListG<> ();
		Student a= new Student("김길동","하남시" );
		Student b= new Student("강길동","부산시" );
		Student c= new Student("나길동","제주도" );
		arrys.add(a);
		arrys.add(b);
		arrys.add(c); 
		
		
		class MyConsumerImp  implements MyConsumerG<Student>{		
			@Override
			public void accept(Student t) {
				  System.out.println( t);
			}			
		}

		arrys.forEach( new MyConsumerImp());
		
		
		arrys.forEach(new MyConsumerG<> ( ) {
			@Override
			public void accept(Student t) {
				
				System.out.println( t);
			}}); 
		
		 
		arrys.forEach( item -> System.out.println(item));
		arrys.forEach2(item -> System.out.println( item));

	}

}
