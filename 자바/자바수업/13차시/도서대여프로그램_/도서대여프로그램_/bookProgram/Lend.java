package syntax.book;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lend {

	
	 String  lendId ;
	 String lendDate ;
	 String  returnDate;
	 Book book;
	 boolean returnFlag;	  
	 static Scanner  sc =new Scanner(System.in);
	 
	 
	public Lend(String lendId, String lendDate, String returnDate, Book book) {
		super();
		this.lendId = lendId;
		this.lendDate = lendDate;
		this.returnDate = returnDate;
		this.book  = book;		 
		 
	}


	@Override
	public String toString() {
		return "Lend [lendId=" + lendId + ", lendDate=" + lendDate + ", returnDate=" + returnDate + ", book=" + book
				+ ", returnFlag=" + returnFlag + "]";
	}


	public void setReturnFlag(boolean returnFlag) {
		this.returnFlag = returnFlag;
	}
	
	


 
 
	
	
	
	 
 
}
