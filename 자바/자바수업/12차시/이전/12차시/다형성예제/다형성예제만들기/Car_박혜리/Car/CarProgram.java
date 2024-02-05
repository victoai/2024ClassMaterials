package Car;

public class CarProgram {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		cars[0]= new Redcar();
		cars[1]= new Bluecar();
		cars[2]= new Blackcar();
		
		for(int i=0;i<cars.length;i++) {
			cars[i].go();
			if(cars[i] instanceof Redcar){
				((Redcar)cars[i]).open();
			}
		}

	}
	

}
