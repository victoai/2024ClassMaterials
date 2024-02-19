package javaprj.day0128.day20Ex;

public class 비동기예제기본{

	 public static void main(String[]  args){

	   Thread t = new Thread( new Runnable() {
	                   public void run(){
	                              for( int i=0; i<100;i++)
	                                     System.out.println( i+"hi ^^") ;
	                   }
	   } );
	  t.start();

	  for( int i=0; i<100;i++)
	                        System.out.println( i+" bye~") ;
	   } 

	}
