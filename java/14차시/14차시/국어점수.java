package day14.실습;

import java.io.FileWriter;
import java.io.IOException;

public class 국어점수 {

	public static void main(String[] args) {
		
		try {
			FileWriter w = new FileWriter("res/korScore.txt");
			
			int[] korScore = {100,90,80,70,60,50,40,30,20,10};
			
			for(int i=0; i<korScore.length;i++ ) {
				w.write(korScore[i]);
			}
			w.flush();

//			int sum=0;
//			for(int i=0;i<korScore.length;i++ ) {
//				sum+=korScore[i];
//			}
//			int avg=sum/10;
//			
//			System.out.println(sum);
//			System.out.println(avg);
//			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
