package day1.wrapper;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		### 박싱과 언박싱

		- 원시값을 래퍼 클래스의 인스턴스로 **boxing**
		- 래퍼 클래스의 인스턴스를 원시값으로 **unboxing**
		
		*/
		
		//  🎁 박싱:  원시값을 래퍼 클래스의 인스턴스로
        //  ⭐ 과거에는 생성자를 사용했으나 deprecated
        int 정수형변수 = 123;
        Integer 정수형객체 = Integer.valueOf(정수형변수);

        
        char 문자형변수 = 'A';
        Character 문자형객체 = Character.valueOf(문자형변수);
        
        

        //  ✏ 언박싱 : 래퍼 클래스의 인스턴스를 원시값으로
        Double 더블형객체 = Double.valueOf(3.14);
        double 더블형변수 = 더블형객체.doubleValue();

        Boolean 블린형객체 = Boolean.valueOf(true);
        boolean 블린형변수 = 블린형객체.booleanValue();
        
        
        
        
        /*
         * - 명시적으로 박싱/언박싱하지 않아도 컴파일러가 자동으로 처리
			- 성능상으로는 떨어지므로 자주 사용하지는 *(반목문 안에서 등)* 말 것
         */
        
		//  💡 오토박싱
        Integer 정수형객체2 = 234;
        Double  더블형객체2= 1.414213;

        //  💡 오토언박싱
        char charvar = Character.valueOf('B');
        boolean boolvar = Boolean.valueOf(false);
        int  intvar  = Integer.valueOf(19);
        int  intvar2=10;
        

        //  원시값과 래핑 클래스 인스턴스끼리의 연산
        int result = 정수형변수 + 정수형객체.intValue();
        int result2 = 정수형변수 + 정수형객체 ;
       
     
        
        System.out.println(result );
        System.out.println( result2);
        

        //  메소드 등 사용처들에 혼용 가능
        Integer 정수형객체3 = add(3, 5);

	}
	
	static int add(Integer a, Integer b) { return a + b; }
	

}
