package Project;

import java.io.PrintWriter;
import java.util.Scanner;

public class project_taemin02 {
    public static void main(String[] args) {

        String[] bookArr = new String[3];
        int index=0;
        loop:while(true){

            System.out.println("메뉴를 선택하세요>\n1.희망도서 신청 2.희망도서 조회 3.희망도서 취소 4.종료");
            Scanner select = new Scanner(System.in);
            String menuNum = select.nextLine();
            int menu = Integer.parseInt(menuNum);

            switch (menu){
                case 1: 
                    String bookName;
                    String authorName;
                    String companyName;
                    System.out.println("희망도서 신청\n도서명, 작가명, 출판사명 을 입력하세요(최대 3권)");
                    bookName = select.nextLine();
                    authorName = select.nextLine();
                    companyName = select.nextLine();
                    bookArr[index] = bookName+"\n"+authorName+"\n"+companyName;
                    
                    try (PrintWriter writer = new PrintWriter("res/hopebook.txt")) {
                    	for(String str : bookArr) {
                    		writer.println(str);
                    	}
					} catch (Exception e) {
						e.printStackTrace();
					}
                    index++;
                    
                    break;
                case 2: 
                    System.out.println("희망도서 조회\n신청하신 도서를 조회합니다");
                    scanBook(bookArr, index);
                    break;
                case 3: 
                    System.out.println("희망도서 취소\n도서 신청을 취소합니다");
                    scanBook(bookArr, index);
                    System.out.println("삭제하고 싶은 도서를 선택하세요");
                    delBook(bookArr, index, select);
                    break;
                case 4: 
                    System.out.println("종료합니다");
                    break loop;
            }
        }
    }

    public static void scanBook(String[] bookArr, int index) {
        for (int i = 0; i < index; i++) {
            System.out.println((i+1)+":\n"+ bookArr[i]);
        }
    }
    
    public static void delBook(String[] bookArr, int index, Scanner select) {
		String delete = select.nextLine();
		int deleteIndex = Integer.parseInt(delete);
		for(int i = deleteIndex-1; i<index; i++) {
			bookArr[i] = bookArr[i+1];
		}
	}
}
