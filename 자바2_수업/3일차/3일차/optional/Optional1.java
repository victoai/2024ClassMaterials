package java2.day3.optional;


 
import java.util.ArrayList;
import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {  
	    Optional<User> user  = searchUserOptional("gy");           
	    User result  = user.orElse(new User()) ;   // null이면 빈객체 생성하겠다.
	     System.out.println( result.getPw());	    
	    
	    // System.out.println( user.orElseGet(()-> new User("test","pw")));     // null 이면 특정 User 객체를 생성하겠다
         //  User user2 = searchUser("gy");
	     //  System.out.println( user2.getPw());   // nullPointException        
        
   } 
            
    private static User  searchUser(String id) {
    	User user=null;
    	ArrayList<User> users = new ArrayList<>();
    	users.add(new User("hong" ,"t11"));
    	users.add(new User("kim" ,"t12"));
    	users.add(new User("lee" ,"t13"));    	
    	 
    	for( User u: users) {
	    	if( u.getId().equals(id)) {
	    	 user = u;
	    	}
	    }
	    return user;  // 못찾으면  null 반환    
    }
    
    
	private static Optional<User>   searchUserOptional(String id) {
    	    ArrayList<User> users = new ArrayList<>();
	    	users.add(new User("hong" ,"t11"));
	    	users.add(new User("kim" ,"t12"));
	    	users.add(new User("lee" ,"t13"));
    	return    users.stream().filter( user -> user.getId().equals(id))
    	        .findFirst();    
   }
    	
 

}
