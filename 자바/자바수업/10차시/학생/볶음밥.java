package day10classfile;

public class 볶음밥 {
	int 밥;
	int 식용유;
	int 당근 ;
	int 파;
	int 고기;
	int 소금;
	int 후추;
	
	public void input(int 밥,int 식용유,int 당근,int 파 ,int 고기, int 소금, int 후추) {
		this.밥=밥;
		this.식용유=식용유;
		this.당근=당근;
		this.파=파;
		this.고기=고기;
		this.소금=소금;
		this.후추=후추;
	}
	public void printInt() {
		System.out.print("밥"+밥 + "g ");
		System.out.print("식용유"+식용유 + "g ");
		System.out.print("당근"+당근 + "g ");
		System.out.print("파"+파 + "g ");
		System.out.print("고기"+고기 + "g ");
		System.out.print("소금" +소금+ "g ");
		System.out.print("후추"+후추 + "g ");
	}
	
}


