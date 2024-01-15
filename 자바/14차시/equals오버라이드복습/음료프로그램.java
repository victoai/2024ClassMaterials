package day14.equals오버라이드복습;

 

public class 음료프로그램 {

	public static void main(String[] args) { 
		
		
		System.out.println("여러분 무엇을 드시고 싶나요?"); 
		
		
		
		Student arr[]  = new Student[16];  // null 초기화
		
		//  16   :15   15=> null초기화
		
		arr[0] = new  Kmg_Drink();
		arr[1] = new  StudentJH();
		arr[2] = new  박태민_음료상속();
		arr[3] = new  Ek_Student();
		arr[4] = new  Student_yj();
		arr[5] = new  LJH();
		arr[6] = new  LY_Student();
		arr[7] = new  juntae();
		arr[8] = new  Beverage_kdy();
		arr[9] = new  SYJ();
		arr[10] = new  KHS();
		arr[11] = new  문나정();
		arr[12] = new  jw_음료();
		arr[13] = new  병진();
		arr[14] = new  음료마시기_김민지();
		arr[15] = new  Kjy();
		
		
		
		for(int i=0 ; i< arr.length ; i++) {
			arr[i].음료마시기();
		}
		 
		
		

	}

}
