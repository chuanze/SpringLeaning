package chuanze.springlearning.people;

public class Student implements People {

	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student() {}
	@Override
	public void Say() {
		// TODO Auto-generated method stub
		System.out.println("I am a student");
	}

}
