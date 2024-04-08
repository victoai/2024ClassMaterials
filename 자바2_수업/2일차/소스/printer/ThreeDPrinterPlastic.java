package day1.generic.printer;

public class ThreeDPrinterPlastic {
	
	private Plastic material;

	public void setMaterial(Plastic material) {
		this.material = material;
	} 
	
	public void print() {
		 System.out.println( "3D print use:" + material);
	 }
	 

}
