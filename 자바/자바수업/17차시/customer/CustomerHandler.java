package day17.t1;

import java.util.ArrayList;

public class CustomerHandler {
	
	ArrayList<Customer> list = new ArrayList<>();
	
	void run() {
		// 실행코드
		System.out.println("hi");
		register();
		register();
		
		search();
		updateInfo();
		
		//변경후 조회
		
		search();
		
	}

	public void search() {		 
		System.out.println(" 회원을 조회합니다");		
		for( int i=0 ; i< list.size() ;i++) {			
			Customer  customer=list.get(i);
			System.out.println( customer);
		}
	}

	public void register() {
		//회원을 등록합니다
		System.out.println(" 회원을 등록합니다");
		String name="윤정";
		String phone="010-111-222";
		String address="서울시";		
		Customer c = new Customer( name, phone, address);
		list.add(c);
	}

	
	public Customer searchItem(String name) {
		Customer user=null;
		for( int i=0; i< list.size();i++) {
			Customer tmp= list.get(i);
			if(tmp.getName().equals(name)) {
				 user=tmp;
			}
		}
		return user;
	}
	
	public void updateInfo() {		
		//회원정보를 수정합니다.		
		String name="윤정";  //고객의 이름
		String newPhone ="010-2222-4444";  // 고객의 새로운 비밀번호		
		
		//회원정보 찾아오기
		Customer c = searchItem(name);
		
		//회원정보 변경하기
		if( c!= null) 
			c.setPhone(newPhone);
		 else
			 System.out.println("회원을 찾을 수 없다."); 
		
	}
	
	
	public static void main(String[] args) {	 
		CustomerHandler m  = new CustomerHandler();
		m.run();

	}

}
