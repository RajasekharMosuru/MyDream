package SolveDSAProblems;
import java.util.HashMap;
import java.util.Map;
public class LongestNonRepeatedString {
    public static void main(String[] args) {
        String str = "sunilkumarmishra";
        System.out.println("Length of longest substring => "+longestSubstringWithoutRepeatingChars(str));

    }
    private static int longestSubstringWithoutRepeatingChars(String str) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();

        for(int right=0; right<str.length(); right++) {
            char curentChar = str.charAt(right);

            if(countMap.containsKey(curentChar) && countMap.get(curentChar)>=left) {
                left = countMap.get(curentChar) + 1;
            }

            countMap.put(curentChar, right);
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}
