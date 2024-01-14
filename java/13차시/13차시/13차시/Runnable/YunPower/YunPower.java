package week04.day3.Runnable.YunPower;

public class YunPower implements Power {

	@Override
	public int getPower(int num1, int num2) {
		// TODO Auto-generated method stub
		int sum=1;
		for(int i=1; i<=num2; i++) {
			sum = sum*num1;
		}
		return sum;
	}

}
