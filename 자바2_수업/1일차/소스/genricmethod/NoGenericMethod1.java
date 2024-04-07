package day1.generic.genricmethod;

public class NoGenericMethod1 {

	
    public static int pickInt(int a, int b) {
        return Math.random() > 0.5 ? a : b;
    }

    public static boolean pickBoolean(boolean a, boolean b) {
        return Math.random() > 0.5 ? a : b;
    }

    public static String pickString(String a, String b) {
        return Math.random() > 0.5 ? a : b;
    }

    public static double pickDouble(double a, double b) {
        return Math.random() > 0.5 ? a : b;
    }

    
    
    
    public static void main(String[] args) {

        int randNum = pickInt(7, 9);

        boolean resultBool = pickBoolean(true, false);
        String resultStr = pickString("짜장", "짬뽕");
        double resultDbl = pickDouble(45.12, 50.90);

        System.out.println(resultBool);
        System.out.println(resultStr);
        System.out.println(resultDbl);

    }
}
