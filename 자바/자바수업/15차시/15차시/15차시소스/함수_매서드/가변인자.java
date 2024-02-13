package 복습및정리.함수_매서드;

public class 가변인자 {
	
	void 가변인자매서드( int...ars) {
		
		for( int num : ars) {
			System.out.println( num);
		}
		
	}

	public static void main(String[] args) {
	 
		가변인자 o = new 가변인자();
		o.가변인자매서드(6,7,8);
		o.가변인자매서드(6,7);
	}

}
