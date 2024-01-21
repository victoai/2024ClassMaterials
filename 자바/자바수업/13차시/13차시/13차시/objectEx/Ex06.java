package week04.day2.objectEx;

public class Ex06 {

	public static void main(String[] args) {
	 
		
		String date1 = new String("2018-02-19");
		
		String[] list = date1.split("-");
		
		for( String s: list )
			System.out.println( s); 
		
		
		 for(int i=0; i<list.length; i++)
		{
			if( Integer.parseInt(list[i]) <10 && list[i].contains("0"))
				list[i] = list[i].replace("0","");
		}
		 
		System.out.println(list[0]+ "." + list[1] +"." + list[2]);
				 
		 
	}

}
