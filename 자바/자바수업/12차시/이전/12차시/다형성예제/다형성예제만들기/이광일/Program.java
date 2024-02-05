package 과제;

public class Program {

	public static void main(String[] args) {
		Buldak bd = new Buldak();
		System.out.println("불닭볶음면 조리");
		System.out.println("---------------------");
		bd.물();
		bd.면();
		bd.물버리기();
		bd.볶기();
		bd.먹기();

		System.out.println();
		System.out.println("너구리 조리");
		System.out.println("---------------------");
		Nuguri n = new Nuguri();
		n.물();
		n.다시마();
		n.스프();
		n.면();
		n.먹기();

		System.out.println();
		System.out.println("진라면 조리");
		System.out.println("---------------------");
		Jin j = new Jin();
		j.물();
		j.스프();
		j.면();
		j.먹기();

		print(n);
	}

	public static void print(Ramen ra) {
		System.out.println("--------매개변수 다형성--------");
		if (ra instanceof Buldak) {
			System.out.println("불닭볶음면 조리");
		} else if (ra instanceof Nuguri) {
			System.out.println("너구리 조리");
		} else if (ra instanceof Jin) {
			System.out.println("진라면 조리");
		}

		System.out.println("---------------------");
		ra.물();
		if (ra instanceof Nuguri) {
			((Nuguri) ra).다시마();
		}
		if (!(ra instanceof Buldak))
			((Jin) ra).스프();
		ra.면();
		if (ra instanceof Buldak) {
			((Buldak) ra).물버리기();
			((Buldak) ra).볶기();
		}
		ra.먹기();
	}

}
