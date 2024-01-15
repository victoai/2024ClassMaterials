package ReservationSystem;

import java.util.Scanner;

public class UserHandler {

	private UserInfo[] users;
	private int idx;

	public UserHandler(int num) {
		users = new UserInfo[num];
		idx = 0;
	}

	public void userInsert() {
		String id, pw, name;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		id = sc.nextLine();
		if (!isUniqueID(id)) {
			System.out.println("이미 사용중인 아이디입니다. \n");
			return;
		}

		System.out.println("암호 : ");
		pw = sc.nextLine();
		System.out.println("이름 : ");
		name = sc.nextLine();

		users[idx] = new UserInfo(id, pw, name);
		idx++;
		System.out.println("가입 완료! \n");
	}

	private boolean isUniqueID(String id) {
		if (idx == 0)
			return true;
		for (int i = 0; i < idx; i++) {
			if (users[i].getId().equals(id)) {
				return false;
			}
		}
		return true;
	}

	public void userLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("패스워드 : ");
		String pw = sc.nextLine();

		for (int i = 0; i < idx; i++) {
			if (users[i].getId().equals(id) && users[i].getPw().equals(pw)) {
				System.out.println("로그인에 성공하셨습니다. \n");
				menuSelect();
				return;

			} else if (!users[i].getId().equals(id)) {
				System.out.println("존재하지 않는 아이디입니다. \n");
				return;
			} else if (users[i].getId().equals(id) && !users[i].getPw().equals(pw)) {
				System.out.println("암호가 잘못되었습니다.");
				return;
			}
		}
	}

	public void menuSelect() {

		loop: while (true) {
			System.out.println("--여행할때 여기어때--");
			System.out.println("1. 마이페이지");
			System.out.println("2. 예약하기");
			System.out.println("3. 뒤로가기");

			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				MyPage my = new MyPage();
				my.menuSelect();
				break;
			case 2:
				// 예약하기
				System.out.println("--예약페이지--");
				break;
			case 3:
				// 뒤로가기
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

}
