package practice;

import java.util.ArrayList;

public class Musicinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Music music = new Music("vibra","랩/힙합",2008,"재지팩트");
		
		System.out.println(music);
		
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("vibra","랩/힙합",2008,"재지팩트"));
		list.add(new Music("antifreeze","락/인디",2005,"검정치마"));
		list.add(new Music("out of time","팝",2022,"the weekend"));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
