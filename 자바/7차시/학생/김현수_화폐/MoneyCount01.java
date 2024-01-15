package day07;

public class MoneyCount01 {

	public static void main(String[] args) {
		int MyMoney = 571210;
		
		int FiftythousandCnt = MyMoney / 50000;
		int Tenthousand = (MyMoney % 50000) / 10000;
		int Fivethousand = ((MyMoney % 50000) % 10000)/5000;
		int Onethousand = (((MyMoney % 50000) % 10000)%5000)/1000;
		int Fivehundred = ((((MyMoney % 50000) % 10000)%5000)%1000)/500;
		int Onehundred = (((((MyMoney % 50000) % 10000)%5000)%1000)%100)/100;
		int Fifty = ((((((MyMoney % 50000) % 10000)%5000)%1000)%100)%100)/50;
		int Ten = (((((((MyMoney % 50000) % 10000)%5000)%1000)%100)%100)%50)/10;
	}
}
