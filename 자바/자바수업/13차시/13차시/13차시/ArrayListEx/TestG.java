package week04.day2.ArrayListEx;

public class TestG<T extends TestG> {

	String  name;
	
	public TestG(String name) {
		this.name = name;
	}
	
	public boolean equals2( T  obj) {
		 if(this.name  ==  obj.name  ) {
			 return true;
		 }else 			 
			return false;		
	}
		
	public static void main(String[] args) {
		TestG<TestG> g= new TestG<>("java");
		TestG<TestG> g2= new TestG<>("java");
		boolean result  = g.equals2(g2);
		System.out.println(  result);
	}
}
