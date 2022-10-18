package Lec40;

public class Abstract_Implimantion extends Abstract_Demo {

	@Override
	public void fun() {
		// TODO Auto-generated method stub

	}

	public void SayBye() {

	}

	public static void main(String[] args) {
		Abstract_Implimantion abs = new Abstract_Implimantion();
		abs.fun();
		abs.SayBye();
		abs.SayHey();
		Abstract_Demo abs1 = new Abstract_Demo() {
			
			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
