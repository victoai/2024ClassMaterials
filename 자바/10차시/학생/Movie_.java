package day10.classType;

public class Movie_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie m1 = new movie();
		m1.input("바비", 114, "2023.07.19");
		m1.printData();

	}

}

class movie{
	private String title;
	private int time;
	private String date;
	
	public void input(String title, int time, String date) {
		this.title = title;
		this.time = time;
		this.date = date;
	}
	public void printData() {
		System.out.println(title+" | "+time+"분 | "+date);
		
	}
}
