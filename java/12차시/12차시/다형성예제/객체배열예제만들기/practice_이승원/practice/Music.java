package practice;

public class Music {

	private String title;
	private String genre;
	private int releasedate;
	private String singer;
	
public Music(String title, String genre, int releasedate, String singer) {
	this.title= title;
	this.genre=genre;
	this.releasedate=releasedate;
	this.singer=singer;
}

public void setinfo(String title, String genre, int releasedate, String singer) {
	this.title= title;
	this.genre=genre;
	this.releasedate=releasedate;
	this.singer=singer;
}

public String toString() {
	return "곡 정보" + " " + title +  " " +singer + " "  + genre +" " + "발매일"+ " " +releasedate ;
}

}
