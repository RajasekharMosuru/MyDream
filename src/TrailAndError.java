import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TrailAndError {
    public static void main(String[] args) {
        String s = "aabbcddeef";
        String ss = "aabbccddeeff";
        String sss = "";
        firstNonRepeatedChar(s);
        firstNonRepeatedChar(ss);
        firstNonRepeatedChar(sss);
    }
    private static void firstNonRepeatedChar(String s) {
        if(s != null || s.isEmpty()){
            System.out.println("String is empty");
        }
        Map<Character, Integer> charMap = new HashMap<>();
        for(char c : s.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c, 0)+1);
        }
        for(char ch: s.toCharArray()){
            if(charMap.get(ch) == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}
