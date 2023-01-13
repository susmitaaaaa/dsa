package dsa_samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetArray {

	public static List<List<String>> ansVal = new ArrayList();
	public static void main(String args[]) {
		List<String> s = new ArrayList();
		s.add("1");
		s.add("2");
		s.add("3");
		for (String val : s) {
			System.out.print(val + " ");
		}
		System.out.println();
		List<List<String>> ans = findval(s);
		
	}
	public static List<List<String>> findval(List<String> s) {
//		String[] s = {"1","2","3"};
		
		List<String> temp = new ArrayList();
		System.out.println("s size: "+s.size());
		System.out.println("temp size: "+temp.size());
		helper(s, temp, 0);
		return ansVal;
	}
	public static void helper(List<String> s , List<String> temp , int i) {
		if (s.size() == i) {
			ansVal.add(temp);
			for (String val : temp) {
				System.out.print(val + " ");
			}
			System.out.println();			
			return ;
		}
//		System.out.println("inclusion ...");	
		temp.add(s.get(i));
		helper(s,temp,i+1 );		
		/*
		 * for (String val : temp) { System.out.print(val + " "); }
		 * System.out.println(); System.out.println("exclusion ...");
		 */

		temp.remove(temp.size() - 1);
		helper(s,temp,i+1 );
		
		/*
		 * for (String val : temp) { System.out.print(val + " "); }
		 * System.out.println();
		 */	
	}
}
