package java_day9_classType;

public class 라디오 {

	int 채널;
	int 볼륨;
	int 주파수;
	
	
	public void input(int 채널, int 볼륨, int 주파수) {

		this.채널 =채널;
		this.볼륨 =볼륨;
		this.주파수  = 주파수;
		
	
		
		
		}

	public void print() {
		System.out.println("현재채널"+채널);
		System.out.println("현재볼륨"+볼륨);
		System.out.println("현재주파수"+주파수);
		
	}
}

