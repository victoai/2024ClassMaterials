package 인터페이스예제;

public class TeacherProgram2 {
 

	public static void main(String[] args) {		
		//한개 실행하기 
		
		
		
		//미션(인터페이스를 기반한 프로그램 작성하기, 약속(규격)정하기 ,개발설계를 작성할 수 있다.
		// 여려분은 클래스를 하나 만들고 매서드를 하나 작성합니다.
		// 매서드는 특정코드 (원하는 코드)를 실행하는 코드입니다.
		// 예를 들면  !!  별을 출력하거나, 재미있는 이야기를 출력할 수도 있습니다. 코드는 상관이 없어요 자기만의 코드를 작성해 주세요 !!
	 
		
		
		TeacherRunnable[] students  = new  TeacherRunnable[20];
		
		// 이 배열에 여러분이 만든  TeacherRunnable을 구현한  Class형의 객체를 담아보겠습니다.  담을 수 있나요? 
		// TeacherRunnable을 구현했다면 부모형으로 참조할 수 있다라는 업캐스티에 의해서 가능합니다.  
		// 상속관계에서 부모형으로 다뤄질 수 있다
		/*
		students[0] = 
		students[1] = 
		students[2] = 
		students[3] = 
		students[4] = 
		students[5] = 
		students[5] = 
		students[6] = 
		students[7] = 
		students[8] = 
		students[9] = 
		students[10] = 
		students[11] = 
		students[12] = 
		students[13] = 
		students[14] = 
		students[15] = 
		students[16] = 
		students[17] = 
		students[18] = 
		students[19] = */
		
		
		for(  TeacherRunnable r  : students){
			r.runYourCode();
		}
		
		
		

	}

}
