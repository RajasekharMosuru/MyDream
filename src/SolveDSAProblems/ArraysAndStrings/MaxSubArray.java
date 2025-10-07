package SolveDSAProblems.ArraysAndStrings;

public class MaxSubArray {
    //kadane's algorithm
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = maxSubArray(arr);
        System.out.println("Here is the MaxSubArray   " + result);
    }

    private static int maxSubArray(int[] arr) {
        int maxSoFar = arr[0];
        int finalMax = arr[0];
        for(int i =1; i < arr.length; i++){
            maxSoFar = Math.max(arr[i], maxSoFar + arr[i]);
            finalMax = Math.max(maxSoFar, finalMax);
        }
        return finalMax;
    }
}
