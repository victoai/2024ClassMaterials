package 자바문제_문나정;


import java.util.Scanner;
public class Qz_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu = 0;
		
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(num<5) {
			menu =  sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("1번 등록");
				break;
			case 2:
				System.out.println("2번 조회");
				break;
			case 3:
				System.out.println("3번 변경");
				break;
			case 4:
				System.out.println("4번 삭제");
				break;
			default:
				System.out.println("잘못입력함");
				break;
					
			}
			num++;
			if(num==5) {
				System.out.println("5번 반복함. 종료함.");
			}
		}
		

	}

}
