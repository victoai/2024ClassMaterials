package java_day4.quiz;

public class Java_1합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int sum = 0;


        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

     

     
        System.out.println("10부터 1:");

        for (int i = 10; i >= 1; i--) {
            System.out.println(sum);
            sum -= i;
        }
    }
}