package day5.enumEx;

 enum ScreenMode {
    LIGHT,
    DARK
}

public class 열거형이란3 {

	
	public static void main(String[] args) {
		
		ScreenMode mode = ScreenMode.LIGHT;
		mode = ScreenMode.DARK;
		 
		System.out.println( mode);

		
	}
}
