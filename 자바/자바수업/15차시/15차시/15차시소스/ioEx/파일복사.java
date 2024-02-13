package javaprj.day0207.ioEx;

import java.io.*;

public class 파일복사 {
    public static void main(String[] args) {
    	// String sourceFilePath = "res/다운로드.jpg"; // 원본 파일 경로
         // String targetFilePath = "res/복사본파일이미지.jpg"; // 복사본 파일 경로
          
           String sourceFilePath = "c:\\acorn\\a.txt"; // 원본 파일 경로   절대경로표시할 수 있음
           String targetFilePath = "c:\\acorn\\복사본파일2.txt"; // 복사본 파일 경로



        try (FileInputStream inputStream = new FileInputStream(sourceFilePath);
        		FileOutputStream outputStream = new FileOutputStream(targetFilePath)) {

            // 파일 복사
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

            System.out.println("파일 복사가 완료되었습니다.");

        } catch (IOException e) {
            System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
        }
    }
}
