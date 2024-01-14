package day7;

public class Q_서예진_배열문제1 {

	public static void main(String[] args) {
		int[] temperatures= {27,27,28,29,30,33,32,33,32,31,31,33,33,31};
		
		System.out.println("===문제1===");
		System.out.println("Q.배열의 모든 기온을 출력하시오.");
		for(int i=0;i<temperatures.length;i++) {
			System.out.print("A."+temperatures[i]+" ");
			
		}
		
		System.out.println("\n"+"===문제2===");
		System.out.println("Q.배열의 모든 기온을 거꾸로 출력하시오");
		for(int i=temperatures.length-1;i>=0;i--) {
			System.out.print("A."+temperatures[i]+" ");
		}
		
		
		System.out.println("\n"+"===문제3===");
		System.out.println("Q.평균기온을 출력하시오");
		
		int sum=0;
		for(int i=0;i<temperatures.length;i++) {
			sum+=temperatures[i];
		}
		
		int avg=sum/temperatures.length;
		System.out.print("A."+ avg+"도");
		
		
		System.out.println("\n"+"===문제4===");
		System.out.println("Q.평균기온보다 높은 일수를 구하시오");
		
		int cnt=0;
		for(int i=0;i<temperatures.length;i++) {
			if(temperatures[i]>avg) {
				cnt++;
			}		
		}
		
		System.out.println("A."+cnt+"일");
		
		System.out.println("\n"+"===문제5===");
		System.out.println("Q.가장높은기온 출력하시오");
		
		int max=1;
		for(int i=0;i<temperatures.length;i++){
			if(max<temperatures[i]) {
				max=temperatures[i];
			}
		}
		System.out.println("A."+max);
		
		System.out.println("\n"+"===문제6===");
		System.out.println("Q.가장낮은기온 출력하시오");
		
		int min=100;
		for(int i=0;i<temperatures.length;i++){
			min=Math.min(min,temperatures[i]);
		}
		
		System.out.println("A."+min);
		
	}

}
