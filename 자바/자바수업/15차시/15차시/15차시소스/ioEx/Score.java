package javaprj.day0207.ioEx;

import java.io.Serializable;

public class Score implements Serializable {
	
	
	String name;
	int kor;
	
	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	public Score(String name, int kor) {
		super();
		this.name = name;
		this.kor = kor;
	}

	
	
	
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + "]";
	}
	
	
	
	
	 
	

}
