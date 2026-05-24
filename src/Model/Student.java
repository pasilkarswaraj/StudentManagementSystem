package Model;

public class Student {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		this.id=id;
		this.name= name;
		this.age=age;
	}
	
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void display(){

	    System.out.println("----------------------");

	    System.out.println("ID   : "+id);

	    System.out.println("Name : "+name);

	    System.out.println("Age  : "+age);

	    System.out.println("----------------------");
	}
	
}
