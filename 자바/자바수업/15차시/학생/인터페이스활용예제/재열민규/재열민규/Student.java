package day15.듀오;

public class Student implements Comparable<Student> {

	String name;
	int id;
	double Score;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, int id, double score) {

		this.name = name;
		this.id = id;
		Score = score;
	}


	@Override
	public String toString() {
		return "노인대학 학번 [이름=" + name + ", 학번=" + id + ", 학점=" + Score + "]";
	}


	@Override
	public int compareTo(Student anotherStudent) {

		return Integer.compare(id, anotherStudent.id);
	}
	
	public double comparTo(Student anotherStudent1) {
		
		return compare(Score, anotherStudent1.Score);
		
	}


	private double compare(double score2, double score3) {
		// TODO Auto-generated method stub
		return 0;
	}
}
