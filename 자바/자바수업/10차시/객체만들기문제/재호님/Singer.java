package week03.day2.재호님;

public class Singer {  //캡슐화 , 정보은닉 , 정해진 인터페이스만으로 사용하게 하겠다. 
	
	 String name;
	 String album;
	 int release;
	 String track;
	 String GPA;
	
	// 입력
	public void input(String name, String album, int release, String track, String GPA) {
		this.name = name;
		this.album = album;
		this.release = release;
		this.track = track;
		this.GPA = GPA;
	}
	
	// 출력
	public void printInfo() {
		System.out.println(name);
		System.out.println(album);
		System.out.println(release);
		System.out.println(track);
		System.out.println(GPA);
	}
	
}
