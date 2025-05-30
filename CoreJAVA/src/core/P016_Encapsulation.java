package core;

class User1 {
	private int id;
	private String name;
	private long contact;

	User1() {
		System.out.println("def cons");
	}

	User1(int id, String name, long contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getContact() {
		return contact;
	}

	
	public String toString() {
		return "id : " + id + " name : " + name + " contact : " + contact;
	}

}

public class P016_Encapsulation {
	public static void main(String[] args) {
		User1 u = new User1();
		u.setId(1);
		u.setName("java");
		u.setContact(987654);
//		u.id = 12;
		System.out.println(u);
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.getContact());

		User1 u2 = new User1(2, "python", 7896310);
		System.out.println(u2);
	}
}
