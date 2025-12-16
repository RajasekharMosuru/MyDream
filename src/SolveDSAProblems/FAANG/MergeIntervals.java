package SolveDSAProblems.FAANG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] mergableValues = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(mergableValues)));
    }

    public static int[][] merge(int[][] mergableValues) {
        if (mergableValues == null || mergableValues.length == 0) {
            return new int[0][];
        }
        Arrays.sort(mergableValues, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int[] current = mergableValues[0];
        for(int i=1; i< mergableValues.length; i++){
            if(mergableValues[i][0] <= current[1]){
             current[1] = Math.max(current[1], mergableValues[i][1]);
            }else{
                result.add(current);
                current = mergableValues[i];
            }
        }
        result.add(current);
        return result.toArray(new int[0][]);
    }
}
