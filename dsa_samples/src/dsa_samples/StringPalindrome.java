package dsa_samples;

public class StringPalindrome {

	public static void main(String args[]) {
		StringPalindrome obj = new StringPalindrome();
		String val = "abbac";
		boolean check = obj.check(val , 0 , val.length() -1);
		System.out.println(check);
	}
	
	boolean check(String val, int start , int end) {
		if (start >= end)
			return true;
		if (val.charAt(start) != val.charAt(end) )
			return false;
		return  check(val, start + 1, end -1);
	}
}
