package java2.interfaceEx.cook;

class Cook{
    String name;
    public void 썰기(){
	            System.out.println(" 잘 썬다");
	            }   
	public void 굽기(){
	            System.out.println(" 잘 굽는다");
	            }   
	public void 튀기기(){
	            System.out.println(" 잘 튀긴다");
	            }   
	public void 볶기(){
	            System.out.println(" 잘 볶는다");
	            }   
	
    public Cook( String name){
	        this.name = name;
	}
    
    
    @Override
	public String toString() {
		return "Cook [name=" + name + "]";
	}
	public Cook() {
		// TODO Auto-generated constructor stub
	}
    
}
