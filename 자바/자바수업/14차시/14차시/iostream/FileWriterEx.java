package iostream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter w = new FileWriter("outputex.txt");
		
		w.write("안녕하세요 파일이 써지네요!!!");

		w.flush();
	}

}
