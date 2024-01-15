package week03.day2.소영님;

import java.util.Scanner;

public class 초등학교 {
 
	//멤버변수
	private int 학생;
	private int 교사;
	private int[] 학년= {1,2,3,4,5,6};
	private String 교과목;
	private String 수업;
	private String 교가;
	private int 학급;
	
	//생성자(반환값없어야함 즉 return,void-X)
	public  초등학교(int 학생,int 교사,String 교과목,String 수업,String 교가){ 
		this.학생 = 학생;
		this.교사 = 교사;
		this.교과목= 교과목;
		this.수업 = 수업;
		this.교가 = 교가;
		this.학급 = 학급;
	}
	
	public 초등학교() {
		
	}

	public void printInfo() { //메서드(출력)
		System.out.println("\n"+"<현재 에이콘 초등학교를 구성하고 있는 것들>");
		
		System.out.println("학생"+학생+"명");
		System.out.println("교사"+교사+"명");
		System.out.println("교과목"+교과목);
		System.out.println("수업"+수업);
		System.out.println("교가"+교가);
		System.out.println("학급"+학급+"반");
	}
	
	public void fill() { //메서드(정보)
		this.학생+=100;
		this.교사+=10;
		this.교과목=8+"과목"; //string=
		this.수업=6+"교시";
		this.교가 ="";
		this.학급 =5;
	}
	
	public void num() { //메서드(학년,배열출력)
		System.out.println("<현재 에이콘 초등학교의 학년구성>");
		for(int i=0; i<6; i++) {
			System.out.print(학년[i]+"학년"+"\n");	
		}
	}
	
	Scanner sc = new Scanner(System.in);
	public void info() {
		System.out.println("\n"+"<학생 수의 증감에 따른 변화>");
		System.out.print("현재 학생 수를 입력하세요 : "+"\n");
		학생= sc.nextInt();
		if(학생>100) {
			교사+=10;
			학급++;
			System.out.println("교사의 수가"+교사+"명으로 늘어납니다");
			System.out.println("학급이"+학급+"반이 됩니다");}

		else if(학생<100){
			교사-=5;
			학급--;	
			System.out.println("교사의 수가"+교사+"명으로 줄어듭니다");
			System.out.println("학급이"+학급+"반으로 줄어들 수 있습니다");
			}
	}	
	
}
