package SolveDSAProblems.FAANG;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbs = {2, 7, 11, 17};
        int[] result = twoSum(numbs, 9);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbs, int target) {
        Map<Integer, Integer> returnMap = new HashMap<>();
        for(int i=0; i< numbs.length; i++){
            int outcome = target - numbs[i];
             if(returnMap.containsKey(outcome)){
               return new int[] {returnMap.get(outcome), i};
             }
             returnMap.put(numbs[i], i);
        }
            return new int[]{};
    }
}
