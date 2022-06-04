package dsa_samples;

public class Recursion1 {

	public static void main(String args[]) {
		Recursion1 obj = new Recursion1();
		int val = obj.getSum(5);
		System.out.println("Sum : " + val);
		int val2 = obj.get2fact(4);
		System.out.println("Fact of 2 : " + val2);
	}

	public int getSum(int n) {
		if (n == 1)
			return 1;
		int res = n + getSum(n - 1);
		return res;
	}

	public int get2fact(int n) {
		if (n == 1)
			return 2;
		int res = 2 * get2fact(n - 1);
		return res;
	}
}
