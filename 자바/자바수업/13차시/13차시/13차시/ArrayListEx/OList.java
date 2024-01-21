package week04.day2.ArrayListEx;

public class OList {
	
	private Object[] nums;
	private int current;
	
	
	public OList() {		 
		nums = new Object[3];
		current=0;
	}
	
	
	public int size() {
		return current;
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
	
	
	public Object get(int index)    { 
		
		return  nums[index];
	
	}

	public static void main(String[] args) {
		
		OList list = new OList();
	 
		list.add(3);
		list.add(5);
		list.add(4);
		//list.add(5);
	
		for(int i=0; i< list.size(); i++) {
			System.out.println( list.get(i));
		}
		
	}
}
