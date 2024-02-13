package 프로젝트최종230801_FinalVer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 영화핸들러 {
	
	
	ArrayList<영화정보> list1 = new ArrayList<>();
	
	void run() {
		
		register();
		info();
		select();
		popular();
		
	}
	
	
	
	void register() {
		System.out.println("---- 영화 정보 추가하기 ---");
		
		
		
		영화정보 m = new 영화정보("엘리멘탈", "피터 손", "109분");
		영화정보 m1 = new 영화정보("콘크리트 유토피아", "엄태화", "130분");
		영화정보 m2 = new 영화정보("오펜하이머", "크리스토퍼 놀란", "180분");
		영화정보 m3 = new 영화정보("더 문", "김용화", "129분");
		영화정보 m4 = new 영화정보("명탐정코난-흑철의 어영", "타치카와 유즈루", "110분");
		영화정보 m5 = new 영화정보("달짝지근해-7510", "이한", "119분");
		
		
		list1.add(m);
		list1.add(m1);
		list1.add(m2);
		list1.add(m3);
		list1.add(m4);
		list1.add(m5);
		
	}
	
	
	
	void select() {
		
		System.out.println("---- 원하는 영화 선택하기 ----");
		Scanner sc = new Scanner(System.in);
		
		
		
		loop: while(true) {
			
			
			int n = sc.nextInt();
			
			
			switch(n) {
			
			
			case 1:
				System.out.println("엘리멘탈 영화를 선택하셨습니다");
				list1.get(0).updateCnt();
				break;
				
				
			case 2:
				System.out.println("콘크리트 유토피아 영화를 선택하셨습니다");
				list1.get(1).updateCnt();
				break;
				
				
			case 3:
				System.out.println("오펜하이머 영화를 선택하셨습니다");
				list1.get(2).updateCnt();
				break;
				
			
			case 4:
				System.out.println("더 문 영화를 선택하셨습니다");
				list1.get(3).updateCnt();
				break;
				
			
			case 5:
				System.out.println("명탐정 코난-흑철의 어영 영화를 선택하셨습니다");
				list1.get(4).updateCnt();
				break;
				
				
			case 6:
				System.out.println("달짝지근해-7510 영화를 선택하셨습니다");
				list1.get(5).updateCnt();
				break;
				
				
			case 7:
				System.out.println("투표 종료");				
				break loop;
			}
		}

		
		
		
	}
	
	
	
	void info() {
		
		System.out.println("---- 영화 정보 출력, 7번 누르면 종료 ----");
		
		for(int i=0; i< list1.size(); i++ ) {
			System.out.println( (i+1) +  " " + list1.get(i));
		}
		
		
	}
	
	
	
	
	void popular() {
		System.out.println("---- 인기순 정렬 ----");
		
		
		Collections.sort(list1, new Comparator<영화정보>() {

			@Override
			public int compare(영화정보 o1, 영화정보 o2) {
				// TODO Auto-generated method stub
				return o2.count - o1.count;	//내림차순 정렬, 오름차순 정렬하려면 o1과 o2 순서 바꾸기
			}});
		
	 
		
		info();
		
	}
	 

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		영화핸들러 m = new 영화핸들러();
//		m.run();
//
//	}

}
