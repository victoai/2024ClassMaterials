package MyArrays;

public class Score0   {
private  String name;
private  int kor;
private   int eng;


//생성자 
public Score0() {} //디폴트생성자
public Score0(String name, int kor , int eng) {
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
 

}
