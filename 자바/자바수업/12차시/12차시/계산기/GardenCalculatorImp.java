package prjDay11.계산기;

public class GardenCalculatorImp implements Calculator{

	@Override
	public int addAcorn(int num1, int num2) {
		System.out.println("GARDEN " + num1 + " 더하기 " + num2 + " 결과");
		return num1+num2;
	}

	@Override
	public int subAcorn(int num1, int num2) {
		System.out.println("GARDEN " + num1 + " 빼기 " + num2 + " 결과");
		return num1-num2;
	}

	@Override
	public int multiplyAcorn(int num1, int num2) {
		System.out.println("GARDEN " + num1 + " 곱하기 " + num2 + " 결과");
		return num1*num2;
	}

	@Override
	public double devideAcorn(int num1, int num2) {
		System.out.println("GARDEN " + num1 + " 나누기 " + num2 + " 결과");
		return num1/(double)num2;
		
	}

}
