package ch12.enum_;

//Enum 선언
//Enum :관련있는 상수들을 묶어 놓은 것

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enum사용 {
 public static void main(String[] args) {
    
     Day today = Day.WEDNESDAY;
    
     System.out.println("오늘은 " + today);

     // Enum 값에 따른 동작
     switch (today) {
         case MONDAY:
             System.out.println("월요일 스케쥴 ");
             break;
         case WEDNESDAY:
             System.out.println("수요일 스케쥴");
             break;
         case FRIDAY:
             System.out.println("금요일 스케쥴");
             break;
         default:
             System.out.println("잘못된 입력");
     }

     
     System.out.println("요일정보");
     for (Day day : Day.values()) {
         System.out.println(day);
     }
 }
}
