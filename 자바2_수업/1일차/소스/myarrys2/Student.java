package day1.interfaceEx.myarrys2;

class Student  implements Comparable<Student> {	 
	String name;
	String address;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}	
		
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name)  ;    //  내가작으면 음수 , 내가 크면 양수 
	}
	
	
	 
 }