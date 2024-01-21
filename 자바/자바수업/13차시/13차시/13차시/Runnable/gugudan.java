package week04.day3.Runnable;

public class gugudan implements MyRunnable {

	public static void main(String[] args) {
		gugudan g = new gugudan();  //객체생성 후 
		g.run();
		
	}

	@Override
	public void run() {	
		for(int i=1; i<=9; i++){
			System.out.print("["+i+"단]\t"); // \t 칸 간격 벌림
		}
		System.out.println();
		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}System.out.println();
		}
	
	}

}
