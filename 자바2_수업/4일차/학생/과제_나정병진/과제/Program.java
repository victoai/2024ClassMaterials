package day4.과제;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		run();

	}
	
	static void run() throws FileNotFoundException, IOException {
		while(true) {
			
			System.out.println("=======================음악 추천=======================");
			System.out.printf("장르를 입력하세요.=> 발라드, 힙합, 댄스, 락 (종료 입력 시 종료) ");
			
			//***
			Properties p = new Properties();
			p.load(new FileReader("src/day4/과제/config.txt"));
			
			Random random = new Random();
			Scanner sc = new Scanner(System.in);
			String title = "";
			String genre = sc.next();
			
			//***
		    String songNum = genre+"곡수";
		    String songNum_ = p.getProperty(songNum);
		    System.out.println(songNum_+"곡 중 추천곡");
		    
			if(genre.equals("종료")) {
				System.out.println("종료합니다");
				break;
			}
			int rdm = random.nextInt(4)+1;
			title = genre + rdm;
			
			String className = p.getProperty(title);
			
			System.out.println("\n"+className+"\n");
		}
    }
}