package javaprj.day0207.ioEx;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Object읽기반복 {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("scoreList.txt"));

			// while
			try {
				while (true) {
					Score data = (Score) ois.readObject();
					System.out.println("객체정보 " + data);
				}
			} catch (EOFException e) {
				System.out.println(" 다 읽었음");
			}
			System.out.println(" 프로그램 정상 종료");
			
			ois.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
