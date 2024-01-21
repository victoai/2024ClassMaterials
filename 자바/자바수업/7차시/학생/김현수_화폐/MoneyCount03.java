package day07;

import day06.Array3ExMy;

public class MoneyCount03 {

	public static void main(String[] args) {

		int MyMoney = 578780;
		int MyWallet[] = new int[8];
		int i = 0;
		int division = 50000;
		while (i<MyWallet.length) {
			if (i % 2 == 0) {
				MyWallet[i] = MyMoney / division;
				MyMoney = MyMoney % division;
				division = division /5;
				i++;
			}
			if (i % 2 != 0) {
				MyWallet[i] = MyMoney / division;
				MyMoney = MyMoney % division;
				division = division /2;
				i++;
			}
		}
		String[] title  = {"오만원","만원","오천원","천원","오백원","백원","오십원","십원"};
		for(i=0; i<MyWallet.length; i++)
		{
			System.out.println(title[i] + "의 개수는 " + MyWallet[i] + "개 입니다.");
			
			
		}

	}
}
