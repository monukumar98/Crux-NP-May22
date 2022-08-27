package Lec28;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		PrimeSieve(100);

	}

	public static boolean isprime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}

	public static void PrimeSieve(int n) {
		boolean[] prime = new boolean[n + 1];
		// false --> prime
		// true --> not prime
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i] == false) { // prime hai i

				for (int mul = 2; mul * i < prime.length; mul++) {
					prime[mul * i] = true;// marked not prime
				}
			}

		}
		
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false)
				System.out.print(i + " ");
		}
	}

}
