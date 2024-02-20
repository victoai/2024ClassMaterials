package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	ServerSocket serverSocket;   //서버용 소켓
	Socket clientSocket;	    // 클라이언트와 통신할 소켓 

	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;	
	
	
	 public Server1() { // 5000~9000 사이  사용
		  
		 
		 try {
			serverSocket = new ServerSocket(6700);
			clientSocket =serverSocket.accept();
			
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream= new DataOutputStream(clientSocket.getOutputStream());
			
			
			//받기
			 dataRecv();
			//보내기
			 dataSend();
			
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
		 new Server1();

	}

}
