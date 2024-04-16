package day4.계산기;

public class B implements Calculator {

	@Override
	public int add(int su1, int su2) {
		System.out.println(" B calculator");
		return su1+ su2;
	}

}
