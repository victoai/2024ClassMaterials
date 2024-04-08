package day1.wrapper;

public class Ex01 {

	public static void main(String[] args) {
		
		//각 원시 자료형에는 그에 해당하는 래퍼 클래스가 있음
		//원시자료형을 객체로 다룰 일이 있음  ( 자바는 객체지향언어 이다) 
		//원시자료형이 있는 이유? 성능상의 이유이다 
		
		//  원시 자료형
        int int1 = 123;
        double dbl1 = 3.14;
        char chr1 = 'A';
        boolean bln1 = true;
        

        //  ⭐ 해당 래퍼 클래스의 인스턴스
        //  기존의 생성자 방식
        //  ⚠️ 오늘날에는 deprecated  
        Integer int2 = new Integer(123);
        Double dbl2 = new Double(3.14);
        Character chr2 = new Character('A');
        Boolean bln2 = new Boolean(true);

        //  💡 아래의 클래스 메소드들이 권장됨
        Integer int3 = Integer.valueOf(123);
        Double dbl3 = Double.valueOf(3.14);
        Character chr3 = Character.valueOf('A');
        Boolean bln3 = Boolean.valueOf(true);
        
        
        
        
        
        
        

	}

}
