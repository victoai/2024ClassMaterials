package 병진_스마트스토어;

import java.util.Scanner;

public class Order {
	private Scanner sc = new Scanner(System.in);
	private String id;
	private String itemNum;
	private String name;
	private String address;
	
	//ㅡㅡㅡㅡㅡㅡㅡ **설정할 부분** ㅡㅡㅡㅡㅡㅡㅡㅡ
	private int NUM = 5; //최대 상품수
	private int MAX_ORDER = 10; //최대 주문수
	//주문번호 시작값(주문 들어올떄마다 번호증가)
	private long orderNum = 202307280301L; 
	private String date = "2023년 7월 31일";
	
	//상품 저장
	String[] List = new String[] {
			"트랜스포머", 
			"노트북", 
			"김치냉장고", 
			"아이패드", 
			"버즈2",
			"CGV티켓",
	};
	
	//코드 저장
	String[] CodeList = new String[] {
			"D-201", 
			"D-202", 
			"D-301", 
			"D-302", 
			"D-401",
			"D-402",
	};
	int[] shuffle = new int[NUM]; 
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	private int todayOrder = 0; //오늘의 주문수
	Item[] item = new Item[NUM]; //등록된 상품목록
	Order[] orderList = new Order[MAX_ORDER]; //주문서 저장
	
	public int buyItem(String userId) {
		int buyIndex;
		System.out.print("구매할 상품번호 : ");
		buyIndex = sc.nextInt();
		System.out.println("구매할 상품 : "+item[buyIndex-1].itemName);
		System.out.print("주문자 이름 : ");
		String name = sc.next();
		
		System.out.print("주소입력 : ");
		String address = sc.next();
		
		Order newOrder = new Order();
		newOrder.id = userId;
		newOrder.name = name;
		newOrder.address = address;
		newOrder.itemNum = item[buyIndex-1].itemNum;
		newOrder.orderNum += todayOrder;
		orderList[todayOrder] = newOrder;
		System.out.println("\n ㅡㅡ 주문서 확인 ㅡㅡ");
		System.out.println("| 주문번호 : " + orderList[todayOrder].orderNum);
		System.out.println("| 주문자아이디 : " + orderList[todayOrder].id);
		System.out.println("| 주문날짜 : " + orderList[todayOrder].date);
		System.out.println("| 주문자이름 : " + orderList[todayOrder].name);
		System.out.println("| 주문상품번호 : " + orderList[todayOrder].itemNum);
		System.out.println("| 배송주소 : " + orderList[todayOrder].address);
		todayOrder++;
		return todayOrder;
	}

	public void deleteIndex() {
		int deleteIndex;
		System.out.print("몇번칸을 삭제할까요? ");
		deleteIndex = sc.nextInt();
		
		Item newItem = new Item();
		item[deleteIndex-1] = newItem;
		
		printItem(); //상품 목록 출력 
	}

	public void Init() {
		int tmp;

		//배열을 랜덤으로 섞어주는 변수
		for(int i = 0; i<NUM; i++) {
			shuffle[i] = i;
			
		}
		for(int i = 0; i<NUM; i++) {
			int r  =  (int) (Math.random()*NUM);
			tmp = shuffle[i];
			shuffle[i] = shuffle[r];
			shuffle[r] = tmp;
		}
		
		System.out.println("ㅡㅡㅡㅡ상품 목록ㅡㅡㅡㅡ");
		for(int i = 0; i<NUM; i++) {
			item[i] = new Item();
			item[i].itemName = List[shuffle[i]];
			item[i].itemNum = CodeList[shuffle[i]];
			System.out.println((i+1) + "."+item[i].itemName);
		}
		//주문목록 초기화
		for(int i = 0; i<MAX_ORDER; i++) {
			orderList[i] = new Order();
		}
	}

	//상품등록
	public void insertItem() {
		int newIndex;
		System.out.print("몇번칸에 등록할까요? ");
		newIndex = sc.nextInt();
		
		System.out.print("등록할 상품이름 : ");
		String name = sc.next();
		
		System.out.print("상품 코드 번호 : ");
		String itemNum = sc.next();
		
		Item newItem = new Item();
		newItem.itemName = name;
		newItem.itemNum = itemNum;
		item[newIndex-1] = newItem;
		
		printItem(); //상품 목록 출력 
	}

	public void printItem() {
		System.out.println("ㅡㅡㅡㅡ상품 목록ㅡㅡㅡㅡ");
		for(int i=0; i<item.length; i++) {
			System.out.println((i+1)+"."+item[i].itemName);
		}
	}
}