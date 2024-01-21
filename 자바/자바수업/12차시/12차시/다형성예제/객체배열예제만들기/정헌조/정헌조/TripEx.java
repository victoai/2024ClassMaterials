package prjDay12;

import java.util.ArrayList;

public class TripEx {

	public static void main(String[] args) {
		/*
		Trip[] list = new Trip[3];
		list[0]=new Trip("부산", "2시간30분","KTX", 59800  );
		list[1]=new Trip("강릉", "2시간", "KTX", 27600 );
		list[2]=new Trip("여수", "4시간30분", "자차", 68000);
		
		System.out.println(list[0]);
		System.out.println(list[1]);
		System.out.println(list[2]);
		*/
		
		ArrayList<Trip> list = new ArrayList<>();
		list.add(new Trip("부산", "2시간30분","KTX", 59800));
		list.add(new Trip("강릉", "2시간", "KTX", 27600));
		list.add(new Trip("여수", "4시간30분", "자차", 68000));
		
		System.out.println(((Trip)list.get(0)).getInfo());
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}

}
