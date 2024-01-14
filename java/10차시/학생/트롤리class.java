package day10.classType;

public class 트롤리class {

	private int 포도당시럽;
	private int 설탕;
	private int 정제수;
	private int 젤라틴;
	
	public void input(int 포도당시럽, int 설탕, int 정제수, int 젤라틴) {
		this.포도당시럽 = 포도당시럽;
		this.설탕 = 설탕;
		this.정제수 = 정제수;
		this.젤라틴 = 젤라틴;
	}
	public void printInfo() {
		System.out.println(포도당시럽);
		System.out.println(설탕);
		System.out.println(정제수);
		System.out.println(젤라틴);
	}
	
}
