package prjDay12;

public class Game {
	private String title;
	private int price;
	private int year;

	public Game(String title, int price, int year) {
		this.title = title;
		this.price = price;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "게임명: " + title + "\n" + "가격: " + price + "원 \n" + "출시년도: " + year + "\n" + "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ";
	}
}
