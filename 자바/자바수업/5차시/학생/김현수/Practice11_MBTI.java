// 입력4개를 받아서 MBTI를 출력해주는 프로그램을 만드세요.

package day04;

import java.util.Scanner;

public class Practice11_MBTI {

	public static void main(String[] args) {
		String 에너지방향;
		String 인식방식;
		String 판단방식;
		String 대처방식;
		String mbti;

		Scanner sc = new Scanner(System.in);
		System.out.println("에너지 방향을 선택하세요. 1.단체,개방, 2.개인,내면");
		에너지방향 = sc.next();
		System.out.println("인식방식을 선택하세요. 1.현실,경험,정확, 2.미래,가능성,신속");
		인식방식 = sc.next();
		System.out.println("판단방식을 선택하세요. 1.원칙,논리 2.관계,협초");
		판단방식 = sc.next();
		System.out.println("대처방식을 선택하세요. 1.계획,목적성 2.자율,융통성");
		대처방식 = sc.next();

		mbti = 에너지방향 + 인식방식 + 판단방식 + 대처방식;

		switch (mbti) {
		case "1111":
			System.out.println("당신은 ESTJ입니다.");
			break;
		case "1112":
			System.out.println("당신은 ESTP입니다.");
			break;
		case "1121":
			System.out.println("당신은 ESFJ입니다.");
			break;
		case "1122":
			System.out.println("당신은 ESFP입니다.");
			break;
		case "1211":
			System.out.println("당신은 ENTJ입니다.");
			break;
		case "1212":
			System.out.println("당신은 ENTP입니다.");
			break;
		case "1221":
			System.out.println("당신은 ENFJ입니다.");
		case "1222":
			System.out.println("당신은 ENFP입니다.");
		case "2111":
			System.out.println("당신은 ISTJ입니다.");
			break;
		case "2112":
			System.out.println("당신은 ISTP입니다.");
			break;
		case "2121":
			System.out.println("당신은 ISFJ입니다.");
			break;
		case "2122":
			System.out.println("당신은 ISFP입니다.");
			break;
		case "2211":
			System.out.println("당신은 INTJ입니다.");
			break;
		case "2212":
			System.out.println("당신은 INTP입니다.");
			break;
		case "2221":
			System.out.println("당신은 INFJ입니다.");
			break;
		case "2222":
			System.out.println("당신은 INFP입니다.");
			break;
		}

	}

}
