package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Musicinfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력/출력
        ArrayList<Music> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
         String title;
    	 String genre;
    	 int releasedate;
    	 String singer;
    	 
    	 System.out.println("2곡입력");
        for(int i=0; i<2; i++) {
        	System.out.println("제목");title=sc.next();
        	System.out.println("가수");singer=sc.next();
        	System.out.println("장르");genre=sc.next();
        	System.out.println("발매년도");releasedate=sc.nextInt();
        	
        	
        	list.add(new Music(title, genre, releasedate, singer));
        }
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
        
	}

}
