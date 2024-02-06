package week04.day2.objectEx;

public class Customer {

	String id;
	String pw;
	
	public Customer() {}
	
	public Customer(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getInfo() {
		return id +"/ " +  pw;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id +"/ " +  pw;
	}
	
	@Override
	public boolean equals(Object obj) { 		
		
		if( obj instanceof Customer) { //type check 후 다운캐스팅
		 //Customer가 같은 경우 내용이 같은지 판단
			Customer c = (Customer)obj;
		  if( this.id.equals(c.id)  && this.pw.equals(c.pw)) 
			 return true;
		  else
			 return false;
		}
		// Customer가 아닌것과 비교할 때는 false 반환
		return false;
		 
	}
	
	
	
}
