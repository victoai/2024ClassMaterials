package 복습및정리.객체지향.상속;

public class Customer2 {
	 
	
 
	String id;
	int pw;
	public Customer2(String id, int pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {		 
		boolean result =false;
		Customer2 anOtherObj =(Customer2) obj;
		if( this.id.equals(anOtherObj.id)) result=true;
		return  result ;
	}

}
