package prj230222;

import java.util.ArrayList;

public class SerieEx {

	public static void main(String[] args) {

		ArrayList<Serie> list=new ArrayList<>();
		list.add(new Serie(1,"나폴리",20,2,1));
		list.add(new Serie(2,"인터 밀란",15,2,6));
		list.add(new Serie(3,"AS 로마",13,5,5));
		list.add(new Serie(4,"AC 밀란",13,5,5));
		list.add(new Serie(5,"라치오",12,6,5));
		list.add(new Serie(6,"아탈란타",12,5,6));
		list.add(new Serie(7,"유벤투스",14,5,4));
		list.add(new Serie(8,"볼로냐",9,5,9));
		list.add(new Serie(9,"토리노",8,7,8));
		list.add(new Serie(10,"우디네세",7,9,7));
		list.add(new Serie(11,"몬자",8,5,10));
		list.add(new Serie(12,"엠폴리",6,10,7));
		list.add(new Serie(13,"레체",6,9,8));
		list.add(new Serie(14,"피오렌티나",6,7,10));
		list.add(new Serie(15,"사수올로",6,6,11));
		
		
		System.out.println("순위\t팀명\t경기\t승\t무\t패\t승점");
		for(int i=0; i<15; i++) {
			System.out.println(list.get(i).toString());
		}
		
	}
	
}