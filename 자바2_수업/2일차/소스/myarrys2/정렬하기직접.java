package day1.interfaceEx.myarrys2;

public class 정렬하기직접 {

	public static void main(String[] args) {
		
		
		Score0[] arr = new Score0[3];		
		arr[0]= new Score0("이길동",90,71);
		arr[1]= new Score0("김길동",70,99);
		arr[2]= new Score0("박길동",90,89);
 
		
		
		
		for( int i=0; i< arr.length-1 ; i++){
			
			for( int j=i+1; j< arr.length; j++){
				
				if( arr[i].getKor() > arr[j].getKor()){   // 국어성적으로 오름차순
					Score0 tmp;
					tmp =arr[i];
					arr[i] =arr[j];
					arr[j]=tmp;
				}
				
			}
		}
		
		
		
		
		//
		for( Score0 s: arr)
			System.out.println( s);

	}

}
