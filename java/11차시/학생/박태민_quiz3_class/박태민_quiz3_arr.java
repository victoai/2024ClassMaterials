package day10.quiz;

public class 박태민_quiz3_arr {

	public static void main(String[] args) {
		
		System.out.println("영화제목, 주연배우, 감독, 러닝타임을 입력하세요");
		
		박태민_quiz3_class[] arr = new 박태민_quiz3_class[3];
		arr[0] = new 박태민_quiz3_class();
		arr[0].input("스즈메의 문단속", "하라 나노카", "신카이 마코토", "122");
		
		arr[1] = new 박태민_quiz3_class();
		arr[1].input("노인을 위한 나라는 없다", "하비에르 바르뎀", "코엔 형제", "122");
		
		arr[2] = new 박태민_quiz3_class();
		arr[2].input("식스센스", "브루스 윌리스", "나이트 샤말란", "107");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].printInfo();
		}
		
		}

	}

