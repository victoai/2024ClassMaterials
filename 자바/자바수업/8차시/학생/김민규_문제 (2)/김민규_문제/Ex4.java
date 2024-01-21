package java_day7;



public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	

	int [] result = money1(20);
	
	for(int moneyUnit :result ) { 
		System.out.print(moneyUnit + " ");
	}
	

	
}

	public static int[] money1(int money) {
		int [] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int [] moneyArrMain = new int [moneyArr.length];
		
		
		
		for(int i = 0 ; i <moneyArr.length; i++ ) {
			moneyArrMain[i]= money / moneyArr[i];
			money %= moneyArr[i];
		}
		
		System.out.print("돈 매수 구하기"+ " : ");
		return moneyArrMain;
		
	
		
	}
}

