package javaprj.day0207.ioEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Score2 {
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public Score2(String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public double calculateAverage() {
        return (koreanScore + englishScore + mathScore) / 3.0;
    }

    public char calculateGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

public class FileEx11 {
    public static void main(String[] args) {
        try {
            // 파일에서 성적 읽어오기
            BufferedReader reader = new BufferedReader(new FileReader("res/성적파일.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                // 콤마로 구분된 문자열을 분리하여 이름과 점수를 얻음
                String[] data = line.split(",");
                
                // 첫 번째 요소는 이름, 나머지는 점수
                String name = data[0];
                int koreanScore = Integer.parseInt(data[1]);
                int englishScore = Integer.parseInt(data[2]);
                int mathScore = Integer.parseInt(data[3]);

                // Score 객체 생성
                Score2 studentScore = new Score2(name, koreanScore, englishScore, mathScore);

                // 결과 출력
                System.out.println("이름: " + studentScore.getName());
                System.out.println("평균 점수: " + studentScore.calculateAverage());
                System.out.println("학점: " + studentScore.calculateGrade());
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
