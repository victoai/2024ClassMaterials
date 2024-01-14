package week03.day2.고기현;

import java.util.Scanner;

public class 출장비 {
	Scanner sc =new Scanner(System.in);
	
	private int[] Te = {50000,10000,5000,1000,500,100,50,10};
	private int index = sc.nextInt();
	private String[] names = new String[index];
	private int[] pay = new int[index];
	private int[][] money = new int[index][8];
	private int[] moneyTot = new int[8];

	public 출장비() {	
		
	}
	
	public void printresult() {
		System.out.println("=== 개인 화폐매수 ===");
		for(int i=0; i<money.length; i++) {
			System.out.println("이름: "+names[i]+", 출장비: "+pay[i]+"원");
			for(int j=0; j<money[i].length; j++) {
				System.out.print(Te[j]+"원권: "+money[i][j]+"장 | ");
			}
		}
		System.out.println("=== 총 화폐매수 ===");
		for(int i=0; i<moneyTot.length; i++) {
			System.out.print(Te[i]+"원권: 총 "+moneyTot[i]+"장 | ");
		}
		
	}
	
	public String[] name() {
		for(int i=0; i<names.length; i++) {
			System.out.print("이름을 입력하세요. > ");
			names[i]=sc.next();
		}
		return names;		
	}
	
	public  int[] pay(){
		for(int i=0; i<pay.length; i++) {
			System.out.print(" "+names[i]+" 사원의 출장비를 입력하세요. > ");
			pay[i]= sc.nextInt();
		}
		return pay;
	}
	public int[][] money() {
		int ch;
		for (int i=0; i < money.length; i++) {
			ch = pay[i];
			for (int j=0; j < money[i].length; j++) {
				money[i][j] = ch/Te[j];
				ch= ch%Te[j];
			}
		}	
		return money;
	}
	public  int[] TotalMoney() {
		for (int i=0; i < money.length; i++) {
			for (int j=0; j < money[i].length; j++) {
				moneyTot[j]+=money[i][j];
			}
		}
		return moneyTot;
	}
}
