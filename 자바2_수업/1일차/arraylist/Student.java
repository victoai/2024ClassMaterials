package java2.generic.arraylist;

class Student{	 
	 String name;
	 String address;
	 
	 public Student(String name, String address) {
		 this.name = name;
		 this.address = address;
	 }
	 
	 @Override
	 public String toString() {
		 return name + " " + address;
	 }
	 
	 public void special() {
		 System.out.println( "Student 매서드입니다");
	 }
}
