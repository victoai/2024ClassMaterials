package week03.day2.재연님;

public class music {
	private String name;
	private String album;
	private String singer;
	private String releasedate;
	private String composer;
	private String lyricist;
	private String lyrics;
	private String[] songs = {"음악1", "음악2", "음악3", "음악4", "음악5", "음악6"};
	//기능
	
	//입력
	public void input(String name, String album , String singer, String releasedate , String composer , String lyricist ) {
		this.name =name;
		this.album = album;
		this.singer = singer;
		this.releasedate =releasedate;
		this.composer = composer;
		this.lyricist = lyricist;
		
	}
	public void inputlyric(String lyrics) {
		this.lyrics=lyrics;
	}
	
	public void inputsongs(String[] arrs) {
		for (int i=0; i<songs.length-1; i++) {
			this.songs[i]= arrs[i];
		}
	}
	//출력
	
	public void printInfo() {
		System.out.println("================");
		System.out.println(name);
		System.out.println(album);
		System.out.println(singer);
		System.out.println(releasedate);
		System.out.println(composer);
		System.out.println(lyricist);
		for (int i=0; i<songs.length-1; i++) {
			System.out.println(songs[i]);
		}
		System.out.println("================");
	}
	
	public void printlyrics() {
		System.out.println(lyrics);
	}
}
