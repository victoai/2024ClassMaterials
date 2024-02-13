package 티켓팅프로그램;

import java.util.Scanner;

public class TicketingMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//금요일
		Area sectorA_DaysA = new Area("res/Concert/sectorA_DaysA.txt", 10);
		Area sectorB_DaysA = new Area("res/Concert/sectorB_DaysA.txt", 10);
		Area sectorS_DaysA = new Area("res/Concert/sectorS_DaysA.txt", 10);
		Area sectorV_DaysA = new Area("res/Concert/sectorV_DaysA.txt", 7);

		//토요일
		Area sectorA_DaysB = new Area("res/Concert/sectorA_DaysB.txt", 10);
		Area sectorB_DaysB = new Area("res/Concert/sectorB_DaysB.txt", 10);
		Area sectorS_DaysB = new Area("res/Concert/sectorS_DaysB.txt", 10);
		Area sectorV_DaysB = new Area("res/Concert/sectorV_DaysB.txt", 7);

		//일요일
		Area sectorA_DaysC = new Area("res/Concert/sectorA_DaysC.txt", 10);
		Area sectorB_DaysC = new Area("res/Concert/sectorB_DaysC.txt", 10);
		Area sectorS_DaysC = new Area("res/Concert/sectorS_DaysC.txt", 10);
		Area sectorV_DaysC = new Area("res/Concert/sectorV_DaysC.txt", 7);

		//요일별로 배열에 저장
		Area[][] SectorAll = { 
				{ sectorV_DaysA, sectorS_DaysA, sectorA_DaysA, sectorB_DaysA }, // 금요일
				{ sectorV_DaysB, sectorS_DaysB, sectorA_DaysB, sectorB_DaysB }, // 토요일
				{ sectorV_DaysC, sectorS_DaysC, sectorA_DaysC, sectorB_DaysC }, // 일요일
			};
		
		FileManager.InitFolder(); // 폴더 생성

		System.out.println("콘서트 날짜를 선택합니다 아래 요일중 방문하실 요일을 선택 해주세요 .");
		System.out.println();
		Area[] Sector = null; //초기값 설정안하면 작동 안함
		String days = "0";
		loop3 :	while (true) { //날짜 선택
			System.out.println("금, 토, 일 중 예약하실 요일을 선택하세요");
			loop: while (true) {
				days = sc.next();
				switch (days) {
				case "금":
					Sector = SectorAll[0];
					break loop;
				case "토":
					Sector = SectorAll[1];
					break loop;
				case "일":
					Sector = SectorAll[2];
					break loop;
				default:
					System.out.println("요일이 잘못되었습니다. 금, 토, 일 중 다시 입력해주세요");
					break ;
				}
			}
			// 파일, 배열 생성
			for (int i = 0; i < Sector.length; i++) {
				FileManager.InitFile(Sector[i]);
			}


			System.out.println("콘서트 좌석을 예매합니다 아래 메뉴중 원하시는 목록을 입력 해주세요 .");
			ReservationManager.reservationConfirm(Sector);

			loop2: while (true) {
				System.out.println("\n\n  1. 좌석 등록 2. 좌석 조회 3. 좌석 변경 4. 좌석 취소 5. 총 수익 6. 요일 선택 7. 프로그램 종료\n");
				String menu = "0";
				menu = sc.next();

				switch (menu) {
				case "1":
					//예약등록
					ReservationManager.reservationConfirm(Sector);
					System.out.println("\n--좌석 구역과 좌석을 선택해주세요--\n구역을 입력하세요.( A, B, S, V ) : ");
					ReservationManager.reservationSeat(Sector);
					break;
				case "2":
					//예약조회
					ReservationManager.reservationConfirm(Sector);
					break;
				case "3":
					//예약변경
					ReservationManager.reservationConfirm(Sector);
					System.out.println("좌석을 변경합니다.");
					ReservationManager.reservationChange(Sector);
					break;
				case "4":
					//예약취소
					ReservationManager.reservationConfirm(Sector);
					System.out.println("좌석을 취소합니다.");
					ReservationManager.reservationDelete(Sector);
					break;

				case "5":
					//좌석 총 수익
					ReservationManager.totalPrice(Sector);
					break;

				case "6":
					//요일 변경
					System.out.println("요일 선택");
					// 파일 저장 * 아웃시 파일에저장
					for (int i = 0; i < Sector.length; i++) {
						FileManager.FileSave(Sector[i]);
					}
					break loop2;
				case "7":
					//프러로그램 종료
					System.out.println("종료합니다");
					// 파일 저장 * 루프아웃시 파일에저장
					for (int i = 0; i < Sector.length; i++) {
						FileManager.FileSave(Sector[i]);
					}
					break loop3;
				default:
					System.out.println("잘못된 메뉴 선택입니다.");
					break;
				}
			}
		}
	}
}
