package day12.다형성예제;

public class PolymorphismEx {

	public static void main(String[] args) {

	   Person[]  persons = new  Person[16];
	   persons[0]=  new Dance_NJ();
	   persons[1]=  new Dance(); 			   
	   persons[2]=  new DunDun();
	   persons[3]=  new JHDance();
	   persons[4]=  new juntae();
	   persons[5]=  new Kimhs();
	   persons[6]=   new KJY();
	   persons[7]=  new PersonDance(); 
	   persons[8]=  new PersonMin();
	   persons[9]=  new Yejin();
	   persons[10]= new LY_dance();
	   persons[11]= new Singer();
	   persons[12]=  new 병진();
	   persons[13]=  new Samba();
	   persons[14]=  new Dance_JH();
	   persons[15]=   new Samba();

	  	    
	   System.out.println( "우리 학생들이 춤을 추기 시작합니다 ") ;	   
	   for( int i=0; i< persons.length ; i ++ ) {
		   persons[i].dance();  // 하나의 메시지 다르게 동작하는거 다형성이라고 부른다
	   }
		

	   // 1. 오버로딩 ( 이름이 같고 매개변수가 다른것 !!!)
	   // 2. 상속관계에서 오버라이딩 (부모의 매서드 재정의)를 통한 다형성 
	   
	}

}
