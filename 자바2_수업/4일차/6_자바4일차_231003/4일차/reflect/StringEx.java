package java2.day4.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Field;
import java.lang.reflect.Field;

public class StringEx {
    public static void main(String[] args) throws Exception {
        // 원래 문자열
        String str = "hello";
        System.out.println("Original String: " + str);

        // 'String' 클래스의 'value' 필드에 접근
        Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true); // 필드를 접근 가능하게 설정

        
        
        System.out.println( "dfdf" + valueField);
        // 'value' 필드의 값을 가져와서 수정
        char[] value = (char[]) valueField.get(str);
        value[0] = 'k';

        // 수정된 문자열 출력
        System.out.println("Modified String: " + str);
    }
}


