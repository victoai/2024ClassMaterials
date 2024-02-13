package 프로젝트최종230801_FinalVer;

import java.io.Serializable;

public class BookingInfo implements Serializable {

	static String[] area = {"인천","부산","제주"};
	static String[] date = new String[365];
	static String[] IncheonHotel = {"구월반원아시아드호텔", "네스트호텔", "인천공항디케이인천에어포트호텔", "구월호텔"};
	static String[] BusanHotel = {"해운대센트럴호텔", "엘모멘토광안", "신라스테이서부산", "해운대동백호텔"};
	static String[] JejuHotel = {"제주신라호텔", "글로스터호텔제주", "히든클리프호텔", "노블피아호텔"};
	//String[] room;
	
	
	static {
		int cnt = 0;
		for(int i=1; i<=12; i++) {
			int k;
			if(i==1 || i==3||i==5||i==7||i==8||i==10||i==12){k=31;}
			else if(i==2) {k=28;}
			else {k=30;}
			for(int j=1; j<=k; j++) {
				date[cnt] = "2023/"+i+"/"+j;
				cnt++;
			}
		}
	}
	
	

	
	
	
	
	
	
	
}
