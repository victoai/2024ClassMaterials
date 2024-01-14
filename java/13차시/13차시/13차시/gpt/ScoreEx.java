package gpt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScoreEx {
	
	  ScoreManager scoreManager = new ScoreManager();
	  Scanner scanner = new Scanner(System.in);
	  
	  
	  
	public void run(){
		 while (true) {
	            System.out.println("<< 성적 관리 프로그램 >>");
	            System.out.println("1.   추가  , 2. 성적 삭제,  3. 성적 조회  4. 성적 변경  0. 프로그램 종료");
	            System.out.print("메뉴: ");
	            String menu_ = scanner.nextLine();
	            int menu = Integer.parseInt(menu_);

	            switch (menu) {
	                case 1:
	                    System.out.print("이름을 입력하세요: ");
	                    String name = scanner.nextLine();
	                    System.out.print("점수를 입력하세요: ");
	                    String score_ = scanner.nextLine();
	                    int score= Integer.parseInt(score_);
	                    scoreManager.register(name, score);
	                    break;
	                case 2:
	                    System.out.print("삭제할 학생의 이름을 입력하세요: ");
	                    String removeName = scanner.next();
	                    boolean removeResult = scoreManager.removeScore(removeName);
	                    if (removeResult) {
	                        System.out.println("성적 정보가 삭제되었습니다.");
	                    } else {
	                        System.out.println("해당하는 이름의 학생을 찾을 수 없습니다.");
	                    }
	                    break;
	                case 3:
	                    scoreManager.showAllScores();
	                    break;
	                case 4:
	                    System.out.print("성적을 변경할 학생의 이름을 입력하세요: ");
	                    String updateName = scanner.next();
	                    System.out.print("새로운 점수를 입력하세요: ");
	                    int newScore = scanner.nextInt();
	                    boolean updateResult = scoreManager.updateScore(updateName, newScore);
	                    if (updateResult) {
	                        System.out.println("성적 정보가 변경되었습니다.");
	                    } else {
	                        System.out.println("해당하는 이름의 학생을 찾을 수 없습니다.");
	                    }
	                    break;
	                case 0:
	                    System.out.println("프로그램을 종료합니다.");
	                    scanner.close(); // Scanner 종료
	                    System.exit(0); // 프로그램 종료
	                default:
	                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");	             
	            	}
		 }
	}
	 
    public static void main(String[] args) {
       new ScoreEx().run();
       
      
    }
}

 