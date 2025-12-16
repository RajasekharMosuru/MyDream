package SolveDSAProblems.FAANG;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String nonRepChar = nonRepeatedChar(s);
        System.out.println("nonRepChar...."+ nonRepChar);
        System.out.println("nonRepCharLength...."+ nonRepChar.length());
    }

    private static String nonRepeatedChar(String s) {
        int left = 0; int max = 0; int start =0;
        Set<Character> charSet = new HashSet<>();
        for(int right =0; right < s.length(); right++){
           while(charSet.contains(s.charAt(right))){
             charSet.remove(s.charAt(left++));
           }
           charSet.add(s.charAt(right));
           max = Math.max(max, (right-left+1));

           if(right-left+1 > max){
           max = right-left+1;
           start =left;
           }
        }
        return s.substring(start,start+max);
    }
}
