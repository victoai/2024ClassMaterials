package day09.quiz;

public class studentScore {

	public static void main(String[] args) {

		Score stdnt = new Score();
		
		stdnt.name = "홍길동";
		stdnt.kor = 90;
		stdnt.eng = 80;
		stdnt.avg = (((double)stdnt.kor+stdnt.eng)/2);

		System.out.println("학생이름 : " + stdnt.name);
		System.out.println("국어 : " + stdnt.kor);
		System.out.println("영어 : " + stdnt.eng);
		System.out.println("평균 : " + (int)stdnt.avg);
	}

}
