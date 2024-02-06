package day13.ArrayListEx;

import day13.성적관리.Score;

public class GList<T> {
	
	private Object[] nums;
	private int current;
	 	
	
	
	public GList() {		 
		nums = new Object[3];
		current=0;
	}
	
	public void add(T obj) {
		nums[current] = obj;
		current++;
		
	}
	
	public void clear(){
		//current 초기화
		current=0;
		// nums= new int[3];		
	}
	
	public int size()
	{
		return current;
	}
	
	public T get(int index)    { 
		
		return (T) nums[index];
	
	}
	
	
	public static void main( String[] args) {
		GList<Score> list = new GList<>(); 
		
	
		list.add( new Score("이정훈", 99,100 ));
		list.add( new Score("이윤정", 99,100 ));
		list.add( new Score("이윤", 99,100 ));
	 
	
		for(int i=0; i< list.size(); i++) {
			System.out.println( list.get(i));
		}
				
		Score score=list.get(0);
		String name= score.getName() ;		
		System.out.println( name);
	}

}
