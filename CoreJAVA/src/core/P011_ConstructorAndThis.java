package core;

class User {
	int id;
	String name;
	String address;
	long contact;

    public User() {
		System.out.println("this default cons");
	}

	public User(int id, String name, String address, long contact) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		System.out.println("id : " + id + " name : " + name + " address : " + address + " contact : " + contact);
	}
	
	public User(User u) {
		this.id = u.id;
		this.name = u.name;
		this.address = u.address;
		this.contact = u.contact;
	}

	public void show() {
		System.out.println("id : " + id + " name : " + name + " address : " + address + " contact : " + contact);
	}
}

public class P011_ConstructorAndThis {
	public static void main(String[] args) {
		User u = new User();
		u.show();
		User u1 = new User(1, "java", "ahmedabad", 9876540);
		u1.show();
		
		User u2 = new User(u1);
		u2.show();
	}

}
