package day4.계산기;

public class A implements Calculator {

	@Override
	public int add(int su1, int su2) {
		System.out.println(" A calculator");
		return su1+ su2;
	}

}
