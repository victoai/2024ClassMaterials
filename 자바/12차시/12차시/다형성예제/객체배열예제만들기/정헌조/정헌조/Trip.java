package prjDay12;

public class Trip {

	String name;
	String time;
	String transport;
	int fare;
	
	public Trip() {
		
	}
	
	public Trip(String name, String time ,String transport,int fare) {
		this.name=name;
		this.time=time;
		this.transport=transport;
		this.fare=fare;
	}
	public String getInfo() {
		return name + " " +"서울역에서"+ time + " " + transport + " " + fare+"원";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " +"서울역에서"+ time + " " + transport + " " + fare+"원";
	}
}
