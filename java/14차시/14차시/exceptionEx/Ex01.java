package prjDay12;

public class Ex01 {

	public static void main(String[] args) {
	 

		String str="hello";		
		Object obj = str;                    // 가능  O    X   (업캐스팅)
		
					   
		String str2 = (String)obj ;       // 가능  O   X  (다운캐스팅)
		char result  = str2.charAt(0);
		System.out.println( result);
		

	}

}
