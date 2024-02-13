package 티켓팅프로그램;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager{
	static String FolderPath = "res/Concert";
	
	//폴더 생성 매서드
	public static void InitFolder() {
		File directory = new File(FolderPath);
		if (!directory.exists()) {//존재여부
			boolean result = directory.mkdirs(); // 폴더 생성 시도
			if (result) {
				System.out.println("폴더가 생성되었습니다.");
			} else {
				//System.out.println("폴더 생성에 실패했습니다.");
			}
		} else {
			//System.out.println("이미 폴더가 존재합니다.");
		}
	}

	//파일 생성 매서드
	public static void InitFile(Area Sector) {
		try {
			File file = new File(Sector.Path);
			boolean result = file.createNewFile();
			//파일을 만들고 성공유무를 result에 저장
			if (result) {
				System.out.println("파일 생성 성공");
				FileWriter w = new FileWriter(Sector.Path); //해당경로에 파일을 씀
				for (int i = 0; i < Sector.Seat; i++) {
					w.write("□"); 
				}//초기 상태 힙영역에 저장
				w.flush();//파일에 넣어줌
			} else {
				//System.out.println("\n파일이 이미 존재합니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//파일 불러오기
		Sector.ConcertState();
	}
	
	public static void FileSave(Area Sector) {
		//파일 전체 저장
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Sector.Path));
            writer.write(Sector.Concert);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
