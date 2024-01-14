package day10.quiz;

public class 박태민_quiz3 {

	public static void main(String[] args) {

		박태민_quiz3_class movie1 = new 박태민_quiz3_class();
		박태민_quiz3_class movie2 = new 박태민_quiz3_class();
		박태민_quiz3_class movie3 = new 박태민_quiz3_class();
		
		System.out.println("영화제목, 주연배우, 감독, 러닝타임을 입력하세요");
		System.out.println();
		movie1.input("스즈메의 문단속", "하라 나노카", "신카이 마코토", "122");
		movie1.printInfo();
		movie2.input("노인을 위한 나라는 없다", "하비에르 바르뎀", "코엔 형제", "122");
		movie2.printInfo();
		movie3.input("식스센스", "브루스 윌리스", "나이트 샤말란", "107");
		movie3.printInfo();
	}

}
