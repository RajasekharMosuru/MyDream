package Faang25;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        //Input:  "abcabcbb"
        //Output: 3   ("abc")
        String s = "abbcabcbb";
        longestSubString(s);
    }

    private static void longestSubString(String s) {
        int left =0, max =0;
        int start =0;
        Set<Character> longSubSet = new HashSet<>();
        for(int i=0; i < s.length();i++) {
            while (longSubSet.contains(s.charAt(i))) {
                longSubSet.remove(s.charAt(left));
                left++;
            }
            longSubSet.add(s.charAt(i));

            if (i - left + 1 > max) {
                max = i - left + 1;
                start = left;
            }
        }
        System.out.println(max);
        System.out.println(s.substring(start, start+max));

    }
}
