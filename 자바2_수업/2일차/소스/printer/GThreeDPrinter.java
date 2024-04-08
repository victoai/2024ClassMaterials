package day1.generic.printer;


// 제네릭 클래스 만들기  ,  <> : 다이아몬드연산자
public class GThreeDPrinter<T> {
	
	private  T material; 

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public void print() {
		 System.out.println( "3D print" + material);
	} 

}
