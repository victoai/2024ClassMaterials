package day1.interfaceEx.myarrys2;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraysGTest {

	public static void main(String[] args) {

		 
	 	Student[] arrs = new Student[3];
		
	    Student a = new Student("하길동", "하남시");
        Student b = new Student("나길동", "강원도");
        Student c = new Student("가길동", "제주도");
        
        
        arrs[0]= a;
        arrs[1]=b;
        arrs[2]=c;
        
        
        MyArraysG.sort(arrs);
        
        //정렬후 //
        System.out.println( Arrays.toString(arrs));
        
        MyArraysG.sort( arrs , new Comparator<>() {

			@Override
			public int compare(Student o1, Student o2) {					
				return o1.address.compareTo(o2.name);
			}
        	
        });
        
        //정렬후 
        System.out.println( Arrays.toString(arrs));
	 
		
	}

}
