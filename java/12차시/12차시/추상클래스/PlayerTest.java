package 추상클래스;

public class PlayerTest {

	public static void main(String[] args) {
		
		
		초보자  초보player = new 초보자( "홍길동","기초");
		초보player.jump();
		초보player.run();		
		System.out.println(  초보player);
		 
		
		중급자  중급player = new 중급자( "김길동","중급");
		중급player.jump();
		중급player.run();		
		System.out.println(  중급player);
		
		
		고급자  고급player = new 고급자( "다길동","고급");
		고급player.jump();
		고급player.run();		
		System.out.println(  고급player);
		
		
		
		Player[] players  = new Player[3];
		players[0]= 초보player;
		players[1]= 중급player;
		players[2] =고급player;
		
		//모든 player를 달라게 한다
		
		System.out.println("모든  player에게 run() 매서드를 호출한다.. 각 각의 결과를 확인하자");
		System.out.println("p.run() 이라는 같은 메시지 (매서드 호출방법)에 대해서 다른결과가 출력되었다.  이것을 다형성이라고한다.  Polymorphism");
		
		for( Player p: players){
			 p.run();
		}
		
		
	
		
		

	}

}
