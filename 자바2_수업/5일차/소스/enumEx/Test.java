package day5.enumEx;



enum 캐릭터상태 {
  정상,
  공격,
  수비,
  죽음
}

public interface Test {
	
	public static void main(String[] args) {
		
		
		캐릭터상태   상태 = 캐릭터상태.공격;
		
		 switch (상태) {
         case 정상:
             System.out.println("캐릭터가 정상 상태입니다.");
             break;
         case 공격:
             System.out.println("캐릭터가 공격 상태입니다.");
             break;
         case 수비:
             System.out.println("캐릭터가 수비 상태입니다.");
             break;
         case 죽음:
             System.out.println("캐릭터가 죽음 상태입니다.");
             break;
     }
 }
		
	 
	}

 
 
 
