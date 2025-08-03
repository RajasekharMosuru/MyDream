package SolveDSAProblems.Top40;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumresponse(nums, target);
        System.out.println("Target matches at the indices ["+result[0]+ "," +result[1]+"]" );
    }
    private static int[] twoSumresponse(int[] nums, int target) {
        Map<Integer, Integer> targetMap = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            int findValue = target - nums[i];
            if(targetMap.containsKey(findValue)){
                return new int[] {targetMap.get(findValue), i};
            }
            targetMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
