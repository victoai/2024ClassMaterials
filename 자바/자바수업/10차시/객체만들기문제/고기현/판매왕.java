package week03.day2.고기현;

import java.util.Scanner;

public class 판매왕 {
	Scanner sc =new Scanner(System.in);
	
	private String[] travel = {"일본여행피키지","태국여행패키지","영국여행패키지","프랑스여행패키지","스폐인여행패키지"};
	private int[] price = {150,120,300,280,270};
	private int index = sc.nextInt();
	private String[] names = new String[index];	
	private int[][] sell = new int[index][5];
	private int[][] money = new int[index][5];
	private int[] moneyTot = new int[index];
	private int a;

	public 판매왕() {	
		
	}
	
	public String[] name() {
		for(int i=0; i<names.length; i++) {
			System.out.print("이름을 입력하세요. > ");
			names[i]=sc.next();
		}
		return names;		
	}
	
	public  int[][] sell(){
		for(int i=0; i<names.length; i++) {
			System.out.print(" "+names[i]+" 사원의 판매량을 입력하세요. > ");
			for(int j=0; j<5; j++) {
				System.out.print(" "+travel[j]+"판매량을 입력하세요. > ");
				sell[i][j]= sc.nextInt();
			}
		}
		return sell;
	}
	public int[][] money() {
		for (int i=0; i < names.length; i++) {
			for (int j=0; j < 5; j++) {
				money[i][j] = price[j]*sell[i][j];
			}
		}	
		return money;
	}
	public  int[] TotalMoney() {
		for (int i=0; i < names.length; i++) {
			for (int j=0; j < 5; j++) {
				moneyTot[i]+=money[i][j];
			}
		}
		return moneyTot;
	}
	public  int winner() {
		int big=0;
		for(int i=0;i<names.length;i++) {
			if(big<moneyTot[i]) {
				big=moneyTot[i];
				a=i;
			}
		}
		return a;
	}
	public void printresult() {
		System.out.println("=== 개인 판매금액 ===");
		for(int i=0; i<names.length; i++) {
			System.out.println("이름: "+names[i]+", 총판매금액: "+moneyTot[i]+"만원");
			
		}
		System.out.println("=== 판매왕 ===");
		
		System.out.print("이름: "+names[a]+", 총판매금액: "+moneyTot[a]+"만원");
		
		
	}
		
}
