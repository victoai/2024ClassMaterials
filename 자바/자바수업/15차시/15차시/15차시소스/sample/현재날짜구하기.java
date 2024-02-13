package sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class 현재날짜구하기 {

	public static void main(String[] args) {		 
		
		
		//Calendar 클래스를 사용하여 날짜관련 기능들(라이브러리)을 사용할 수 있다.
		//현재날짜및 지정일날짜를 얻어 올수 있고 몇일 후나 몇달 후의 날짜정보를 얻어 올 수 있다. (자바가 제공하는 기능이다)
		Calendar current = Calendar.getInstance();	
		
		
		//Calender 추상클래스로 만들어진 클래스이다. 객체생성불가 
		//  getInstance매서드를 사용하여 날짜 기능을 제공하는 객체를 얻어옴 
		//  getInstance() 메서드는 로케일 및 타임존에 따라 적절한 달력 객체를 반환하므로, 어플리케이션의 필요에 따라 다양한 달력을 사용할 수 있습니다.
		//  Calendar calendar = Calendar.getInstance(); // GregorianCalendar 반환
		//  Calendar calendar1 = Calendar.getInstance(Locale.forLanguageTag("th-TH")); // BuddhistCalendar 반환 		  
		//	Calendar calendar = Calendar.getInstance(Locale.JAPAN); // JapaneseImperialCalendar 반환
		//  Calendar calendar = Calendar.getInstance(new Locale("ar", "SA")); // IslamicCalendar 반환
		//  Calendar calendar = Calendar.getInstance(new Locale("he", "IL")); // HebrewCalendar 반환 
		
		System.out.println( current.getTime());		
		//원하는 형식으로 보여주기
		SimpleDateFormat  sf = new SimpleDateFormat("yyyy-MM-dd");	
		String currentF =  sf.format(current.getTime());		
		System.out.println( currentF);
	}

}
