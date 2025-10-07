package SolveDSAProblems.ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

    public class PalindromeSubStrings {
        public static void main(String[] args) {
            String input = "abbaeae";
            List<String> palindromes = findAllPalindromes(input);

            System.out.println("Input: " + input);
            System.out.println("Palindromic Substrings: " + palindromes);
            System.out.println("Count: " + palindromes.size());
        }
        public static List<String> findAllPalindromes(String s) {
            List<String> result = new ArrayList<>();
            if (s == null || s.isEmpty()) {
                return result;
            }

            for (int i = 0; i < s.length(); i++) {
                // Case 1: Odd length palindromes, with a single center character
                expandAndCollect(s, i, i, result);

                // Case 2: Even length palindromes, with a two-character center
                expandAndCollect(s, i, i + 1, result);
            }
            return result;
        }

        private static void expandAndCollect(String s, int left, int right, List<String> result) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                result.add(s.substring(left, right + 1));
                left--;
                right++;
            }
        }
    }
