package algo.day7;
import java.util.Scanner;
public class WonArr {

	public static void main(String[] args) {

		int[] won = {50000, 10000, 5000,1000,500,100,50,10};
		int[] pay = new int[8];
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = num;
		for(int i=0; i<won.length; i++) {
			pay[i] = rem/won[i];
			rem = rem%won[i];
		}
		System.out.println("출장비: "+num);
		System.out.println("각 화폐 매수");
		for(int i=0; i<won.length; i++) {
			System.out.println(won[i]+" => "+pay[i]);
		}
		
		
	}

}
