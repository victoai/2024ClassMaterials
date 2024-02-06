package week04.day2.objectEx;

public class Score {
	
	String name;
	int kor;
	int eng;
	int total;
			
	//생성자
	public Score() {}
	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor  = kor;
		this.eng = eng;
		this.total = this.kor + this.eng;
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
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  name + " " + kor +  eng + " " +total;
	}
	
	
	//
	//Score s =  new Score("홍길동", 100 ,90);
	//Score s2 = new Score("가길동", 100,90);
	//boolean result  =  s.equals(s2);
	@Override
	public boolean equals(Object obj) {	 // Object형으로 업캐스팅	
	 
		Score s = (Score)obj;  // Score형으로 다운캐스팅
		if( this.kor == s.kor  &&  this.eng  == s.eng  && this.name.equals(s.name)) {
			return true;
		}else
			return false;		 
		 
	}

}
