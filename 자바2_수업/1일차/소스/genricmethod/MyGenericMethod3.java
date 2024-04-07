package day1.generic.genricmethod;

public class MyGenericMethod3 {
	//  제네릭 메소드
	//  T : 타입변수. 원하는 어떤 이름으로든 명명 가능
	
	// 배열의 요소 두 개를 교환(자리바꿈하기)
	public static <T> void arraySwap (T[] array, int iA, int iB) {       
        T temp = array[iA];
        array[iA] = array[iB];
        array[iB] = temp;
    }
	 
	
	 
	public static void main(String[] args) {
		//  원시값 배열(char[])을 쓰면 오류 - 배열로는 오토박싱이 안 되므로
       
        Character[] chrs = new Character[] {  'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'    };        
        String[]  fruits = new String[] {  "banana"  , "apple" ,  "melon"  , "strawberry" };
        
        arraySwap(chrs, 1, 2);
        arraySwap(fruits, 0, 3);
		 
		// 셔플 
        for (int i = 0; i < 100; i++) {
            arraySwap(   fruits,  (int) Math.floor(Math.random() * fruits.length)  ,  (int) Math.floor(Math.random() * fruits.length)        );
        }     
        
        //과일배열 출력하기        
        for( String fruit : fruits) {
        	System.out.println( fruit);
        }
        
	}

	
	
}
