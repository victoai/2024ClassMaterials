package 상속_장의수;

public class FireFighter extends Person{
	
public FireFighter() {
	
}
public FireFighter(String name) {
	super(name);
}
	public void remove_fire() {
		System.out.println(name+"은(는) 불을 껐다!");
	}
}
