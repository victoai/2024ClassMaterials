package java2prj1.day0926.lamda.실습;

public class RunnableEx {
	public static void main(String[] args) {
		Runnable r = () -> {
			String[] bucket = new String[3];
			bucket[0] = "경기권 자가 매입";
			bucket[1] = "취업";
			bucket[2] = "해외여행";
			
			for(String s : bucket) {
				System.out.println(s);
			}
		};
		
		r.run();
		
	}
}
