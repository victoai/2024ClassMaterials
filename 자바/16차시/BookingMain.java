package 프로젝트;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ObjectInputStream ois = null;
		
		System.out.println("지역을 선택하세요");
		System.out.println("1.제주 2.인천 3.부산");
		int aNum = sc.nextInt();
		
		switch(aNum) {
		case 1:
			try {
				ois = new ObjectInputStream(new FileInputStream("res/JejuList.txt"));
				try {
					while(true) {
						Booking booking = (Booking) ois.readObject();
						
						
//						
//						if(booking.getEmpty()==true) {
//							System.out.println(booking);
//						}
					}
				} catch (EOFException e) {
					System.out.println(" 다 읽었음");
				}
				System.out.println(" 프로그램 정상 종료");

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
			
		}
		
		
		
		System.out.println("날짜를 선택하세요");
		
		
	}

}
 