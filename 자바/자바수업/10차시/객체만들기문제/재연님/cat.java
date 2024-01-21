package week03.day2.재연님;

public class cat {
	private String name;
	private String species;
	private int age;
	private String gender;
	private String recentvisit;
	private String[] act = {"잠자기", "밥먹기", "점프하기", "세수하기", "사냥놀이하기", "걸어다니기"};
	//기능
	
	//입력받는다
	public void input(String name, String species , int age , String gender , String recentvisit ) {
		this.name =name;
		this.species = species;
		this.age =age;
		this.gender = gender;
		this.recentvisit = recentvisit;
		
	}
	//출력한다.
	
	public void printInfo() {
		System.out.println("================");
		System.out.println("이름:"+name);
		System.out.println("종:"+species);
		System.out.println("나이:"+age);
		System.out.println("성별:"+gender);
		System.out.println("최근 병원 방문 일자:"+recentvisit);
		System.out.println("================");
	}
	
	//고양이 행동 보여주기
	public void catact() {
		int random=(int)(Math.random() * 7);
		System.out.println("고양이가 무얼하고 있는지 긍금하시군요?");
		System.out.println("지금 " +name+"는(은) "+act[random]+"를(을) 하고있습니다!");
	}

}
