package 커피자판기프로그램;

public class 라면자판기 {
	public static void main(String[] args) {
		//커피정보를 담을 수 있는 변수가 만들어짐
		라면 coffee = new 라면();
		
		//값을 지정
		coffee.input (450,3,2,2500);

		//값을 출력
		coffee.printInfo();
		//System.out.println(coffee.설탕);
	}

}
