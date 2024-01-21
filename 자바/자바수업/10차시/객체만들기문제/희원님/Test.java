package week03.day2.희원님;

public class Test {

	public static void main(String[] args) {
		 
		
		int p1,p2,p3,p4;		
		int[] price= {100,200,500,50};	  // 0 1 2 3  연속적이다, 크기가 같다	
		
		p1=10;
		p2=5;
		p3=50;
		p4=3;
		
		System.out.println( price);  //배열이름 , 시작위치값=address(메모리주소값)
		
		price[0]=10;
		price[1]=20;
		price[2]=30;
		price[3]=40;
		price[4]=5;
		int total = price[0] + price[1] + price[2] + price[3];
	}

}
