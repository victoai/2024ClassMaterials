package java_day7;

import java.util.Scanner;

public class 날씨문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
        String[][] weekWeather = randomWeather(); //

        // 일주일간의 날씨 정보 출력
        weatherAi(weekWeather);
    }

	public static void weatherAi(String[][] weekWeather) {
		for (int i = 0; i < 7; i++) {
            String date = weekWeather[i][0];
            String weather = weekWeather[i][1];
            System.out.println("날짜: " + date + " 날씨: " + weather);
        }
	}

    // 임의로 날씨 정보를 생성하는 메서드
    private static String[][] randomWeather() {
        
    	
    	
    	String[] date2 = { "월", "화", "수", "목", "금", "토", "일" };
        
        
        String[] weather2 = { "맑음", "낙뢰", "비", "운석", "흐림", "태풍", "멸망" };

        String[][] weekWeather = new String[7][2];

        for (int i = 0; i < 7; i++) {
            int randomWeatherindex = (int) (Math.random() * weather2.length);// weather2 의 배열숫자만큼 랜덤수 0~6
            weekWeather[i][0] = date2[i];
            weekWeather[i][1] = weather2[randomWeatherindex];
        }

        return weekWeather;
    }
}
