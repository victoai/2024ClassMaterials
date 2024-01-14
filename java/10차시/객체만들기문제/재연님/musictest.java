package week03.day2.재연님;

public class musictest {
	public static void main (String[] args) { 
	music music =new music();
		
	music.input("음악", "앨범","가","2018-07-23", "홍길동", "김철수");	
	music.inputlyric("가나다라\n마바사아\n자차카타");
	music.printInfo();
	music.printlyrics();
	music.input("라일락", "LILAC","아이유","2018-07-23", "임수호, Dr.JO, 웅킴, N!ko", "아이유");
	String[] songs = {"Flu", "Coin", "Celebrity","돌림노래","어푸 (Ah puh)" };
	music.inputsongs(songs);
	music.inputlyric("오 라일락 꽃이 지는 날 goodbye\n이런 결말이 어울려\n안녕 꽃잎 같은 안녕");
	music.printInfo();
	music.printlyrics();
	}
}
