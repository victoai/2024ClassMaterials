package prjDay12;

public class GameEx {

		public static void main(String[] args) {
			
			Game[]  list = new Game[3];  // 참조형변수 5개
			list[0]= new Game( "월드 오브 워 크래프트", "MMORPG",19800);
			list[1]= new Game( "파이널 판타지 14","MMORPG",14800);
			list[2]= new Game( "TEKKEN  7 " ,"Action",56000);
			Game g1 = new Game();
			
//			g1.setName("월드 오브 워 크래프트");
//			g1.setType("MMORPG");
//			g1.setPrice(19800);
//			
//			
//			Game g2 = new Game("파이널 판타지 14" , "MMORPG" , 14800);
//			Game g3 = new Game("TEKKEN  7 " , "Action" , 56000);
			
			for( int i=0;  i< list.length; i++) {
				System.out.println( list[i]);
			}
		}
}
