package prjDay13;

// 일정관리프로그램
// 일정을 저장할 자료형필요  

public class Day {	
 String date;   //일정날짜
 String title;   //일정내여 
 

public Day() {
	// TODO Auto-generated constructor stub
}


public Day(String date, String title) {
	super();
	this.date = date;
	this.title = title;
}



public String getDate() {
	return date;
}


public void setDate(String date) {	 
	this.date = date;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


@Override
public String toString() {
	return    date + "     " + title  ;
}
 
 
}
