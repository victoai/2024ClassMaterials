package prjDay13;

public class StringMgt {

	public static void main(String[] args) {
		
		
		String[]  days= new String[30];		
		//일정등록
		days[0]= "산책하기";
		days[1]= "친구만나기";
		days[2]= "영화보기";		
		
		//일정조회하기		
		System.out.println(  days[0] ) ;
		System.out.println(  days[1] ) ;
		System.out.println(  days[2] ) ;		
		
		//일정변경
		// 2번째 변경 
		// 커피마시기
		days[1]="커피마시기";	
		
		
		//삭제
		days[0]="";
		
		
		
		
		
	}

}
