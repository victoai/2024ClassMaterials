package front;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 
public class MemberRepository {
	
	private static MemberRepository repository  ;
	static  HashMap<Long, Member> map;
	static  long num=0;
	
	
	
	private MemberRepository() {
		map = new HashMap<Long, Member>();	 		
	}
	 
	
	//저장
	public void save( Member member) {			 
		 member.setNum(++num);
		 map.put( num , member);
	} 
	 	
	
	public static MemberRepository  getInstance() {			
		if( repository == null ){
		  repository =new MemberRepository();
		}		
		return repository; 
	}
	
	
	public List<Member>  findAll(){
	    return	new ArrayList<>( map.values()) ;
		
		
	}
	
	/*
	public List<Entry<String, Member>> findAll(){
		
		return map.entrySet()
		          .stream()
		          .collect(Collectors.toList());
		
	}
	
	
	*/

}
