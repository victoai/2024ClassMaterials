package 프로젝트최종230801_FinalVer;

import java.io.Serializable;

public class Booking implements Serializable{

	private String area;
	private String hotel;
	private String date;
	private boolean empty;
	private String emp;
	private String id;

	public Booking() {
	}

	public Booking(String area, String hotel, String date, boolean empty) {
		super();
		this.area = area;
		this.hotel = hotel;
		this.date = date;
		this.empty = empty;
	}
	
	public Booking(String id, String area, String hotel, String date, boolean empty) {
		super();
		this.id = id;
		this.area = area;
		this.hotel = hotel;
		this.date = date;
		this.empty = empty;
	}

	public String getId() {
		return id;
	}
	public String getArea() {
		return area;
	}

	public String getHotel() {
		return hotel;
	}

	public String getDate() {
		return date;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	@Override
	public String toString() {
		if(empty==false) {
			emp = "예약가능";
		}else {
			emp = "예약";
		}
		return "ID: " +  id + " 지역: " + area + " 호텔: " + hotel + " 날짜: " + date + " 예약여부: " + emp;
	}
	
	

}
