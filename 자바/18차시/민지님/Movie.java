package 사이드메뉴만들기;

public class Movie {

	String name;
	String genre;
	int ranking;
	String director;
	String running_time;
	int popular;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String name, String genre, int ranking, String director, String running_time) {
		super();
		this.name = name;
		this.genre = genre;
		this.ranking = ranking;
		this.director = director;
		this.running_time = running_time;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", genre=" + genre + ", ranking=" + ranking + ", director=" + director
				+ ", running_time=" + running_time + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getRunning_time() {
		return running_time;
	}

	public void setRunning_time(String running_time) {
		this.running_time = running_time;
	}
	
	
	public void  increatePopular() {
		 popular +=1;
	}
	
	
}
