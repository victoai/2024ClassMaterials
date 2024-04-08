package day1.generic.generic복습;

import java.util.ArrayList;
 

class Person {
    String name; 
     
    // 생성자 오버로딩
    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

// Person 상속 Man 클래스
class Man extends Person {
	Man( String name){
	  super(name);
	}
     
}

// Person 상속 Woman 클래스
class Woman extends Person {
	  Woman( String name){
		  super(name);
	  }    
}

public class 와일드문자로제한하기2 {

	public static void main(String[] args) {
		 // Person
        ArrayList<Person> listP = new ArrayList<>();
        listP.add(new Person("이사람"));
        listP.add(new Person("김사람"));
        
         

        // Man
        ArrayList<Man> listM = new ArrayList<>();
        listM.add(new Man("공유"));
        listM.add(new Man("스티브잡스"));
        
        

        // Woman
        ArrayList<Woman> listW = new ArrayList<>();
        listW.add(new Woman("아이유"));
        listW.add(new Woman("김연아"));
       
        
        
        //listP 매개변수로 받을 수 있는 매서드를 고르시오
        
        //listM 매개변수로 받을 수 있는 매서드를 고르시오
        
        //listW 매개변수로 받을 수 있는 매서드를 고르시오
        
        
        
      

    }

   
    public static void printData1(ArrayList<? super Man> list) {    // Man 클래스와 그 상위 클래스로 생성된 인스턴스만 매개변수로 전달 가능 
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    
    public static void printData2(ArrayList<?>  list) {      // ? extends Object 같은 의미    
            for (Object obj : list) {
                System.out.println(obj);
            }
    } 
    
    public static void printData3(ArrayList<? extends Man>  list) {    // Man클래스와 Man클래스를 상속받은 클래스      
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    
    
    public static void printData4(ArrayList<Man>  list) {      //Man클래스만    
        for (Object obj : list) {
            System.out.println(obj);
        }
	}

    
    

}
