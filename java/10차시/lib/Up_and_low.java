package com.acron;

public class Up_and_low {
	public static String upper(String a){
		String result ="";
		int num;
		for(int i=0; i<a.length(); i++) {
			num = (int)a.charAt(i);
			if((num>=97)&&(num<=122)) {
				num-=32;
			}
			result +=(char)num;
		}
		return result;
	}
	public static String lower(String a){
		String result ="";
		int num;
		for(int i=0; i<a.length(); i++) {
			num = (int)a.charAt(i);
			if((num>=65)&&(num<=90)) {
				num+=32;
			}
			result +=(char)num;
		}
		return result;
	}
	public static String up_low(String a) {
		String result ="";
		int num;
		for(int i=0; i<a.length(); i++) {
			num = (int)a.charAt(i);
			if((num>=65)&&(num<=90)) {
				num+=32;
			}
			else if((num>=97)&&(num<=122)) {
				num-=32;
			}
			result +=(char)num;
		}
		return result;
	}

}
