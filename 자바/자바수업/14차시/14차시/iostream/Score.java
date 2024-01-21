package iostream;

import java.io.Serializable;


//
/*
 * 
 * 직렬화(serialize)란 자바 언어에서 사용되는 Object 또는 Data를 다른 컴퓨터의 자바 시스템에서도 사용 할수 있도록 
 * 바이트 스트림(stream of bytes) 형태로 연속전인(serial) 데이터로 변환하는 포맷 변환 기술을 일컫는다.
 * 역직렬화는(Deserialize)는 바이트로 변환된 데이터를 원래대로 자바 시스템의 Object 또는 Data로 변환하는 기술이다.

  JVM의 힙(heap) 혹은 스택(stack) 메모리에 상주하고 있는 객체 데이터를 직렬화를 통해 바이트 형태로 변환하여
   데이터베이스나 파일과 같은 외부 저장소에 저장해두고,
    다른 컴퓨터에서 이 파일을 가져와 역질렬화를 통해 자바 객체로 변환해서 JVM 메모리에 적재한다
 * 
 * 객체를 다른 환경에 저장했다가 나중에 재구성 할 수 있게 만드는 과정   byte 스트림
 * 객체의 상태를 파일에 저장해야 할 때 
 * 마커인터페이스 -> 구현해야 할 기능이 없는 인터페이스
 * 
 * 
 */
public class Score  implements Serializable{
	
	String name;
	int kor;
	int eng;
	int tot;
	
	
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = this.kor + this.eng;
	}



	@Override
	public String toString() {
		return " name=" + name + ", kor=" + kor + ", eng=" + eng + ", tot=" + tot ;
	}
	
	// 

}
