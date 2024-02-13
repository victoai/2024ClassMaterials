package javaprj.day0207.ioEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx06 {

	public static void main(String[] args) {
	 
		try {
			//기반스트림 얻어오기
			//파일
			FileWriter w = new FileWriter("t/output.txt");
			w.write("안녕하세요");
			w.write( "파일쓰기가 되어요 !");			
			w.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
