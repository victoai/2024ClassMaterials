package Project;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CustomerMgr {
	Scanner sc = new Scanner(System.in);
	ArrayList<Customer> list = new ArrayList<>();
	ArrayList <YJOrder> Olist = new ArrayList<>(); 
	MembershipMgr mgr = new MembershipMgr();
	YJCart c2 = new YJCart();
	
	int index=0;
	
	public CustomerMgr() {}
	public void init(MembershipMgr mm) { // 고객 정보 초기화
		list.add(new Customer("aaa","aaa123","aaa의 주소","010-4032-2222",320000,2310,mm.FindMembership(320000)));
		list.add(new Customer("bbb","bbb123","bbb의 주소","010-4444-3333",70000,84,mm.FindMembership(70000)));
		list.add(new Customer("ccc","ccc123","ccc의 주소","010-4568-4698",770000,5560,mm.FindMembership(770000)));
		list.add(new Customer("ddd","ddd123 ","ddd의 주소" ,"010-2248-5635",1050000,35810,mm.FindMembership(1050000)));
		list.add(new Customer("eee","eee123 ","eee의 주소","010-1111-1111",1100000,46532,mm.FindMembership(1100000)));
		list.add(new Customer("fff","fff123 ","fff의 주소","010-2222-2222",800000,3156,mm.FindMembership(800000)));
		list.add(new Customer("ggg","ggg123 ","ggg의 주소","010-3333-3333",360000,51,mm.FindMembership(360000)));
		list.add(new Customer("hhh","hhh123 ","hhh의 주소","010-4444-4444",2500000,54,mm.FindMembership(2500000)));
		list.add(new Customer("iii","iii123 ","iii의 주소","010-5555-6666",70000,4,mm.FindMembership(70000)));
		list.add(new Customer("k1k1k1","k1k1k1123 ","k1k1k1의 주소","010-6666-7777",1100000,4546,mm.FindMembership(1100000)));
		
		
	}
	
	public void search() { // 조회
		System.out.println("회원을 조회합니다.");
		for (int i = 0; i < list.size(); i++) {
			Customer customer = list.get(i);
			System.out.println(customer);
		}
	}
	public void inputData (MembershipMgr mm) { // 등록
		System.out.println("-----회원가입-----");
		System.out.println("아이디를 입력해주세요 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		String pw = sc.nextLine();
		System.out.println("주소를 입력해주세요 : ");
		String address = sc.nextLine();
		System.out.println("휴대폰 번호를 입력해세요 : ");
		String phone = sc.nextLine();
		int totalCost= 0;
		int totalPoint = 0;
		Customer c = new Customer(id, pw, address, phone, totalCost, totalPoint,mm.FindMembership(totalCost));
		list.add(c);
		System.out.println("----회원가입 완료-------");
		System.out.println("당신의 ID는: " + id + " 주소는: " + address + " 폰번호는: " + phone + " 입니다");

	}
	public void delete(int n) { // 삭제
		System.out.println("----회원삭제-----");
		System.out.println("정말로 탈퇴하시겠습니까? 1을 입력하면 삭제됩니다.");
		int ans = sc.nextInt();
		if(ans==1){
			list.remove(n);}

	}
	public int login() {
		
			System.out.println("아이디 입력");
			String log_id = sc.next();
			System.out.println("비밀번호 입력");
			String log_pw = sc.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId().equals(log_id) && list.get(i).getPw().equals(log_pw)) {
					System.out.println("로그인 완료");
					index = i;
					break;
				}else if(!list.get(i).getId().equals(log_id)) {
					System.out.println("없는 아이디 입니다.");
					return -1;
				}else if(list.get(i).getId().equals(log_id) && !list.get(i).getPw().equals(log_pw)) {
					System.out.println("없는 비밀번호 입니다.");  
					return -1;
				}
			}
			
		
		return index;
		
	}
	public void update() { // 정보수정
		System.out.println("수정할 아이디를 입력");
		String id=sc.next();
		for(int i=0; i<list.size(); i++) {
			if (id.equals(list.get(i).getId())) {
				
				System.out.println("수정하실 항목을 선택하세요. (1)아이디 (2)비밀번호 (3)주소 (4)번호");
				int n=sc.nextInt();
				System.out.println();
				
				switch(n) {
				case 1:
					System.out.println("새로운 아이디를 입력하세요");
					String id2 = sc.next();
					list.get(i).setId(id2);
					break;
				case 2:
					System.out.println("새로운 비밀번호를 입력하세요");
					String pw = sc.next();
					list.get(i).setPw(pw);
					break;
				case 3:
					System.out.println("새로운 주소를 입력하세요");
					String address = sc.next();
					list.get(i).setAddress(address);
					break;
				case 4:
					System.out.println("새로운 번호를 입력하세요");
					String phone = sc.next();
					list.get(i).setPhone(phone);
					break;
				}
			}
		}
	}
	
  

    public void showMember(MembershipMgr mm) {
    	System.out.println("1. GOLD OLIVE");
    	System.out.println("2. BLACK OLIVE");
    	System.out.println("3. GREEN OLIVE");
    	System.out.println("4. PINK OLIVE");
    	System.out.println("5. BABY OLIVE");
    	int num = sc.nextInt();
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i).getMmsh().equals(mm.mlist.get(num-1))) {
        		System.out.println(list.get(i));
        	}
        }
    }

    
    public void maxCost() {
    	Collections.sort(list ,  new CustomerComparator());
    	for(int i=0; i<list.size(); i++) {
    		Customer c = list.get(i);
    		System.out.println(c);
    	}
    }
	//주문정보 등록
	public void addOrderItem(YJOrder order ) {
		
	 	Olist.add(order);
	}
	
