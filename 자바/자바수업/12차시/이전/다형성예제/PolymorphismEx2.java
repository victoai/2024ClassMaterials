package day12.다형성예제;

public class PolymorphismEx2 {

	public static void main(String[] args) {
	   Person2[]  persons = new  Person2[16];
	   persons[0]=  new Dance_NJ2();
	//   persons[1]=  new Dance2(); 			   
	   persons[2]=  new DunDun2();
	  // persons[3]=  new JHDance2();
	   persons[4]=  new Juntae2();
	   persons[5]=  new Kimhs2();
	   //persons[6]=   new KJY2();
	   //persons[7]=  new PersonDance2(); 
	   //persons[8]=  new PersonMin2();
	   persons[9]=  new Yejin2();
	   //persons[10]= new LY_dance2();
	   //persons[11]= new Singer2();
	   //persons[12]=  new 병진2();
	  // persons[13]=  new Samba2();
	   //persons[14]=  new Dance_JH2();
	 //  persons[15]=   new Samba2();

	  	    
	   System.out.println( "우리 학생들이 춤을 추기 시작합니다 ") ;	   
	   for( int i=0; i< persons.length ; i ++ ) {
		   persons[i].dance();  // 하나의 메시지 다르게 동작하는거 다형성이라고 부른다
	   }
		

	   // 1. 오버로딩 ( 이름이 같고 매개변수가 다른것 !!!)
	   // 2. 상속관계에서 오버라이딩 (부모의 매서드 재정의)를 통한 다형성 
	   
	}

}
