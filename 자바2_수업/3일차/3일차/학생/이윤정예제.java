package java2prj1.day3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 이윤정예제 {

	public static void main(String[] args) {
		
		
		String[] arr = new String[] {"즐거운 명절", "추석", "보내세요"};
		int[] arry = new int[] {5, 4, 3, 15, 10};
		
		
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		
		//배열을 스트림으로
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.sorted().forEach(s-> System.out.println(s));
		System.out.println("");
		
		
		//숫자 배열을 스트림으로
		IntStream stream2 = Arrays.stream(arry);
		stream2.sorted().forEach(su -> System.out.print(su+ " "));
		
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("dy", "곽단야", "VVIP", 100));
		list.add(new Customer("mg", "김민규", "VIP", 150));
		list.add(new Customer("mj", "김민지", "BRONZE", 200));
		list.add(new Customer("bj", "김병진", "BRONZE", 250));
		list.add(new Customer("jy", "김재열", "VIP", 300));
		list.add(new Customer("hs", "김현수", "VVIP", 350));
		list.add(new Customer("nj", "문나정", "VIP", 280));
		list.add(new Customer("hs", "김현수", "VVIP", 350));
		list.add(new Customer("yj", "서예진", "BRONZE", 400));
		list.add(new Customer("y", "이윤", "VIP", 310));
		
		
		Stream<Customer> stream = list.stream();
		
		//1. 고객 등급이 VVIP인 사람 몇 명인지
		long result = stream.filter( Customer -> Customer.getGrade().equals("VVIP")).count();
		System.out.println(result+"\n");
		
		//2. 고객 등급이 VIP인 사람들 출력
		stream = list.stream();
		stream.filter(c -> c.getGrade().equals("VIP")).forEach(c -> System.out.println(c));
		
		
		System.out.println("");
		
		//3. 포인트가 높은 사람 순서대로 정렬
		stream = list.stream();
		System.out.println("포인트 높은 사람 순서대로 정렬\n");
		stream.sorted( (o1, o2) -> o2.getPoint()-o1.getPoint()).forEach(p -> System.out.println(p.getName()));;
		
		
	}

}
