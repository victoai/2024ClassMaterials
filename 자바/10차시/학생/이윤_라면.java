package algoPrj.day10.classType;

public class 라면데이터 {

	
		private String 면;
		private String 스프;
		private int 달걀;
		private int 물;
		private int 매출금액;

		public void input(String 면, String 스프, int 달걀, int 물){
			   this.면=면;
			   this.스프=스프;
			   this.달걀=달걀;
			   this.물=물;
	}
		public void printInfo() {
			   System.out.println(면); 
			   System.out.println(스프);
			   System.out.println(달걀);
			   System.out.println(물);
			   System.out.println(매출금액);

}
}
