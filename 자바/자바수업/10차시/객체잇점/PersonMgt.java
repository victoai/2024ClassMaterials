package javaprj.day0201;

import java.util.Scanner;

public class PersonMgt {

    public static void main(String[] args) {
        // 배열 초기화
        String[] names = new String[3];
        int[] ages = new int[3];
        String[] addresses = new String[ 3];
 
        // 정보 입력 함수 호출
        inputPersonInfo(names, ages, addresses);

        // 정보 출력 함수 호출
        displayPersonInfo(names, ages, addresses);
    }

    // 정보 입력 함수
    public static void inputPersonInfo(String[] names, int[] ages, String[] addresses) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("고객정보입력하세요" + (i + 1) + ":");
            
            System.out.print("Name: ");
            names[i] = scanner.nextLine();

            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            System.out.print("Address: ");
            addresses[i] = scanner.nextLine();
        }

        scanner.close();
    }

    // 정보 출력 함수
    public static void displayPersonInfo(String[] names, int[] ages, String[] addresses) {
        System.out.println("\n  조회:");

        for (int i = 0; i <  3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Address: " + addresses[i]);
            System.out.println();
        }
    }
}
