package 프로젝트최종230801_FinalVer;

import java.util.ArrayList;

import 프로젝트최종230801_FinalVer.*;

public class BookingList {

	static ArrayList<Booking> IncheonList = new ArrayList<>();
	static ArrayList<Booking> BusanList = new ArrayList<>();
	static ArrayList<Booking> JejuList = new ArrayList<>();
	
	static ArrayList<Booking> TotalList = new ArrayList<>(); 

	static {

		// 인천
		for (int j = 0; j < BookingInfo.IncheonHotel.length; j++) {
			for (int k = 0; k < BookingInfo.date.length; k++) {
				Booking b = new Booking(BookingInfo.area[0], BookingInfo.IncheonHotel[j], BookingInfo.date[k], false);
				IncheonList.add(b);
			}
		}

		// 부산
		for (int j = 0; j < BookingInfo.BusanHotel.length; j++) {
			for (int k = 0; k < BookingInfo.date.length; k++) {
				Booking b = new Booking(BookingInfo.area[1], BookingInfo.BusanHotel[j], BookingInfo.date[k], false);
				BusanList.add(b);
			}
		}

		// 제주
		for (int j = 0; j < BookingInfo.JejuHotel.length; j++) {
			for (int k = 0; k < BookingInfo.date.length; k++) {
				Booking b = new Booking(BookingInfo.area[2], BookingInfo.JejuHotel[j], BookingInfo.date[k], false);
				JejuList.add(b);
			}
		}
		
		// 전체 리스트
		int size = IncheonList.size() + BusanList.size() + JejuList.size();
		
		
		for(int i=0; i<IncheonList.size(); i++) {
			TotalList.add(IncheonList.get(i));
		}
		for(int i=0; i<BusanList.size(); i++) {
			TotalList.add(BusanList.get(i));
		}
		for(int i=0; i<JejuList.size(); i++) {
			TotalList.add(JejuList.get(i));
		}

	}

}
