package day15.듀오;

import java.util.Arrays;

public class 학번구하기 {

	public static void main(String[] args) {
		
		Student student[] = new Student[5];
		
		student[0] =  new Student("김춘옥" , 22, 1.1);
		student[1] =  new Student("최덕배" , 11 , 3.5);
		student[2] =  new Student("육경자" , 19 , 1.0);
		student[3] =  new Student("밥말리" , 16 , 4.5);
		student[4] =  new Student("이치삼" , 23 , 1.0);
		
		Arrays.sort(student);
		for(int i=0 ; i<5; i++)
			System.out.println(student[i]);

	}

}
