package day12.업다운캐스팅.단야님;

public class 연습 {
	   public static void main(String[] args) {
	   에자3수 x = new 에자3수();
	   
	   //부모와 자식 사이의 형 변환/ 업, 다운
	   x.Cool();
	   x.Fun();
	   x.Sexy();
	   x.Meal();
	   
	   
	   //업캐스팅
	   에이콘 y = x;
	   
	   y.Elevator();
	   y.Aircon();
	   
	   
	   //다운캐스팅
	   에자3수 z = (에자3수)y;
	   
	   z.Succeed();
	      
	   
	   }
	}