package prjDay12;

public class Game {
	private String name;
	private String type;
	private int price;

public Game() {
	//기본
}
public Game(String name, String type,int price) {
	this.name = name;
	this.type = type;
	this.price = price;
}
@Override
public String toString() {
	return name + "이라는 게임의 장르는 " + type + "이며 월정액권 혹 게임의 가격은 " + price +"입니다.";
}
public void setName(String name) {
	this.name = name;
}
public void setType(String type) {
	this.type = type;
}
public void setPrice(int price) {
	this.price = price;
}

}
