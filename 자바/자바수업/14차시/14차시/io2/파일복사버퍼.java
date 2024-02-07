package javaprj.day0207.ioEx;

import java.io.*;

public class 파일복사버퍼 {
    public static void main(String[] args) {
    	  String sourceFilePath = "res/다운로드.jpg"; // 원본 파일 경로
          String targetFilePath = "res/복사본파일이미지.jpg"; // 복사본 파일 경로

        try (InputStream inputStream = new FileInputStream(sourceFilePath);
             OutputStream outputStream = new FileOutputStream(targetFilePath)) {

            // 파일 복사
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("파일 복사가 완료되었습니다.");

        } catch (IOException e) {
            System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
        }
    }
}
