package Lec28;

public class Time_and_Space_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		int i = 1;
//
//		while (i <= 500000) {
//			i++;
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);

		System.out.println("hey");
		System.out.println("hey");
		System.out.println("hey");
		System.out.println("hey");
		System.out.println("hey");

		int i = 0;
		while (i < n) {
			System.out.println("Hey");
// O(N)
			i++;
		}

		while (i < n) {
			System.out.println("Hey");
			// Log(N)
			i *= 2;
		}

		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			// Log(N)
		}

		while (i <= n) {
			System.out.println("Hey");
//O(N)
			i += 2;
			i += 3;
		}

		while (i <= n) {
			System.out.println("Hey");
			// Log(N) base 6
			i *= 2;
			i *= 3;
		}

		while (n > 0) {
			System.out.println("Hey");
			// Log(N) base 6
			n /= 2;
			n /= 3;
		}
		while (i <= n) {
			System.out.println("Hey");
// O(N/K)
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// Log(N) base k
			i *= k;
		}

		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 1;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 2;
			n = n - 3;
		}
		while (n > 0) {
			n = n - k;
			// O(N/K)
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
				//O(N^2)
			}
		}
		
		
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// O(sqrt(N))
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (int k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					//O(N^4)
				}
			}
		}
		
		

		for( i=1; i<=n; i*=2) {
			System.out.println("hey");
			// O(log(N))
		}
		
		
		for(i=n/2; i<=n; i++) {
			for(int j=1; j<=n/2; j++) {
				for(int k=1; k<=n; k=k*2) {
					System.out.println("hey");
					// N^2O(log(N))
				}
			}
		}
		
		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
				//Nlog(N)
			}
		}
		

	}

}
