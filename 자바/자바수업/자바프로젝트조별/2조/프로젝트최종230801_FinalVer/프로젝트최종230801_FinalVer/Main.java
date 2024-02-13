package 프로젝트최종230801_FinalVer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import 프로젝트최종230801_FinalVer.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static MemberHandler handler = new MemberHandler();
	static int hNum;
	static String hotel;
	static String date;
	static int aNum;
	static String login_id;
	static String area;
	static ArrayList<Booking> reservation = new ArrayList<>();
	static 영화핸들러 m = new 영화핸들러();
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		handler.FileOutput(handler.memberInfos, "LoginList");
		FileOutput(reservation);
		
		loop: while (true) {
			System.out.println("--- 회원가입/로그인 Page ---");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 영화정보");
			System.out.println("0. 프로그램 종료");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				handler.memberInsert();				
				break;
			case 2:
				login_id = handler.memberLogin(); // id = login_id
				if(login_id!="fail") {
					menuSelect01();
				}
				break;
			case 3:
				m.run();
				break;

			case 0:
				// 예약된 정보 파일에 저장
				handler.FileInput(handler.memberInfos, "LoginList");
				FileInput(reservation);
				System.out.println("프로그램 종료");
				break loop;
			}
		}
	}
	
	

	public static void menuSelect01() throws IOException, ClassNotFoundException {

		loop: while (true) {
			System.out.println("--- 여기어때 ---");
			System.out.println("1. 마이페이지");
			System.out.println("2. 예약하기");
			System.out.println("0. 로그아웃하기");

			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				menuSelect02();
				break;
			case 2:
				reservation();
				break;
			case 0:
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}

	public static void menuSelect02() {

		loop: while (true) {
			System.out.println("--- 마이페이지 ---");
			System.out.println("내 정보");
			System.out.println("----------------------");
			handler.ShowMyInfo();
			System.out.println("----------------------");
			System.out.println("1. 예약정보조회");
			System.out.println("2. 내정보수정");
			System.out.println("0. 뒤로가기");

			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				myReservation();
				break;
			case 2:
				System.out.println("--내정보수정--");
				ChangeMyInfo();
				break;
			case 0:
				// 뒤로가기
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}
	
	public static void myReservation() {
		loop: while (true) {
			System.out.println("---예약정보조회---");
			myReservationSearch();
			System.out.println("1. 예약취소");
			System.out.println("0. 뒤로가기");

			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("--예약취소--");
				myReservationCancel();
				break;
			case 0:
				// 뒤로가기
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

	public static void ChangeMyInfo() {
		loop: while (true) {
			System.out.println("--바꿀 정보 선택--");
			System.out.println("----------------------");
			handler.ShowMyInfo();
			System.out.println("----------------------");
			System.out.println("1. 이름");
			System.out.println("2. 비밀번호");
			System.out.println("3. 전화번호");
			System.out.println("0. 뒤로가기");

			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("--이름바꾸기--");
				handler.ChangeMyName();
				break;
			case 2:
				System.out.println("--비밀번호바꾸기--");
				handler.ChangeMyPw();
				break;
			case 3:
				System.out.println("--전화번호바꾸기--");
				handler.ChangeMyPhonNum();
				break;
			case 0:
				// 뒤로가기
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

	public static void reservation() {
		 
		// 예약된 정보 배열
		loop: while (true) {
			System.out.println("------------------------------------------------------------");
			System.out.println("지역을 선택하세요");
			for (int i = 0; i < BookingInfo.area.length; i++) {
				System.out.print((i + 1) + "." + BookingInfo.area[i] + " ");
			}
			System.out.println();
			aNum = sc.nextInt(); // 지역선택
			area = BookingInfo.area[aNum - 1];

			System.out.println("------------------------------------------------------------");
			System.out.println("날짜를 입력하세요. ex)0000/0/0");
			date = sc.next(); // 날짜 선택

			System.out.println("------------------------------------------------------------");
			System.out.println("호텔을 선택하세요");
			switch (aNum) {
			case 1: // 인천
				search(BookingInfo.IncheonHotel);
				register(reservation);
				break;
			case 2: // 부산
				search(BookingInfo.BusanHotel);
				register(reservation);
				break;
			case 3: // 제주
				search(BookingInfo.JejuHotel);
				register(reservation);
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;
			}
			
			System.out.println("계속 예약하시겠습니까? 1.예 2.아니오");
			aNum = sc.nextInt();
			if (aNum != 1) {
				break loop;
			}
		}

		System.out.println("------------------------------------------------------------");
//		registerSearch(BookingList.IncheonList);
//		registerSearch(BookingList.BusanList);
//		registerSearch(BookingList.JejuList);



	}

	// 파일내용 다시 배열에 저장
	public static void FileOutput(ArrayList<Booking> item) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/List.txt"));
			int cnt=0;
			while(true) {
				String data = bf.readLine();
				if( data == null) break;
				cnt++;
			}
			String[][] arr = new String[cnt][10]; 
			int index =0;
			bf = new BufferedReader(new FileReader("res/List.txt"));
			while(true) {
				String data = bf.readLine();
				if( data == null) break;
				arr[index] = data.split(" ");
				String b = "예약가능";
				if(arr[index][9].equals(b)){
					item.add(  new Booking(arr[index][1], arr[index][3], arr[index][5], arr[index][7], false ));
					
				}else {
					item.add(  new Booking(arr[index][1], arr[index][3], arr[index][5], arr[index][7], true ));
				}
				index++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	
	
	
	
	// 예약된 정보 파일에 저장
	public static void FileInput(ArrayList<Booking> reservation) {
		try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("res/List.txt"));
            // 문자열을 파일에 쓰기
            for(int i=0; i<reservation.size(); i++) {
            	writer.write(reservation.get(i).toString()+"\n");
            }
            // 파일 쓰기 완료 후 닫기
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	// 등록된 예약 조회
	public static void registerSearch(ArrayList<Booking> item) {
		for (int i = 0; i < item.size(); i++) {
			Booking b = item.get(i);
			if (b.isEmpty() == true) {
				System.out.println(b);
			}
		}
	}

	// 예약 등록
	public static void register(ArrayList<Booking> item) {
		for (int i = 0; i < item.size(); i++) {
			Booking b = item.get(i);
			if (b.getHotel().equals(hotel) && b.getDate().equals(date)) {
				if (b.isEmpty() == false) {
					b.setEmpty((true));
					b.setId(login_id);
					System.out.println("정상적으로 예약되었습니다.");
				} else {
					System.out.println("이미 예약된 방입니다.");
				}
			}
		}
	}

	
	// 지역 호텔 조회
	public static void search(String[] item) {
		for (int i = 0; i < item.length; i++) {
			System.out.print((i + 1) + "." + item[i] + " ");
		}
		System.out.println();
		hNum = sc.nextInt(); // 호텔 선택
		hotel = item[hNum - 1];
	}
	
	public static void myReservationSearch() {
		int cnt=1;
		if (reservation.size()==0) {
			System.out.println("예약된 정보가 없습니다.");
		}else {
			for(int i=0;i<reservation.size();i++) {
				Booking b = reservation.get(i);
				if(b.getId().equals(login_id)) {
					System.out.println((cnt)+". " + b);
					cnt++;
					}
				}
		}
	}
	public static void myReservationCancel() {
		System.out.println("삭제 예약정보번호를 입력하세요.");
		System.out.println("---------------------------");
		myReservationSearch();
		System.out.println("---------------------------");
		int num = sc.nextInt();
		int cnt = 1;
		for(int i=0;i<reservation.size();i++) {
			Booking b = reservation.get(i);
			if(b.getId().equals(login_id)) {
				if(num==cnt) {
					b.setId("null");
					b.setEmpty(false);
				}else {
					cnt++;
				}
			}
		}
	}
	public static String getLogin_id() {
		return login_id;
	}



	public static void setLogin_id(String login_id) {
		Main.login_id = login_id;
	}


}
