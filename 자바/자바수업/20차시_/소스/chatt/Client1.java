package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	 Socket socket;// 소켓
	
	 DataInputStream dataInputStream;       // 입력용보조스트림
	 DataOutputStream dataOutputStream;     // 출려용보조스트림
	 
	 
	
	public Client1() {	    
		
		
		// 
		
		try {
			socket = new Socket("localhost", 6700);

			dataInputStream = new DataInputStream( socket.getInputStream());
			dataOutputStream = new DataOutputStream ( socket.getOutputStream());	
			dataSend();
			dataRecv();
			

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	private void dataRecv() {
		try {
			String msg= dataInputStream.readUTF();
			System.out.println( msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}






	private void dataSend() {
		
		Scanner sc = new Scanner( System.in);
		
	
		try {
			String sendMsg  = sc.nextLine();
			dataOutputStream.writeUTF(sendMsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	}




	public static void main(String[] args) {		 
		new Client1();

	}

}
