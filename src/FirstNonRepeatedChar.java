import java.util.*;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "maharajahs rumours";
        Character nonRepeatedChar = theNonRepeatedCharactor(str);
        if(nonRepeatedChar == null){
            System.out.println("No non-repeated characters");
        } else {
            System.out.println("Second non-repeated char..   " +nonRepeatedChar);
        }

    }

    public static Character theNonRepeatedCharactor(String charValue) {
        if (charValue == null || charValue.isEmpty()) {
            return null;
        }
        char[] c = charValue.replaceAll("\\s+","").toCharArray();
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for(char ctr: c){
            charMap.put(ctr, charMap.getOrDefault(ctr,0)+1);
        }
        List<Character> secondindex = new ArrayList<>();
        for(Map.Entry<Character, Integer> output: charMap.entrySet()){
            if(output.getValue() == 1){
                secondindex.add(output.getKey());
            }
        }
        return secondindex.size() >= 2 ? secondindex.get(1) : null;
    }
}
