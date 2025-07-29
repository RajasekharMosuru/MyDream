package SolveDSAProblems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "programming";
        findAndCountDuplicates(inputString);
    }

    private static void findAndCountDuplicates(String inputString) {
        HashMap<Character, Integer> mapCount= new HashMap<>();
        for(char c: inputString.toCharArray()){
            mapCount.put(c, mapCount.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entryMap: mapCount.entrySet()){
            if(entryMap.getValue() >1){
                System.out.println("Character +" +entryMap.getKey()+ "Times" +entryMap.getValue());
            }
        }
    }
}
