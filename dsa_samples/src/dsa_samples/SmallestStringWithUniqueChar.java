package dsa_samples;

import java.util.*;
 
public class SmallestStringWithUniqueChar {
 
    public static String minSubstr(String s[])
    {
        // Stores the concatenated string
        // of all the given strings
        String str = "";
 
        // Loop to iterate through all
        // the given strings
        for (int i = 0; i < s.length; i++) {
            str += s[i];
        }
 
        // Set to store the characters
        Set<Character> set
            = new HashSet<Character>();
 
        // Loop to iterate over all
        // the characters in str
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set.size());
       
        
        // Stores the required answer
        String res = "";
        Iterator<Character> itr
            = set.iterator();
 
        // Loop to iterate over the set
        while (itr.hasNext()) {
            res += itr.next();
        }
 
        // Return Answer
        return res;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String arr[]
            = new String[] { "your", "you",
                             "or", "yo" };
 
        System.out.println(minSubstr(arr));
        System.out.println(minSubstr(arr).length());

    }
}