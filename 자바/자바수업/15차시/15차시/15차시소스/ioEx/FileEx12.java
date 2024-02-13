package javaprj.day0207.ioEx;

import java.io.*;


// Object 스트림을 이용할 때는 Serializable 인터페이스를 구현해야 한다 ( 마커인터페이스 : 표시용 인터페이스 )) 
class Score3 implements Serializable {
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public Score3(String name, int koreanScore, int englishScore, int mathScore) {
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

public class FileEx12 {
    public static void main(String[] args) {
        // 객체를 파일에 쓰기
        writeObjectToFile();

        // 파일에서 객체 읽기
        readObjectFromFile();
    }

    private static void writeObjectToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/studentss.dat"))) {
            // 객체 생성 및 파일에 쓰기
            Score3 student1 = new Score3("스티브잡스", 85, 90, 78);
            Score3 student2 = new Score3("빌게이츠", 92, 88, 95);

            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.close();

            System.out.println("데이터를 파일에 성공적으로 쓰기 완료!");
        } catch (IOException e) {
            System.err.println("파일에 쓰기 중 오류 발생: " + e.getMessage());
        }
    }

    private static void readObjectFromFile() {
        try {
            // 파일에서 객체 읽기
        	  ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/studentss.dat")) ;
            while (true) {
                try {
                    Score3 student = (Score3) ois.readObject();
                    // 읽어온 객체로부터 데이터 처리
                    System.out.println("이름: " + student.getName());
                    System.out.println("평균 점수: " + student.calculateAverage());
                    System.out.println("학점: " + student.calculateGrade());
                    System.out.println("--------------------");
                } catch (EOFException e) {
                    // 파일의 끝에 도달하면 예외 발생, 반복문 종료
                    break;
                }
            }
            
            
            ois.close();
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("파일에서 읽기 중 오류 발생: " + e.getMessage());
        }
    }
}
