package java2.day4.reflect;

import java.lang.reflect.Constructor;

public class Reflect테스트 {
    public static void main(String[] args) throws Exception {
        // Class 객체를 가져오기
        Class<  Member> clazz = (Class<  Member>) Class.forName("java2.day4.reflect.Member");

        // 파라미터 없는 생성자를 이용하여 인스턴스 생성
        Constructor< Member> constructor = clazz.getDeclaredConstructor();
        Member member = constructor.newInstance();
        member.printInfo();

        // 파라미터 있는 생성자를 이용하여 인스턴스 생성
        Constructor< Member> constructor2 = clazz.getDeclaredConstructor(String.class, String.class);
        Member member2 = constructor2.newInstance("wjy", "1234");
        member2.printInfo();
    }
}

 
