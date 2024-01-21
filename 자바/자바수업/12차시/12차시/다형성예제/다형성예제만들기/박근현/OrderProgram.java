package 과제;

public class OrderProgram {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		order1.menu();
		
		Order order[] = new Order[3];
		order[0] = new 김밥();
		order[1] = new 떡볶이();
		order[2] = new 라면();
		for(int i=0; i<order.length; i++) {
			System.out.println("=============================");
			order[i].ordermenu();
		}
		
		라면 order2 = new 라면();
		Order order3 = order2;

		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		라면 order5 = (라면)order3;
		order5.cancel();
	}
}