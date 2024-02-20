package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {
	ServerSocket serverSocket;   //서버용 소켓
	Socket clientSocket;	    // 클라이언트와 통신할 소켓 

	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;	
	
	
	 public Server3() { // 5000~9000 사이  사용
		  
		 
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
		
		 
		 Thread t = new Thread(new Runnable() {
		        @Override
		        public void run() {
		            try {
		                while (true) {
		                    String msg = dataInputStream.readUTF();
		                    System.out.println(msg);

		                 
		                    if (msg.equals("나가기")) {
		                        System.out.println("Received exit message. Closing the client.");
		                        // Close the socket and exit the application
		                        clientSocket.close();
		                       
		                    }
		                }
		            } catch (IOException e) {
		               // e.printStackTrace();
		            	
		            	System.out.println("나가기");
		            	System.exit(0);
		            }
		        }
		    });

		    t.start();
		
	}






	private void dataSend() {
		
		Scanner sc = new Scanner( System.in);
		
	
		Thread t  = new Thread( new Runnable() {

			@Override
			public void run() {
				try {
					while(true) {
					String sendMsg  = sc.nextLine();
					dataOutputStream.writeUTF(sendMsg);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}});
		 
		
		t.start();
	}






	public static void main(String[] args) {
		 new Server3();

	}

}
