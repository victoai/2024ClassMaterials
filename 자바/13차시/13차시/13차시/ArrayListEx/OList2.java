package week04.day2.ArrayListEx;

public class OList2 {
	
	private Object[] nums;
	private int current;
	
	private  int capacity;  //용량
	private  int amount;    // 추가용량	
	
	public OList2() {	 
		
		current=0;
		capacity=3;
		amount=5;
		nums = new Object[capacity];  // 처음에 capa만큼 배열생성		
	}	
	
	public int size() {
		return current;
	}
	
	public void add(Object obj) {
		
		if(capacity <= current) {
			Object[] temp = new Object[ capacity + amount ];		
			
			for(int  i=0; i< current  ; i++) {
				temp[i] = nums[i];				
			}
			nums = temp;  //새로운 배열을 가르킴
			capacity += amount;   //캐파가 증가됨 
		}
		 
		nums[current] = obj;
		current++;
		
	}
	
	public void clear(){
		//current 초기화
		current=0;
		// nums= new int[3];		
	}
		
	public Object get(int index)   { 
		
		return  nums[index];	
	}
	
	
	//가변길이 olist test
	public static void main(String[] args) {
		
		OList2  list = new OList2();
		
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(9);
		
		for( int i=0 ; i < list.size(); i++) {
			System.out.println(  list.get(i));
		}	 
		 
	}
}
