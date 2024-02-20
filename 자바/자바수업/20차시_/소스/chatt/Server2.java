package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
	
	ServerSocket serverSocket;  //서버소켓
	Socket clientSocket;     // 소켓 
	
	DataInputStream dataInputStream;   // 보조스트림  in
	DataOutputStream dataOutputStream;	  // 보조스트림 out
	  
	
	public Server2() {
		//  5000~9999  
		try {
			serverSocket  = new ServerSocket(6100);   // 포트번호
			System.out.println(" server create ");			
			clientSocket = serverSocket.accept();  //대기상태 Listen상태 , 요청이오면 client통신할 수 있는 소켓을 생성합니다
		    System.out.println("연결 성공");
		    
			dataInputStream = new DataInputStream( clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream ( clientSocket.getOutputStream());			
		    
			String clientIp = clientSocket.getInetAddress().toString();
			System.out.println( clientIp );
			// 받기				
			receiveMsg();
			// 보내기
			sendMsg();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  
	
	 private void receiveMsg() {	
	
		 
		  Thread t = new Thread( new Runnable() {

			@Override
			public void run() {
				 
				 try {
					 while(true) {
						String msg=  dataInputStream.readUTF();
						System.out.println(msg);
					 }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}});
		  
		  t.start();
	 }
	 
	 private void sendMsg() {
		 
		 Scanner sc = new Scanner(System.in);
				 
	      Thread t = new Thread( new Runnable() {

			@Override
			public void run() {
				 try {
					 while(true) {
						 System.out.println("서버 :" );		
						 String msg = sc.nextLine();
						dataOutputStream.writeUTF(msg);
					 } 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}});
	      t.start();
	      
	 }
	
	
	public static void main( String[] args) {
	   new Server2();
		
	}
		
	 

}
