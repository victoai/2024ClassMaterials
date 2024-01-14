package day09.quiz;

import java.util.Scanner;

public class quiz05and06 {
    static String[][] schedule = new String[5][5];
    static Scanner scanner = new Scanner(System.in);
    static String menu;
    static int menuNum = 0;
    static String num;
    static int weekNum = 0;
    static String sche;
    static int scheNum = 0;
    static String content;
    public static void main(String[] args) {

        while(true) {
            System.out.println("메뉴를 선택하세요 0.등록 1.조회 2.변경 3.삭제");
            menu = scanner.nextLine();
            menuNum = Integer.parseInt(menu);
            switch (menuNum){
                case 0:
                    resist(scanner); // n(0~4)일차 n(0~4)번째 일정을 입력하는 함수
                    break;
                case 1:
                    System.out.println("조회할 n(0~4)일차 n(0~4)번째 일정을 입력하세요");
                    weekNum = day(scanner);         // n(0~4)일차를 입력하는 함수
                    scheNum = nsche(scanner);       // n(0~4)번째 일정을 입력하는 함수
                    System.out.println(schedule[weekNum][scheNum]);
                    break;
                case 2:
                    System.out.println("변경할 n(0~4)일차 n(0~4)번째 일정을 입력하세요");
                    weekNum = day(scanner);
                    scheNum = nsche(scanner);
                    scheCont(scanner);
                    break;
                case 3:
                    System.out.println("삭제할 n(0~4)일차 n(0~4)번째 일정을 입력하세요");
                    weekNum = day(scanner);                 // n(0~4)일차를 입력하는 함수
                    scheNum = nsche(scanner);               // n(0~4)번째 일정을 입력하는 함수
                    schedule[weekNum][scheNum] = "삭제됨";    // 삭제 대신 공백을 넣음
                    break;

            }
        }
    }

    private static void resist(Scanner scanner) {       // 일정등록 함수
        int weekNum;
        String num;
        System.out.println("등록할 n(0~4)일차 선택하세요");
        weekNum = day(scanner); // n(0~4)일차를 입력하는 함수
        switch (weekNum) {
            case 0:
                insertday(scanner); // n(0~4)일차의 (0~4)번째 일정을 입력하는 함수
                break;
            case 1:
                insertday(scanner);
                break;
            case 2:
                insertday(scanner);
                break;
            case 3:
                insertday(scanner);
                break;
            case 4:
                insertday(scanner);
                break;
            default:
                re(); // "다시"를 출력하는 함수
        }
        return;
    }

    private static int day(Scanner scanner) {       // n(0~4)일차를 입력하는 함수
        int weekNum;
        String num;
        num = scanner.nextLine();
        weekNum = Integer.parseInt(num);
        return weekNum;
    }
    private static void insertday(Scanner scanner) {    // n(0~4)번째 일정과 내용을 입력하는 함수
        String sche;
        int scheNum;
        System.out.println("등록할 n(0~4)번째 일정을 선택하세요");
        scheNum = nsche(scanner); // n(0~4)번째 일정을 입력하는 함수
        switch (scheNum){
            case 0:
                scheCont(scanner); // 일정 내용을 입력하는 함수
                break;
            case 1:
                scheCont(scanner);
                break;
            case 2:
                scheCont(scanner);
                break;
            case 3:
                scheCont(scanner);
                break;
            case 4:
                scheCont(scanner);
                break;
            default:
                re();
                break;
        }
    }

    private static int nsche(Scanner scanner) {        // n(0~4)번째 일정을 입력하는 함수
        String sche;
        int scheNum;
        sche = scanner.nextLine();
        scheNum = Integer.parseInt(sche);
        return scheNum;
    }
    private static void scheCont(Scanner scanner) {     // 일정 내용 입력하는 함수
        String content;
        System.out.println("등록할 내용을 입력하세요");
        content = scanner.nextLine();
        schedule[weekNum][scheNum] = content;
    }

    private static void re() {          // default에 출력할 내용
        System.out.println("다시");
    }

}
