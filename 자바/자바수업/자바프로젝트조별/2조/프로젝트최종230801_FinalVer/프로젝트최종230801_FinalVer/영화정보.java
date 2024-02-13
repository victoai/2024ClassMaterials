package 프로젝트최종230801_FinalVer;

public class 영화정보 {
	
	
	String name;
	String director;
	String running;
	int count;
	
	
	
	public 영화정보() {};
	
	
	public 영화정보(String name, String director, String running) {
		super();
		this.name = name;
		this.director= director;
		this.running = running;
		
	}
	
	
	public void updateCnt() {
		count++;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getRunning() {
		return running;
	}
	public void setRunning(String running) {
		this.running = running;
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "영화 이름 [이름=" + name + ", 감독=" + director + ", 러닝 타임=" + running + "]";
	}
	
	

}
