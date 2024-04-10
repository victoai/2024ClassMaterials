package day3.day3.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Vote {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		//오늘의 오후 실습시간에 대한 투표
		//1.혼자 실습
		//2.짝궁 실습 
		
		BufferedReader reader = new BufferedReader ( new FileReader("src/day3/day3/stream/vote.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String str="";
		while( ( str = reader.readLine())  != null ) {
			list.add( str);			
		}		
		//
		System.out.println(  list.size());	
		
		Stream<String> stream =list.stream();		
		long count  =stream.filter(s-> s.trim().equalsIgnoreCase("N")).count();
		 
		
		Thread.sleep(3000);		
		System.out.println("결과=====>");
		System.out.println( count);
		 

	}

}
