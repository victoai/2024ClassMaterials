package day7;

import java.awt.font.TextMeasurer;
import java.util.Scanner;

public class 박태민_문제풀이 {

	public static void main(String[] args) {
		
//		다음과 같은 기온정보가 주어진다
//
		int[]  tem = {27,27,28,29,30,33,32,33,32,31,31,33,33,31} ;
//
//		문제1. 배열의 모든 기온을 출력하시오
		for(int i = 0; i < tem.length; i++) {
			System.out.print(tem[i] + " ");
		}System.out.println();
		
//		문제2. 배열의 모든 기온을 거꾸로 출력하시오
		for(int i = 13; i >= 0 ; i--) {
			System.out.print(tem[i] + " ");
		}System.out.println();
		
//		문제3. 평균기온을 출력하시오
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < tem.length; i++) {
			sum += tem[i];
			avg = sum/tem.length;
		}System.out.println(avg); // 30.714285
		
//		문제4. 평균기온보다 높은 일수를 구하시오
		int avgover=0;
		for(int i = 0; i < tem.length; i++) {
			if(tem[i]>avg) avgover++;
			}
		System.out.println(avgover);
		
//		문제5. 가장 높은 기온 출력하시오
		int MAX = tem[0];
		for(int i = 0; i < tem.length; i++) {
			if(tem[i]>MAX) {MAX=tem[i];
				}
			}
		{System.out.println(MAX);}
		
//		문제6. 가장 낮은 기온 출력하시오
		int MIN = tem[0];
		for(int i = 0; i < tem.length; i++) {
			if(tem[i]<MIN) {MIN=tem[i];
				}
			}
		{System.out.println(MIN);}
		
		
//		배열문제
						  // 정수 n을 0이 아닌 정수 d로 나눴을 때 몫이 정수이고 나머지가 0인 경우
		// 배열은 20개로 준비한다.(약수의 개수를 미리 알지 못하니 넉넉히 20개로 선언)
		int arr[] = new int[20];
		
		// 어떤 수 입력 -> 어떤수에 대한 약수를 배열에 저장하고 한꺼번에 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int num = sc.nextInt();
		
		// (임의수는 30을 넘지 않는다)
		final int MAX2 = 30;
		if(num>MAX2) {
			System.out.println("30을 초과한 수를 입력하여 30으로 진행합니다.");
			num = MAX2;
		}
		
		// 1부터 입력된 수까지의 ++를 배열로
		int su[] = new int[num];
		int k = 0;
		for(k = 0; k < num; k++) {
			su[k] = k+1;
			if(num%su[k]==0) {			// 입력된 수를 위의 배열로 나눴을 때 0이 되는 값을 출력
				System.out.print(num/su[k] + " ");
			}
		}
		
	}

}
