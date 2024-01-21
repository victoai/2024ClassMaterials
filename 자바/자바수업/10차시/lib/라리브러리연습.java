package day10;

public class 라리브러리연습 {
	int result;
	
	public void input(int a, int b, char c) {

		if(c=='+') {  // String으로 받을 경우 equals("")로 연산
			this.result = a+b;
		}else if(c == '-') {
			this.result= a-b;
		}else if(c == '*') {
			this.result = a*b;
		}else if(c == '/') {
			this.result = a/b;
		}else {
			System.out.println("오류");
		}
	}

	public void print() {
		System.out.print("결과는 " + result);

	}
}
