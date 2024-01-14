package 함수실습_0727;

import java.util.Scanner;

public class 일정관리프로그램_삭제추가 {

	public static void main(String[] args) {
		//일정을 관리하는 프로그램 10개
		String[] days = new String[10];
		Scanner sc = new Scanner(System.in);
		int index = 0;
		
		loop:while(true) {
			System.out.println("메뉴선택: 1:등록, 2:조회, 3:변경, 4:삭제, 5:종료");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				//일정 등록 최대 5개 제한
				if(index == 5) {
					System.out.println("일정을 더이상 등록할 수 없습니다.(최대 5개)");
					break;
				}
				System.out.println("일정을 입력하세요");
				String day = sc.nextLine();
				days[index]= day;
				index++;ㅡ
				break;
			case "2":
				System.out.println("ㅡㅡ조회ㅡㅡ");
				for(int i =0; i<index; i++) {
					System.out.println((i+1)+"."+days[i]);
				}
				break;
			case "3":
				System.out.println("ㅡㅡ변경ㅡㅡ");
				for(int i =0; i<index; i++) {
					System.out.println((i+1)+"."+days[i]);
				}
				System.out.println("변경할 순번과 내용을 입력");
				String updateIndex_ = sc.nextLine();
				int updateIndex = Integer.parseInt(updateIndex_);
				String updateDay = sc.nextLine(); //중간에 스페이스 가능유무
				days[updateIndex-1] = updateDay;
				
				break;
			case "4":
				System.out.println("ㅡㅡ삭제ㅡㅡ");
				for(int i =0; i<index; i++) {
					System.out.println((i+1)+"."+days[i]);
				}
				System.out.println("삭제할 일정 선택");
				String deleteIndex_ = sc.nextLine();
				int deleteIndex = Integer.parseInt(deleteIndex_);
				//일정 삭제부분
				index--;
				for(int i = deleteIndex; i< days.length; i++) {
					days[i-1] = days[i];
				}
				break;
			case "5":
				System.out.println("종료");
				break loop;
			default:
				System.out.println("잘못된 입력");
			}
		}
	}

}
