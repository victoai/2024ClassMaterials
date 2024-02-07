package javaprj.day0207.ioEx;
import java.io.*;

public class PrintWriterEx {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("res/numbersaaaaaaa.txt");
            
            // 여러 숫자들을 파일에 씁니다.
            int[] numbers = { 10, 20, 30, 40, 50 };
            for (int number : numbers) {
                writer.println(number);
            }
            
            writer.println("안녕세요");
            writer.close(); // 파일 쓰기 종료
            
            System.out.println("숫자들을 파일에 성공적으로 썼습니다.");
            
            
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        }
    }
}
