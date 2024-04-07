package funInterface;

public class Recipe {

	String ing;
	String ing2;
	String ing3;
	public String getIng() {
		return ing;
	}
	public void setIng(String ing) {
		this.ing = ing;
	}
	public String getIng2() {
		return ing2;
	}
	public void setIng2(String ing2) {
		this.ing2 = ing2;
	}
	public String getIng3() {
		return ing3;
	}
	public void setIng3(String ing3) {
		this.ing3 = ing3;
	}
	@Override
	public String toString() {
		return "Recipe [ing=" + ing + ", ing2=" + ing2 + ", ing3=" + ing3 + "]";
	}
	
	public Recipe() {
		// TODO Auto-generated constructor stub
	}
	public Recipe(String ing, String ing2, String ing3) {
		super();
		this.ing = ing;
		this.ing2 = ing2;
		this.ing3 = ing3;
	}
	
	
}
