package com.acorn_SYJ;

public class movieTest {

	public static void main(String[] args) {

		movieClass M = new movieClass();
		movieClass M2 = new movieClass();
		movieClass M3 = new movieClass();
		
		M.input("분노의 질주: 라이드 오어 다이", "action", "2시간 21분", "15세이상");
		M.printInfo();
		
		M2.input("쥬라기 월드: 도미니언", "action/SF", "2시간 27분", "12세 이상");
		M2.printInfo();
		
		M3.input("서치 2", "thriller", "1시간 51분", "12세 이상");
		M3.printInfo();
		
	}

}
