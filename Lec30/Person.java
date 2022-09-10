package Lec30;

public class Person {

	private String name = "kamlesh";
	private int age = 12;

	public Person() {
		name = "Raj";
		age = 22;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		setAge(9);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("bklol age -ve nhi hota hai");
		}
		this.age = age;
	}

	public void setAge2(int age) {
		try {
			if (age < 0) {
				throw new Exception("bklol age -ve nhi hota hai");
			}
			this.age = age;
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("I am in Final");
		}

	}
}
