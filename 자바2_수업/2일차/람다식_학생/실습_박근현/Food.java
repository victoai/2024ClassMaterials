package project;

public class Food {
	
	String material;
	//String recipe;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(String material) {
		super();
		this.material = material;
		//this.recipe = recipe;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	/*public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}*/
	@Override
	public String toString() {
		return material;
	}
}