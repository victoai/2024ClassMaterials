package 실습9차시;

import java.util.Scanner;

public class 등록조회변경삭제_김현수 {

	public static void main(String[] args) {
		System.out.println("MyProgram");
		System.out.println("1.등록");
		System.out.println("2.조회");
		System.out.println("3.변경");
		System.out.println("4.삭제");
		System.out.println("5.종료");

		String myFavoriteArr[] = new String[5];

		Scanner sc = new Scanner(System.in);

		loop:while (true) {
			System.out.print("메뉴를 선택하세요 : ");
			
			int menu = sc.nextInt();

			switch (menu) {

			case 1: // 등록
				System.out.println("====입력====.");
				
				register(myFavoriteArr);
				break;
			case 2: // 조회
				System.out.println("====조회====.");
				inquiry(myFavoriteArr);
				break;
			case 3: // 변경
				System.out.println("====변경====.");
				
				change(myFavoriteArr);
				break;
			case 4: // 삭제
				System.out.println("====삭제====.");
				myFavoriteArr = delete(myFavoriteArr);
				break;
			case 5: // 종료
				System.out.println("프로그램을 종료합니다.");
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	public static String[] register(String[] arr) {
		System.out.println("좋아하는것을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.next();
		}
		return arr;
	}
	
	public static void inquiry(String[] arr) {
		System.out.println("조회를 합니다.");
		for(String item : arr){
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	public static String[] change(String[] arr) {
		System.out.println("몇번째 데이터를 수정하겠습니까? : ");
		Scanner sc = new Scanner(System.in);
		int updateIndex_ = sc.nextInt();
		int updateIndex = updateIndex_-1;
		arr[updateIndex] = sc.next(); 
		return arr;
	}
	
	public static String[] delete(String[] arr) {
		System.out.println("몇번째 데이터를 삭제하겠습니까? : ");
		Scanner sc = new Scanner(System.in);
		int deleteIndex_ = sc.nextInt();
		int deleteIndex = deleteIndex_-1;
		String[] newArr = new String[arr.length-1];
		for(int i=0; i<deleteIndex; i++) {
			newArr[i] = arr[i];
		}
		for(int i=deleteIndex; i<newArr.length; i++) {
			newArr[i] = arr[i+1];
		}
		return newArr;
	}
}
