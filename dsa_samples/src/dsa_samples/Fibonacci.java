package dsa_samples;

public class Fibonacci {

	public static void main(String args[]) {
		Fibonacci obj = new Fibonacci();
		obj.printFibo(5);
	}

	public void printFibo(int n) {
		Fibonacci obj = new Fibonacci();
		for (int i = 0; i < n; i++) {
			int res = obj.fibo(i);
			System.out.printf(res + " ");
		}
	}

	public int fibo(int n) {
		if (n == 1)
			return 1;
		if (n == 0)
			return 0;
		int fibo1 = fibo(n - 1);
		int fibo2 = fibo(n - 2);
		return fibo1 + fibo2;
	}
}
