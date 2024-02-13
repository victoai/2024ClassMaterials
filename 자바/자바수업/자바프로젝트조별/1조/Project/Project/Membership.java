package Project;

public class Membership {
	private  String grade;
	private int standard;
	private double point;
	
	public Membership() {}
	
	public Membership(String grade,int standard, double point) {
		this.grade = grade;
		this.standard = standard;
		this.point = point;
	}
	
	public String getGrade() {
		return grade;
	}
	public int getStandard() {
		return standard;
	}
	public double getPoint() {
		return point;
	}

	@Override
	public String toString() {
		return "Membership [grade=" + grade + ", standard=" + standard + ", point=" + point + "]";
	}
	
	
	

}
