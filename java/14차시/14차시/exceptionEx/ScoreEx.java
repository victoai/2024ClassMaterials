package prjDay12;

public class ScoreEx {

	public static void main(String[] args) {	 
		
		//Score type
		
	//	Score s = new Score();
		Score s = new Score("홍길동" , 100,50,90);
		
		String result  = s.getInfo();
		System.out.println(result);
		
		System.out.println( s);   //toString()매서드를 호출함 , 생략된 형태로 제공됨 
		System.out.println( s.toString());
		
		//		
		
	}

}
