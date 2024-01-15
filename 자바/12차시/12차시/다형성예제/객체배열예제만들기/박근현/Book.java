package test;

public class Book {
	
	String title;
	
	public Book() {
		
	}
	public Book(String title) {
		this.title = title;
	}

	public String returnBook() {
		//return super.toString();
		return "추가로 일주일 안에 반납하셔야될 책은 " + title + "입니다. 도서관을 이용해주셔서 감사합니다.";
	}
	
	@Override
	public String toString() {
		return title;
	}
	
	
	
	
}