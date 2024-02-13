package 티켓팅프로그램;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Area {
	String Path; //파일 저장 경로
	int Seat; //최대 좌석수 
	char[] Concert; //좌석 예매내역
	
	//기본 생성자
	public Area() {
	}
	
	public Area(String path, int seat) { //파일 경로, 좌석수 받음 
		super();
		this.Path = path; //파일 경로
		this.Seat = seat; //최대 좌석수
		this.Concert = new char[seat]; //최대 좌석수 만큼 배열 생성
	}
	
	public void ConcertState() {
		//파일에서 한문자씩 읽어옴
		try {
			//해당 경로의 파일을 읽도록 설정
			FileReader fis = new FileReader(this.Path);
			
			//최대좌석수만큼 한문자씩 읽어옴
			for(int i = 0; i<this.Seat; i++) {
				int data = fis.read();
				this.Concert[i] = (char)data;
				//파일을 한문자씩 읽어서 배열에 저장
			}
		} catch (FileNotFoundException e) { //파일이 존재하지 않을 때
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
