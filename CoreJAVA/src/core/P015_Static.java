package core;
class Student{
	int id;
	String name;
	long contact;
	static String col_name = "XYZ";
	public Student(int id,String name,long contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	public void show() {
		System.out.println("id : "+id+" name : "+name+" contact: "+contact+" col_name : "+col_name);
	}
	public static void call() {
		System.out.println("call in student class");
	}
}
public class P015_Static {
	public static void main(String[] args) {
		Student s = new Student(1, "java", 987654);
		Student s1 = new Student(2, "php", 987654);
		s.show();
		s1.show();
		
		Student.call();
	}
}
