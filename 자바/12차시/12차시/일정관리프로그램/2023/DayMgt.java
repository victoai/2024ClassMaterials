package prjDay13;

public class DayMgt {

	
	public static void main(String[] args) {
		//일정관리프로그램작성
		
		Day[]  days = new Day[10];
		int  index=0;
		
		//일정등록하기
		    days[index] = new Day("2023-02-23" , "자바학습");
		    index++;
		    
		    days[index] = new Day("2023-02-23" , "학습모듈공부");
		    index++;		 
		 
		
		//일정조회하기
		    for(  int i =0 ; i< index;i++) {
		    	if(!days[i].title.equals(""))
		    	System.out.println( days[i].toString() );
		    } 		
		
		//일정변경하기
		
		    //1
		    //자바
		     days[0].setTitle("자바");
		     
		
		//일정삭제하기
		 
		    days[0].setTitle("");   // 일정내용이 비워지게 함     
		

		//일정조회하기
		    for(  int i =0 ; i< index;i++) {
		    	if(!days[i].title.equals(""))
		    		System.out.println( days[i].toString() );
		    } 
		
	

	}

}
