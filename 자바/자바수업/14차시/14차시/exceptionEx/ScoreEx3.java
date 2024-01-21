package prjDay12;

import java.util.ArrayList;

public class ScoreEx3 {

	public static void main(String[] args) {
		 
		
		//성적관리 프로그램 
		
		/*Score[]  list = new Score[3];  // 참조형변수 5개
		list[0]= new Score( "홍학생", 100,90,70);
		list[1]= new Score( "김학생", 90,90,70);
		list[2]= new Score( "박학생", 80,90,70);
		*/
		ArrayList list = new ArrayList();
		list.add( new  Score( "홍학생", 100,90,70));
		list.add( new  Score( "김학생", 100,90,70));		
		list.add( new  Score( "이학생", 100,90,70));		
		
		Object  obj = new Score("김학생", 100,90,90);  //상속관계	 ok	 (업캐스팅) , 의미축소됨 
		                                            //자식의 오버라이딩(재정의 )한 매서드가 있다면 
		                                            //부모로 다뤄도 자식의 매서드 호출됨
		String rtn0 = obj.toString();               //학생정보가 반환됨 
		String rtn= ((Score)obj).getInfo();         // instance 는  score형으로  new 되었기 때문에
		                                            // 다시  Score형으로 형변환 가능함 (이것을 다운캐스팅)
		//실제 사과를 과일로 부르는것(다루는것)
		//과일로 부른 사과를 다시 사과로 부르는것(다루는것)
		//위의 두 경우가 상속관계에서 업캐스팅과 다운캐스팅임   
		
		/*
		System.out.println(   list[0]);  // list[0].toString()
		System.out.println(   list[1]);  // list[1].toString()
		System.out.println(   list[2]);  // list[2].toString()
		*/
		System.out.println(  ((Score) list.get(0)).getInfo());  // list[0].toString()
		System.out.println(   list.get(1));  // list[0].toString()
		System.out.println(   list.get(2));  // list[0].toString()	
		
		
		 
	}

}
