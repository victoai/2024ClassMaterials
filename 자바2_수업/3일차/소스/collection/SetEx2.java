package day3.day3.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import day2.lamda.sort.Moving;

public class SetEx2 {

	public static void main(String[] args) {
	
		// set :  중복허용 x , 순서 x
		// String 클래스는 이미 equals를 재정의 하였다.
		
		// 사용자가 만든  객체인 경우에 같다는 것을  equals를 재정의 해야 한다
	
		
		Set<Moving> set = new HashSet<>();
		set.add(new Moving("장주원","구룡포",100));
		set.add(new Moving("이미현","경기",80));
		set.add(new Moving("김두식","문산",90));
		set.add(new Moving("장주원","봉평",88));
	 
		
		set.forEach( item -> System.out.println( item));
		
		
		  

	}

}
