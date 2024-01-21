import java.util.ArrayList;
import java.util.Scanner;

public class 실습Program2 {
	
	public static void main(String[] args) {
		
		
		ArrayList<실습>list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			String id;
			String pw;
			String name;
			int amount;
			
			System.out.println("ID");id = sc.next();
			System.out.println("PW");pw = sc.next();
			System.out.println("NAME");name = sc.next();
			System.out.println("AMOUNT");amount = sc.nextInt();
			
			실습 실습 = new 실습(id, pw, name, amount);
			list.add(실습);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
