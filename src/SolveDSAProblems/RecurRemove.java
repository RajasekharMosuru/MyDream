package SolveDSAProblems;

//Recursively remove all adjacent duplicates in a string
public class RecurRemove {
    public static void main(String args[]){
        System.out.println(removeAdjDupStr("aabbccdde"));
        System.out.println(removeAdjDupStr("aaaaa"));
        System.out.println(removeAdjDupStr("aabccbaaa"));
        System.out.println(removeAdjDupStr("ababab"));
        System.out.println(removeAdjDupStr("aabcaabbc"));
        System.out.println(removeAdjDupStr(""));
        System.out.println(removeAdjDupStr("z"));
        System.out.println(removeAdjDupStr("xxxyyyzzzxxxyyyzzz"));
        System.out.println(removeAdjDupStr("aabbaa"));
    }

    private static String removeAdjDupStr(String str) {

        if (str == null || str.length() <= 1) {
            return str;  // Base case: if the string is empty or has only one character
        }
        StringBuilder sb = new StringBuilder();
        boolean foundDuplicate = false;
        for(int i=0; i< str.length(); i++){
            if(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                sb.append(str.charAt(i));
                while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                    i++;
                }
                foundDuplicate = true;
            } else{
                sb.append(str.charAt(i));
            }
        }
        String result = sb.toString();
        return foundDuplicate? removeAdjDupStr(result): result;
    }
}