//	주문정보 조회
	public void showOrders() {
		
		for(YJOrder o : Olist) {
			System.out.println(o);
		}
	}
	 
//	주문삭제
	public void removeOrders(int num ) {
		
//		System.out.println(num+"번째 상품을 삭제하겠습니다.");
		//Olist.remove(num-1);
	/*	
		for( Order o  : Olist) {  // 상품번호6인것을 찾은다음 삭제
			if( o.getGoods().getNum()== num) {
				Olist.remove(o);
			}
		}
		*/
		
		
		for( int i=0; i< Olist.size() ; i++) {			
			YJOrder o  =Olist.get(i);
			if( o.getGoods().getNum()== num) {
				Olist.remove(o);
			}
		} 
		 
	}
	public void orderProduct(int n) {
		System.out.println(list.get(n).getId());
		loop: while (true) {
			System.out.println("메뉴 : 1.상품조회 , 2.상품담기, 3.수량변경, 4.삭제, 5.주문조회 6.주문하기");
			int menu = sc.nextInt();
	
			switch (menu) {
			case 1:
				System.out.println("조회할 카테고리를 선택하세요");
				System.out.println("1. 색조, 2.기초 , 3.향수 , 4.기타");
				int choice = sc.nextInt();
				if (choice == 1) {
					c2.showMakeupItem();
				} else if (choice == 2) {
					c2.showSkinItemp();
				} else if (choice == 3) {
					c2.showPerfumeItem();
				} else {
					c2.showEtcItem();
				}
				break;
	
			case 2:
	
				int number;
				int cnt;
				System.out.println("구매하실 상품번호와 수량을 입력하세요");
				Scanner sc2 = new Scanner(System.in);
				number = sc2.nextInt();
				cnt = sc2.nextInt();
	
				YJGoods goods = c2.searchItem(number);
				System.out.println(goods);
	
				YJOrder order = new YJOrder(cnt, goods);
				addOrderItem(order);
			
				break;
	
			case 3:
	
				showOrders();
				System.out.println("변경하실 상품번호를 입력하세요.");
				int changeNumber = sc.nextInt();
				YJGoods changegoods = c2.searchItem(changeNumber);
				System.out.println(" 주문수량 변경하실 상품은" + changegoods.getName() + "입니다.");
				System.out.println(" 변경할 수량을 입력하세요");
				int newStock = sc.nextInt();
				for (YJOrder o : Olist) {
					if (o.getGoods().getNum() == changeNumber) {
						o.setCount(newStock);
					}
				}
				break;
				
			case 4:
				showOrders();
				System.out.println("삭제하실 상품번호를 입력하세요");
				Scanner sc3 = new Scanner(System.in);
				number = sc3.nextInt();
				YJGoods deletegoods = c2.searchItem(number);
				System.out.println("삭제하실 상품은 " + deletegoods + "입니다.");
				removeOrders(number);
				break;
	
			case 5:
				showOrders();
				break;
	
			case 6:
				showOrders();
				int totalPrice=0;
				int addPoint=0;
				for(int i=0; i<Olist.size(); i++) {
					totalPrice += Olist.get(i).getTotal();
				}
				System.out.println("총 금액은 : "+totalPrice);
				addPoint = (int) (totalPrice * list.get(n).getMmsh().getPoint()*0.01);
				list.get(n).setTotalCost(totalPrice);
				list.get(n).setTotalPoint(addPoint);
				int totalCost = list.get(n).gettotalCost();
				mgr.init();
			    Membership m = mgr.FindMembership(totalCost);
			    list.get(n).setMmsh(m);
				System.out.println("적립된 포인트는 :"+addPoint+"이며, 보유하신 포인트는 "+list.get(n).getPoint());
				System.out.println(list.get(n).getId()+"님이 현재까지 구매한 총금액은 "+list.get(n).gettotalCost()+
						"이며, 현재 등급은 "+ list.get(n).getMmsh().getGrade()+"입니다. ");

				for(int i=0; i<Olist.size(); i++) {
					Olist.remove(i);
				}
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
	
			}
	
		}
	
	
}
   
  

}