package java2.calculator;

public class AddCal implements Calculator{

	
	@Override
	public int intCal(int su1, int su2) {
		return su1 + su2;
	}

	@Override
	public double doubleCal(double su1) {
		return 0;
	}

}
