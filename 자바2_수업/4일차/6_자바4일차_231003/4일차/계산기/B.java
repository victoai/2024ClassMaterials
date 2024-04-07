package java2.day4.변경이유리한코드.계산기;

public class B implements Calculator {

	@Override
	public int add(int su1, int su2) {
		System.out.println(" B calculator");
		return su1+ su2;
	}

}
