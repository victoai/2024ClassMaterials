package prjDay12;

// 성적(구조가 있는 데이터 : 이름, 국어, 영어 , 수학 , 총점) 을 담을 자료형이 필요해 !!!
public class Score {       // Score 자료형 만들기 (사용자정의 자료형 만들기 )
	
	String name;           // 변수가 만들어 지지 않음  
	int kor;               // new에 의해서 변수가 만들어짐 
	int eng;
	int math;
	int tot;
	
	
	//생성자 
	public Score() {
		
	}
	
	public Score( String name, int kor, int eng, int math) {		
		this.name =name;
		this.kor = kor;
		this.eng= eng;
		this.math= math;	
		this.tot = this.kor +this.eng+ this.math;
	}
		
	
	public void setKor(int kor) {
		this.kor = kor;		
	}
	
	
	public int getKor() {
		return kor;
	}
	
	//출력 or  값을정보를 String으로 반환하는 매서드 
	public String  getInfo() {
		return  name + " " + kor + "" + eng + " " +math + " " + tot ;
	}
	
	
	// 부모의 매서드를 재정의 , 오버라이딩 
	 @Override
		public String toString() {
			// TODO Auto-generated method stub
			return  name + " " + kor + "" + eng + " " +math + " " + tot ;
		}

}
