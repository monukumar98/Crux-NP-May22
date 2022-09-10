package Lec30;

public class Sudent_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "Kaju";
		s.age = 18;
		s.Intro_yourSelf("Raj");
		Student s1 = new Student();
		s1.name = "vinod";
		s1.age = 28;
		s1.Intro_yourSelf("Kamlesh");

	}

}
