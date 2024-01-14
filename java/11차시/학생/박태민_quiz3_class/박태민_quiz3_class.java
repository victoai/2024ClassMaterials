package day10.quiz;

public class 박태민_quiz3_class {

	// 영화정보
	String name;
	String mainActor;
	String director;
	String runningtime;
	
	// 입력기능
	public void input(String name, String mainActor,
			 String director,String runningtime) {
		this.name = name;
		this.mainActor = mainActor;
		this.director = director;
		this.runningtime = runningtime;
	}

	String[] movie = {name, mainActor, director, runningtime};
	// 출력기능
	public void printInfo() {
		System.out.printf("영화 제목 : %s%n", name);
		System.out.printf("주연배우 : %s%n", mainActor);
		System.out.printf("감독 : %s%n", director);
		System.out.printf("러닝타임 : %s분%n ", runningtime);
		System.out.println();
	}
	public void arr() {
		for(int i = 0; i < movie.length; i++) {
			System.out.print(movie[i]+" ");
		}
	}
}
