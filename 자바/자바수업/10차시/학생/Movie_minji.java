package day10.classType;

public class Movie_minji {

	private String name;
	private String genre;
	private int runningTime;
	private String director;
	
	
	// 입력
	public void inputMovie(String name, String genre, int runningTime, String director ) {
		this.name=name;
		this.genre=genre;
		this.runningTime=runningTime;
		this.director=director;
	}
	
	// 출력
	public void printMovie() {
		System.out.println(name);
		System.out.println(genre);
		System.out.println(runningTime);
		System.out.println(director);
	}
}
