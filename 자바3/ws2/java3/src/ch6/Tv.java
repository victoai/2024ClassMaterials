package ch6;


public class Tv {

	String color;
	boolean power;
	int channel;
	
	
	// 매세드
	
	void power() {
		 power =  !power;
		 
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {		
		--channel;
		
	}
	
	@Override
	public String toString () {		
		return color + " " + power +  " " + channel  ; 
	}
	
	
	public static void main(String[] args) {
		
		//   TV형 
		Tv   t = new Tv();
		t.power();
		t.channelUp();
		t.channelUp();
		t.channelUp();
		
		System.out.println(  t);
		
		
	}
	
}
