package dsa_samples;

public class StaircaseProblem {

	public static void main(String args[]) {
		Recursion1 obj = new Recursion1();
		int val = obj.getSum(6);
		System.out.println("Sum : " + val);
	}

	public int getSum(int n) {
		if (n == 1 || n == 2)
			return n; 
		int res = getSum(n - 1) +  getSum(n - 2);
		return res;
	}
}
