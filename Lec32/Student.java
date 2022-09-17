package Lec32;

public class Student {

	private String name;
	private int age;
	static int val = 9;

	public Student() {
		// TODO Auto-generated constructor stub
		name = "raj";
		age = 21;
	}

	public void fun() {
		System.out.println(this.name + " " + this.age);
	}

	@Override
	public String toString() {

		return this.name + " and " + this.age;
	}

}
