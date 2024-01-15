package 사이드메뉴만들기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 객체다루기2 {

	static Scanner sc=new Scanner(System.in);
	static ArrayList<Movie> list  = new ArrayList<Movie>();
	
	public static void main(String[] args) {
	

		initMovie();
		
		
		System.out.println(" 요즘 인기 영화를 소개합니다\n");
		selectMovie();
		
		
		System.out.println("\n \n 재미있어 보이는 영화 5개를 선택주세요");
		
		for(int i=0; i<5; i++) {

			int choice=sc.nextInt();
			
			Movie movie = list.get(choice-1);		
			movie.increatePopular();
			
		}
		
		
		//인기순으로 조회하기
		System.out.println(" 인기순 정렬");
		인기순으로조회하기();
		
		
		
	}

	
	private static void 인기순으로조회하기() {
		 //정렬하기
		
		Collections.sort(list, new Comparator<Movie> () {

			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				return o2.popular - o1.popular;
			}});
		
		selectMovie();
		
	}


	public static void selectMovie() {
		for(int i=0; i<list.size(); i++) {
			Movie a = list.get(i);
			System.out.println(a);
		}
	}

	
	
	public static void initMovie() {
		list.add(new Movie("콘크리트 유토피아","드라마",1,"엄태화","130분"));
		list.add(new Movie("밀수","범죄",2,"류승완","129분"));
		list.add(new Movie("엘리멘탈","애니메이션",3,"피터 손","109분"));
		list.add(new Movie("비공식작전","드라마",4,"김성훈","132분"));
		list.add(new Movie("더문","SF",5,"김용화","129분"));
		list.add(new Movie(" 미션 임파서블: 데드 레코닝 PART ONE","액션",6,"크리스토퍼 맥쿼리","163분"));
		list.add(new Movie("바비","드라마",7,"그레타 거윅","114분"));
		list.add(new Movie("명탐정코난: 흑철의 어영","애니메이션",8,"타치카와 유즈루","110분"));
		list.add(new Movie("몬스터 패밀리2","애니메이션",9,"호거 태프","103분"));
		list.add(new Movie("보호자","액션",10,"정우성","97분"));
	}

	/*public static void increment_count() {
		int index = sc.nextInt();
		int count0=0;	// 배열의 0번째가 선택된 횟수
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
		
		// 클래스정의 count = list.get(index-1);
		if(index==1) {
			count0++;
		}else if(index==2) {
			count1++;
		}else if(index==3) {
			count2++; 
		}else if(index==4) {
			count3++;
		}else if(index==5) {
			count4++;
		}else if(index==6) {
			count5++;
		}else if(index==7) {
			count6++;
		}else if(index==8) {
			count7++;
		}else if(index==9) {
			count8++;
		}else if(index==10) {
			count9++;
		}else {
			 System.out.println("잘못된 값을 입력하였습니다");
		}
		
		
	}*/
	
}
