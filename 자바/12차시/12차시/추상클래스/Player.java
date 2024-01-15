package 추상클래스;


//하나라도 추상매서드를 가지면 추상클래스가 됩니다.
public abstract class Player {
	
	 private String name;  // player 이름
	 private String level;
	
	
	public abstract  void run();
	public abstract void jump();
	public abstract void turn();
	 
	
	 
	
	public Player () {
		// TODO Auto-generated constructor stub
	}
	
	
	public Player ( String name, String level) {
		this.name =name;
		this.level = level;
	}
	
	
	public String toString(){
		 return name + "  " + level;
	}

}
