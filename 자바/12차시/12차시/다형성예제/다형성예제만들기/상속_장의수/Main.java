package 상속_장의수;

public class Main {

	public static void main(String[] args) {
		
		FireFighter[] fs = new FireFighter[] {new FireFighter("철수"),new FireFighter("영희")};
		Police[] ps = new Police[] {new Police("수지"),new Police("서현")};
		Person[][] persons = new Person[][] {fs,ps,{new Arsonist("태양")}};
		
		Building[] bs= new Building[] {new FireStation("소방서","홍대",fs),new PoliceOfficer("경찰서","강남",ps)};

		Arsonist a1= (Arsonist)persons[2][0];
		a1.arson();
		
		for(Building b:bs) {
			if(b instanceof FireStation) {
				((FireStation)bs[0]).move();
				
				for(FireFighter f : ((FireStation)bs[0]).fire_fighters) {
					f.remove_fire();
				}
				
			}else if(b instanceof PoliceOfficer) {
				((PoliceOfficer)bs[1]).move();
				
				for(Police p : ((PoliceOfficer)bs[1]).polices) {
					p.arrest(a1.name);
				}
			}
		}
		
		
		

	}

}
