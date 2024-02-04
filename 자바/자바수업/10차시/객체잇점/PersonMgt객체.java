package javaprj.day0201;

 

import java.util.Scanner;

public class PersonMgt객체 {

    public static void main(String[] args) {
        // 배열 초기화
        Customer[] customers = new Customer[3];

        // 정보 입력 함수 호출
        inputPersonInfo(customers);

        // 정보 출력 함수 호출
        displayPersonInfo(customers);
    }

    // 정보 입력 함수
    public static void inputPersonInfo(Customer[] customers) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("고객정보 입력하세요" + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            System.out.print("Address: ");
            String address = scanner.nextLine();

            // Customer 객체 생성 및 배열에 추가
            customers[i] = new Customer(name, age, address);
        }

        scanner.close();
    }

    // 정보 출력 함수
    public static void displayPersonInfo(Customer[] customers) {
        System.out.println("\n  조회:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Name: " + customers[i].getName());
            System.out.println("Age: " + customers[i].getAge());
            System.out.println("Address: " + customers[i].getAddress());
            System.out.println();
        }
    }

  
}
