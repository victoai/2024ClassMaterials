package java2.day3.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동", 25);
        map.put("김길동", 30);
        map.put("나길동", 35);
        
        
        for ( Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        } 
       
        
        //스트림으로 다루기        
        map.entrySet().stream()
            .forEach(entry -> {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("Key: " + key + ", Value: " + value);
            });


        
        map.entrySet().stream()
            .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
    }
}
