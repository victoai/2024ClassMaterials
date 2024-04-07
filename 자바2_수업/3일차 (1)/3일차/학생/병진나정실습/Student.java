package java2.day3.lamda;

public class Student {
	String name;
	int score;
	String grade;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
		this.grade = "F";
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", grade=" + grade + "]";
	}
	
	
}
