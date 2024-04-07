package java2prj1.day3.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CustomerTest {
	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("0001", "김재열", "vvip", 10000));
		list.add(new Customer("0002", "이재열", "vip", 20000));
		list.add(new Customer("0003", "박재열", "bronze", 30000));
		list.add(new Customer("0004", "나재열", "vvip", 40000));
		list.add(new Customer("0005", "독고재열", "bronze", 90000));
		list.add(new Customer("0006", "선우재열", "vvip", 80000));
		list.add(new Customer("0007", "방재열", "vip", 70000));
		list.add(new Customer("0008", "지재열", "vip", 50000));
		list.add(new Customer("0009", "축재열", "bronze", 60000));
		list.add(new Customer("0010", "마재열", "vvip", 100000));

		// 1.
		Stream<Customer> stream = list.stream();
		long count1 = stream.filter(list1 -> list1.getGrade().equals("vvip")).count();
		System.out.println(count1);

		long count = list.stream().filter(list1 -> list1.getGrade().equals("vvip")).count();
		System.out.println(count);

		// 2
		System.out.println("2번 문제");
		Stream<Customer> stream2 = list.stream();
		stream2.filter(list2 -> list2.getGrade().equals("vip")).forEach(name -> System.out.println(name.getName()+" "));

		// 3
		System.out.println("3번 문제");
		Stream<Customer> stream3 = list.stream();
		stream3.sorted((o1, o2) -> o2.getPoint() - o1.getPoint()).forEach(item -> System.out.println(item.getName()+" "));

	}
}
