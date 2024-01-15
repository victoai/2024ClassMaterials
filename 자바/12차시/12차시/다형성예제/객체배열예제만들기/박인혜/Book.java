package prjDay12;

public class Book {
	
	//
	private String title;  // 제목
	private String writer; // 글쓴이
	private String date;   // 발행일
	private int page;      // 페이지수 
	
	//
	public Book ( String title, String writer, String date, int page) {
		
		this.title=title;
		this.writer=writer;
		this.date=date;
		this.page=page;
	}
	
	//
	public void setTitle( String title) {
		this.title=title;
	}
	public void setWriter( String writer) {
		this.writer=writer;
	}
	public void serDate( String date) {
		this.date=date;
	}
	public void setPage( int page) {
		this.page=page;
	}
	
	//
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " 제목 : " + title + " 저자 : " + writer + " 발행일 : " + date + " 페이지 수 : " + page + "쪽" ; 
	}
	
	

}
