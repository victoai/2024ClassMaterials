package day1.generic.genricmethod;

public class MyGenericMethod2 {
	
	//배열, 요소값 
	//배열 중에 요소값과 일치하는 총개수를 반환하는 매서드 이다

    public static <T> int countTotal(T[] array, T element) {
        int count = 0;
        for (T e : array) {
            if (e.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 1, 2, 1};
        int occurrences = MyGenericMethod2.countTotal(numbers, 1);
        System.out.println("Number of occurrences of 1: " + occurrences);   
        
        
        
    }
    
    /*
     
    public static void main(String[] args) {
    String[] words = {"apple", "banana", "apple", "orange", "grape", "apple"};
    int occurrences =  MyGenericMethod.countTotal(words, "apple");
    System.out.println("Number of occurrences of 'apple': " + occurrences);
	}
 
   */
    
    /*
    public static void main(String[] args) {
        Boolean[] flags = {true, false, true, true, false, false, true};
        int occurrences =  MyGenericMethod.countTotal(flags, true);
        System.out.println("Number of occurrences of true: " + occurrences);
    }

    */
    /*
    
    public static void main(String[] args) {
        Character[] characters = {'a', 'b', 'c', 'a', 'd', 'e', 'a'};
        int occurrences =  MyGenericMethod.countTotal(characters, 'a');
        System.out.println("Number of occurrences of 'a': " + occurrences);
    }
*/
    
    
    /*
     * 
    
     public static void main(String[] args) {
    Double[] numbers = {1.5, 2.3, 3.7, 2.3, 1.5, 4.2, 2.3};
    int occurrences = countOccurrences(numbers, 2.3);
    System.out.println("Number of occurrences of 2.3: " + occurrences);
}

     */
    
      
    
    
    
}
