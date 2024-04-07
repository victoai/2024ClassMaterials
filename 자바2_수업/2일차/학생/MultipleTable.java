package java2prj1.day0926.lamda.Runnable;

public class MultipleTable {
	
	public static void main(String[] args) {
		
		Runnable MultipleTable = () -> {
			for(int i=1; i<10; i++) {
				for(int j=1; j<10; j++) {
					System.out.println(i + "*" + j +"= " + i*j);
				}
			}
		};
		MultipleTable.run();
		
		
		
	}
}
