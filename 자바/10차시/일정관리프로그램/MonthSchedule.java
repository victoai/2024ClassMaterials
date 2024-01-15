import java.util.Scanner;

public class MonthSchedule {
	
	Day day;	
	Day[][] year = new Day[12][31];
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		int m;
		System.out.println("스케줄 등록을 시작하겠습니다. \n먼저 날짜를 입력받겠습니다. ");
		do {
			System.out.println("월을 입력해주세요 (만약 3월이라면 3을 입력해주세요) ");
			m = sc.nextInt();
		}while(m < 1 || m > 12);
		
		int d;
		Boolean out = false;
		while(true) {
			System.out.println("일을 입력해주세요 \n(2월은 28일까지 / 4,6,9,11월은 30일까지 / 그 외는 31일까지 입니다.) ");
			d = sc.nextInt();
			if (d < 1 || d > 31) {
				System.out.println("날짜를 잘못입력하셨습니다. ");
			}else if (m == 2 && d > 28) {
				System.out.println("날짜를 잘못입력하셨습니다. ");
			}else if ((m == 4 || m == 6 || m == 9 || m == 11)&&(d > 30)) {
				System.out.println("일을 잘못입력하셨습니다. ");
			}else {
				int num;
				if(year[m-1][d-1]!= null) {
					while(true) {
					System.out.println(m+"월 "+d+"일의 스케줄은 이미 등록이 되어있습니다.기존의 데이터를 지우고 새로 입력하시겠습니까? ");
					System.out.println("기존의 데이터를 삭제하고 새 스케줄을 입력하려면 1번, 등록을 취소하고 메뉴로 돌아사려면 2번을 눌러주세요 ");
					num = sc.nextInt();
						if(num == 2) {
							out = true;
							break;
						}
						if(num == 1) {
							out = true;
							save(m,d);
							break;
						}
					}
				} else {
					out = true;
					save(m,d);
					break;
				}
			}
			if(out) {
				break;
			}
		}
	}
	
	public void save(int month, int dayNum) {
		System.out.println(month+"월 "+dayNum+"일 스케줄 등록을 시작합니다.\n이 날의 스케줄을 입력해주세요 ");
		day = new Day();
		String work = sc.next();
		day.setWork(work);
		year[month-1][dayNum-1] = day;
	}
	
	public void view() {
		int cnt = 0;
		for (int i = 0 ; i < 12; i ++) {
			for (int j = 0 ; j < 31 ;  j ++) {
				if (year[i][j] != null) {
					int monthInt = i+1;
					int dayInt = j+1;
					System.out.println(monthInt+"월 "+dayInt+"일 스케줄은 다음과 같습니다. ");
					System.out.println(year[i][j].getWork());
					System.out.println("------------------------------------------\n");
					cnt++;
				}
			}
		}
		if ( cnt == 0) {
			System.out.println("검색 결과 등록된 스케줄이 없습니다. ");
		}
	}
	
	public void finish() {
		System.out.println("종료합니다. ");
		sc.close();
		System.exit(0);
	}
	
	public void run() {
		int menu;
		do {
			System.out.println("\t\t- Menu - \n1. 스케줄 등록 \t2. 스케줄 조회 \t0을 입력하시면 종료됩니다 ");
			menu= sc.nextInt();
			switch(menu) {
			case 1: input(); break;
			case 2: view();  break;
			case 0: finish(); break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요 ");
			}
		} while(menu != 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule m = new MonthSchedule();
		m.run();
	}
}
