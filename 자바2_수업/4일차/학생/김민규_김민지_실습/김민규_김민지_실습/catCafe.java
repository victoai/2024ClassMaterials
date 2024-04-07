package 김민규_김민지_실습;

public class catCafe {

	String name;
	String gender;
	String species;
	
	public catCafe() {
	this("고양이이름", "성별","종");	
	}

	public catCafe(String name, String gender, String species) {
		super();
		this.name = name;
		this.gender = gender;
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	public void printInfo() {
		System.out.println("고양이이름="+ name);
		System.out.println("성별="+ gender);
		System.out.println("종="+ species);
	}
	@Override
	public String toString() {
		return "catCafe [name=" + name + ", gender=" + gender + ", species=" + species + "]";
	}
	
	
	
}
