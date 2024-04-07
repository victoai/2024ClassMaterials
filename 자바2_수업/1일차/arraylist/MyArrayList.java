package java2.generic.arraylist;

public class MyArrayList  {
	
	private Object[] nums;
	private int current; 	
	
	
	public MyArrayList() {		 
		nums = new Object[3];
		current=0;
	}
	
	public void add(Object obj) {
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
	
	public Object get(int index)  { 		
		return   nums[index];
	
	}	
	
	 
	
	public void forEach( MyConsumer   t ){		 
		for( int i=0 ; i< current ; i++){
			 t.accept(  get(i) );
		}		
	}
	
 
	
}
