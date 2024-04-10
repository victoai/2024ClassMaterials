package java2.day3.lamda;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class 실습 {

	public static void main(String[] args) {
		
		
		//버전1 
		BiConsumer<String,Integer> f1 = (name, score) -> {
			System.out.println("학생의 이름은 " + name + ", 성적은 " + score);
		};
		f1.accept("병진", 90);
		
	
		BiPredicate<String,String> f3 = (name, grade) -> {
			if(grade == "A") {
				return true;
			}else
				return false;
		};
		if(f3.test("병진", "A")) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합입니다.");
		}
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("방법2");
		Student s1 = new Student("학생1", 80);
		Student s2 = new Student("학생2", 90);
		
		BiConsumer<Student,Student> c1 = new BiConsumer<Student, Student>() {
			@Override
			public void accept(Student t, Student u) {
				Student s1 = (Student)t;
				Student s2 = (Student)u;
				System.out.println(s1.name + ", 성적 : " + s1.score);
				System.out.println(s2.name + ", 성적 : " + s2.score);
			}
		};
		c1.accept(s1, s2);
		
		
		BiFunction<Student,Student,String> getGrade = (o1,o2)->{
			
			calGrade(o1);
			calGrade(o2);
			return o1.toString() +"\n"+ o2.toString();
		};
		String result = getGrade.apply(s1, s2);
		System.out.println(result);
		
	}
	
	public static void calGrade(Student s){
        if (s.score >= 90) {
            s.setGrade("A");
        } else if (s.score >= 80) {
            s.setGrade("B");
        } else if (s.score >= 70) {
            s.setGrade("C");
        } else {
            s.setGrade("F");
        }
    }
}
