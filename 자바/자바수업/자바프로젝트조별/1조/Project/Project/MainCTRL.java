package Project;
import java.util.Scanner;
public class MainCTRL {

	public static void main(String[] args) {

		MembershipMgr mm = new MembershipMgr();
		mm.init();
	
		CustomerMgr cm = new CustomerMgr();
		cm.init(mm);
		
		Admin adm = new Admin();
	
		int customerNum =0;
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 고객");
			System.out.println("2. 관리자");
			System.out.println("0. 종료");
			int num = sc.nextInt();
			loop: switch(num) {
			case 1:
				 while(true){
					System.out.println("1. 로그인");
					System.out.println("2. 회원가입");
					System.out.println("0. 뒤로가기");
					int cnum = sc.nextInt();
					loop1: switch(cnum) {
					case 1: 
						customerNum=cm.login();
						if(customerNum<0) {
							break loop1;
						}
						loop2: while(true) {
							System.out.println();
							System.out.println("1. 정보수정");
							System.out.println("2. 회원탈퇴");
							System.out.println("3. 주문하기");
							System.out.println("0. 로그아웃");
							int snum = sc.nextInt();
							switch(snum) {
							case 1:
								cm.update();
								break;
							case 2:
								cm.delete(customerNum);
								break;
							case 3:
								cm.orderProduct(customerNum);
								break;
							case 0:
								break loop2;
							default:
								System.out.println("잘못된 입력입니다.");
							}
						}
						break;
					case 2:
						cm.inputData(mm); 
						break;
					case 3:
						adm.printProduct();
						break;
					case 4:
						System.out.println("구매");
						break;
					case 5:
						System.out.println("구매 내역");
						break;
					case 0:
						break loop;
					default:
						System.out.println("잘못된 입력입니다. ");
					}
			
				}
			case 2:
				while(true){
					System.out.println("1. 고객 조회");
					System.out.println("2. 등급별 고객 조회");
					System.out.println("3. 금액 순 고객 조회");
					System.out.println("4. 상품 조회 및 관리");
					System.out.println("0. 뒤로가기");
					int cnum = sc.nextInt();
					switch(cnum) {
					case 1: 
						cm.search();
						break;
					case 2:
						cm.showMember(mm);
						break;
					case 3:
						cm.maxCost();
						break;
					case 4:
						adm.admin_menu();
						break;
					case 0:
						break loop;
					default:
						System.out.println("잘못된 입력입니다. ");
					}
				}
			case 0:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. ");
			}
		}
	}

}
