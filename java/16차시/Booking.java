package 프로젝트;

import java.io.Serializable;

// 객체로 불러오려면 implements Serializable을 꼭 상속 받아야함
public class Booking implements Serializable {

	private String area; // 지역
	private String date; // 날짜
	private String building; // 호텔이름
	private String room; // 방이름
	private int price; // 가격
	private boolean empty; // 공실여부
	
	
	public Booking() {}

	public Booking(String area, String date, String building, String room, int price, boolean empty) {
		this.area = area;
		this.date = date;
		this.building = building;
		this.room = room;
		this.price = price;
		this.empty = empty;
	}

	public String getArea() {return area;}
	public String getDate() {return date;}
	public String getBuilding() {return building;}
	public String getRoom() {return room;}
	public int getPrice() {return price;}
	public boolean getEmpty() {return empty;}
	
	public void setArea(String area) {this.area = area;}
	public void setDate(String date) {this.date = date;}
	public void setBuilding(String building) {this.building = building;}
	public void setRoom(String room) {this.room = room;}
	public void setPrice(int price) {this.price = price;}
	public void setEmpty(boolean empty) {this.empty = empty;}

	@Override
	public String toString() {
		return "Booking [area=" + area + ", date=" + date + ", building=" + building + ", room=" + room + ", price="
				+ price + ", empty=" + empty + "]";
	}
	
	
	
	
}
