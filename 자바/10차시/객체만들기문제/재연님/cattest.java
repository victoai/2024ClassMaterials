package week03.day2.재연님;

public class cattest {
		public static void main (String[] args) { 
			cat  cat =  new  cat();
			
			cat.input("나비", "코리안숏헤어 ", 2, "수컷", "2022-09-10");
			cat.printInfo();
			cat.catact();
			cat.input("모모", "페르시안 ", 3, "암컷", "2022-09-10");		
			cat.printInfo();
			cat.catact();
	}
}
