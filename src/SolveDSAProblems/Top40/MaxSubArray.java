package SolveDSAProblems.Top40;

public class MaxSubArray {
    //kadane's algorithm
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = maxSubArrayCalculate(arr);
        System.out.println(result);
    }
    private static int maxSubArrayCalculate(int[] arr) {
        int maxSoFar = arr[0];
        int finalMax = arr[0];
        for(int i =1; i < arr.length; i++){
             maxSoFar = Math.max(arr[i],  maxSoFar + arr[i]);
             finalMax = Math.max(finalMax, maxSoFar);
        }
    return finalMax;
    }
}
