package java2.day4.reflect;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		

		Score s = new Score("홍길동",100,90); 
		System.out.println( s);
		
		Class clazz  = Class.forName("java2.day4.reflect.Score");
		
		Score   s2 = (Score) clazz.newInstance();  // 기본생성자를 사용함  , 기본생성자 없으면 에러발생
		s2.setEng(90);
		s2.setKor(100);
		s2.setName("홍길동");
		System.out.println(s2);
		
		
	}

}
