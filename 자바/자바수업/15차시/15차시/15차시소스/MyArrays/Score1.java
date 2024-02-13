package MyArrays;

public class Score1  implements Comparable {
private  String name;
private  int kor;
private   int eng;


//생성자 
public Score1() {} //디폴트생성자
public Score1(String name, int kor , int eng) {
	this.name  = name;
	this.kor = kor;
	this.eng = eng;
	
}  //

public String getName() {
	return name;
}
 
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	
	//유효성 검사 
	this.kor = kor;
}
public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}


@Override
public String toString() {
	return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
}
@Override
public int compareTo(Object obj) {	
	Score1 s = (Score1)obj;
	return this.kor - s.getKor();  // 이 결과가 양수가 오면 정렬알고리즘에서 자리를 교환하게 되어 있습니다 !!!!!.  정렬이 되고싶은 상황을 우리가 만들어 줘야 한다. 
}
  

}
