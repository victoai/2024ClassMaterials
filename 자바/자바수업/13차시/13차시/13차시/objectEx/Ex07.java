package week04.day2.objectEx;

public class Ex07 {

	public static void main(String[] args) {
	 
		String str="AWESOME-amazing";
		// String str= new String("AWESOME-amazing");
		System.out.println( "문자열의 길이 =" + str.length());
		System.out.println("대문자로 변환="+ str.toUpperCase());
		System.out.println("2번째 문자 출력" + str.charAt(2));
		System.out.println("2번째 문자부터 부분만 가져오기"+ str.substring(2));
		System.out.println("1번째 문자 이후부터 4번째 문자열전 까지 가져오기"+ 
		str.substring(1,4));
		String[] result = str.split("-");
		for(String n : result) //for each 구문
		System.out.println(n);
		//for(int i=0; i< result.length; i++) 위와 같은 결과
		// System.out.println( result[i]);	
		

	}

}
