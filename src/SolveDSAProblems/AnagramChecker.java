package SolveDSAProblems;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Are the strings anagrams (using count)? " + areAnagramsUsingCount(str1, str2));

    }

    private static Boolean areAnagramsUsingCount(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        int[] charCount = new int[26];
        for(char c: str1.toCharArray()){
            charCount[c - 'a']++;
        }
        for(char c: str2.toCharArray()){
            charCount[c - 'a']--;
        }
        for(int c: charCount){
            if( c != 0){
                return false;
            }
        }
        return true;
    }
    }
