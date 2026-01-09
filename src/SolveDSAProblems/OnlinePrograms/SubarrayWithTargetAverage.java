package SolveDSAProblems.OnlinePrograms;

import java.util.HashSet;
import java.util.Set;

//Subarray with Target
//        Average Given an array and a target average,
//        find if any contiguous subarray has that exact average.
public class SubarrayWithTargetAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double target = 3.0;
        System.out.println(hasAverageTarget(arr, target));
    }

    private static boolean hasAverageTarget(int[] arr, double target) {
        Set<Double> avgSet = new HashSet<>();
        double prefix = 0.0;
        for(int num : arr){
            prefix += num - target;
            if(avgSet.contains(prefix)){
                return true;
            }
            avgSet.add(prefix);

        }
        return false;
    }
}
