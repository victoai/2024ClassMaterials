package 김민규_김민지_실습;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException {
        catCafe c = new catCafe();
        Class<?> clazz = Class.forName("day4.reflect2.catCafe");
        Method method = clazz.getDeclaredMethod("printInfo");
        
        
        Constructor con =   clazz.getDeclaredConstructor(String.class, String.class, String.class);
        catCafe catcafe =  (catCafe) con.newInstance("te" , "12","324");
        System.out.println(catcafe);
        
        method.invoke(catcafe);
    }
}