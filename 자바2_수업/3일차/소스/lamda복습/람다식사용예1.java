package day3.day3.lamda복습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

 

//람다식: 함수형프로그램을 할 수 있도록 만들어지는 문법이다.
//함수형프로그램이란?  
//


//자바는 매서드만 존재할 수 없다. 그래서 인터페이스를 안에 매서드를 제공한다.
//추상매서드가 한 개인 인터페이스를 제공한다. => 함수형인터페이스 
//람다식은 함수형인터페이스로 제공된다.
//인터페이스를 구현한 클래스의 구현을 간단한 식형태로 사용할 수 있게 한다.

//람다식을 잘 이해하기 위해서는 
//함수형인터페이스를 구현하는 방법에 람다식이 제공된다는 것을 알는 것이 중요하다
//함수형인터페이스를 사용하는 방법은 람다식만 존재하는 것이 아니다


// 라이브러리의 매서드를 사용할 때 *************
/*  매서듸 매개변수에 함수형인터페이스가 있다면? 
 * 
 * 1. Collections.sort( List list, Comparator c );
 * 2. ArrayList<String> list = new ArrayList<>();
 *    list.add("hi");
 *    list.add("hi2");
 *    list.forEach( Consumper c);
 * 
 * */
//함수의 매개변수에 인터페이스가 있다면? 개발자가 해야할 일 !!!!!!
//인터페이스는 약속만 가지고 있기때문에 
//인터페이스를 구현한 클래스를 만든다  (약속된 매서드를 오버라이드 한다)
//객체를 생성한다
//필요한 매개변수에 객체를 전달한다.

/*
 * interface AddInterface 
 *    int add( int a, int b);
 * 
 */

public  class 람다식사용예1{
	
	public static void main(String[] args) {
		 
		ArrayList<Moving> list = new ArrayList<>();		
		list.add(new Moving("장주원","구룡포",100));
		list.add(new Moving("이미현","경기",80));
		list.add(new Moving("김두식","문산",90));
		list.add(new Moving("전영석","봉평",88));
		
		 
		Collections.sort( list,  new Comparator<Moving> () {
			@Override
			public int compare(Moving o1, Moving o2) {			 
				return  o1.power-  o2.power;
			}});
		
		
		
		Collections.sort(list, (o1,o2) -> o1.power- o2.power);
		
		
		//ForEach 사용하기		
		list.forEach( item  ->  System.out.println( item));
		
		
	}
	
}

 
