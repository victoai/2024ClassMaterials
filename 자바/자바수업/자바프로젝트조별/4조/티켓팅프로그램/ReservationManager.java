package 티켓팅프로그램;

import java.util.Scanner;

public class ReservationManager {
	static Scanner sc = new Scanner(System.in);
	static int selectArea = 0;// 선택된 구역

	public ReservationManager() { // 기본 생성자
	}

	// 좌석 조회
	public static void reservationConfirm(Area[] Sector) {
		System.out.println(" ");
		System.out.println(
				"--------------------------------------좌석을 조회합니다.----------------------------------------------");
		System.out.println(" ");
		System.out.println(
				"                                        <STAGE>                                                  ");
		System.out.println(" ");

		for (int i = 0; i < Sector[0].Concert.length; i++) {
			System.out.print("    VIP " + (i + 1) + "번" + " " + Sector[0].Concert[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < Sector[1].Concert.length; i++) {
			System.out.print(" S열 " + (i + 1) + "석" + " " + Sector[1].Concert[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < Sector[2].Concert.length; i++) {
			System.out.print(" A열 " + (i + 1) + "석" + " " + Sector[2].Concert[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < Sector[3].Concert.length; i++) {
			System.out.print(" B열 " + (i + 1) + "석" + " " + Sector[3].Concert[i] + " ");
		}
		System.out.println();
		System.out.println();
	}

	// 좌석 등록
	public static void reservationSeat(Area[] Sector) {
		String Concert_Insert = sc.next().toUpperCase();

		switch (Concert_Insert) {
		case "V":
			selectArea = 0;
			selectSeat(Sector); // 'V'구역 예약좌석 선택
			break;
		case "S":
			selectArea = 1;
			selectSeat(Sector); // 'S'구역 예약좌석 선택
			break;
		case "A":
			selectArea = 2;
			selectSeat(Sector); // 'A'구역 예약좌석 선택
			break;
		case "B":
			selectArea = 3;
			selectSeat(Sector); // 'B'구역 예약좌석 선택
			break;
		default:
			System.out.println("잘못된 구역입니다.");
			break;
		}
	}

	// 좌석 삭제
	public static void reservationDelete(Area[] Sector) {
		System.out.println(
				"\n--------------------------- 기존 좌석의 열과 번호를 입력해주세요 구역:A,B,S,V-------------------------------- \n ");
		String Concert_Update = sc.next().toUpperCase();

		switch (Concert_Update) {
		case "V":
			selectArea = 0;
			deleteSeat(Sector); // 'V'구역에서 좌석삭제
			break;
		case "S":
			selectArea = 1;
			deleteSeat(Sector); // 'S'구역에서 좌석삭제
			break;
		case "A":
			selectArea = 2;
			deleteSeat(Sector); // 'A'구역에서 좌석삭제
			break;
		case "B":
			selectArea = 3;
			deleteSeat(Sector); // 'B'구역에서 좌석삭제
			break;
		default:
			System.out.println("잘못된 구역입니다.");
			break;
		}
	}

	// 좌석 변경
	public static void reservationChange(Area[] Sector) {
		System.out.println(
				"\n--------------------------- 기존 좌석의 열과 번호를 입력해주세요 구역:A,B,S,V-------------------------------- \n ");
		String Concert_Update = sc.next().toUpperCase();

		switch (Concert_Update) {
		case "V":
			selectArea = 0;
			changeDel(Sector); // 'V'구역에서 좌석삭제
			break;
		case "S":
			selectArea = 1;
			changeDel(Sector); // 'S'구역에서 좌석삭제
			break;
		case "A":
			selectArea = 2;
			changeDel(Sector); // 'A'구역에서 좌석삭제
			break;
		case "B":
			selectArea = 3;
			changeDel(Sector); // 'B'구역에서 좌석삭제
			break;
		default:
			System.out.println("잘못된 구역입니다.");
			break;
		}
	}

	// 좌석변경(삭제)
	public static void changeDel(Area[] Sector) {
		System.out.println("좌석을 선택해주세요:");

		// 숫자를 입력 하지않고 다른 단어를 입력했을때 알려주는 매서드 (예외처리 사용)
		try {
			String index_s = sc.next();
			int index = Integer.parseInt(index_s);
			if (index >= 0 || index < Sector[selectArea].Concert.length) {
				if (Sector[selectArea].Concert[index - 1] == '■') {
					Sector[selectArea].Concert[index - 1] = '□'; // 선택된 좌석을 빈 좌석으로 변경

					System.out.println(index + " 번 좌석" + "취소가 완료되었습니다.");
					System.out.println(
							"\n--------------------------- 변경 좌석의 열과 번호를 입력해주세요 구역:A,B,S,V-------------------------------- \n ");
					reservationSeat(Sector); // 새로 좌석 등록
				} else {
					System.out.println("이미 빈 좌석입니다.");
				}
			} else {
				System.out.println("잘못된 좌석 번호입니다.");
				System.out.println(
						"\n--------------------------- 변경할 좌석을 다시 입력해주세요 구역:A,B,S,V -----------------------------------\n ");
			}
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식입니다. 숫자를 입력해주세요.");
		}
	}

	// 좌석 삭제 관련 매서드
	public static void deleteSeat(Area[] Sector) {
		System.out.println("좌석을 선택해주세요:");

		// 숫자를 입력 하지않고 다른 단어를 입력했을때 알려주는 매서드 (예외처리 사용)
		try {
			String index_s = sc.next();
			int index = Integer.parseInt(index_s);
			if (index >= 0 || index < Sector[selectArea].Concert.length) {
				if (Sector[selectArea].Concert[index - 1] == '■') {
					Sector[selectArea].Concert[index - 1] = '□'; // 선택된 좌석을 빈 좌석으로 변경
					System.out.println(index + " 번 좌석" + "취소가 완료되었습니다.");
				} else {
					System.out.println("이미 빈 좌석입니다.");
				}
			} else {
				System.out.println("잘못된 좌석 번호입니다.");
			}
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식입니다. 숫자를 입력해주세요.");
		}
	}

	// 좌석 선택 관련 매서드
	public static void selectSeat(Area[] Sector) {
		System.out.println("좌석을 선택해주세요:");
		String index_s = sc.next();

		// 숫자를 입력 하지않고 다른 단어를 입력했을때 알려주는 매서드 (예외처리 사용)
		try {
			int index = Integer.parseInt(index_s);

			if (index >= 1 && index <= Sector[selectArea].Concert.length) {
				if (Sector[selectArea].Concert[index - 1] == '■') {
					System.out.println("이미 등록된 좌석입니다.");
				} else {
					Sector[selectArea].Concert[index - 1] = '■'; // 선택된 좌석을 '■'로 표시
					System.out.println("선택이 완료되었습니다.");
				}
			} else {
				System.out.println("잘못된 좌석 번호입니다.");
			}
		} catch (NumberFormatException e) {
			System.out.println("잘못된 입력 형식입니다. 숫자를 입력해주세요.");
			// 숫자가 아닐시 예외처리

		}
	}

	// 선택된 좌석 수 구하기
	public static int countSelectedSeats(Area sector) {
		int count = 0;
		for (char seat : sector.Concert) {
			if (seat == '■') {
				count++;
			} // 좌석배열을 검사해서 예약된 좌석수를 카운트
		}
		return count;
	}

	// 금액 구하기
	public static void totalPrice(Area[] Sector) {

		int totalPrice = countSelectedSeats(Sector[0]) * 150000 + countSelectedSeats(Sector[1]) * 120000
				+ countSelectedSeats(Sector[2]) * 100000 + countSelectedSeats(Sector[3]) * 100000;
		// 모든 좌석을 카운트해서 구역별로 금액을 다르게 계산
		System.out.println("총수익은 " + totalPrice + "원 입니다");
	}
}
