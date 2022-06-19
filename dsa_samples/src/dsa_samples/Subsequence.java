package dsa_samples;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
	
	// DYNAMIC PROGRAMMING
	// Contagious and non contagious
	// even empty string is a subsequence
	// we do not take empty value in power set
	// we have two condition - take, not take
	// todo : try code
	
	static void helper (String s , String temp , int i) {
		
		if (s.length() == i ) {
			System.out.print(temp + " ");
			return;
		}
	
	// take 
	helper(s, temp + s.charAt(i), i+1);
	
	// not take 
	helper(s, temp, i+1);
	}
	
	
	public static List<String> getVal(String s) {
		List<String> ans = new ArrayList<String>();
		helper(s, "", 0);
		return ans;
	}
	
	public static void main (String args[]) {
		getVal("abc");
	}
}
