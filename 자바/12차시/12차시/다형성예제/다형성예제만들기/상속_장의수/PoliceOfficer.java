package 상속_장의수;

public class PoliceOfficer extends Building{
	Police[] polices;
	
	public PoliceOfficer() {
	}
	
	public PoliceOfficer(String name, String where,Police[] p) {
		super(name,where);
		polices =p;
	}
	@Override
	public void move() {
		System.out.println("경찰 출동!");
	}
}
