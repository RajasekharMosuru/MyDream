package SolveDSAProblems.FAANG;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        productOfGivenInts(new int[]{1,2,3,4});
    }

    private static void productOfGivenInts(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = 1;
        for(int i=1; i < nums.length;i++){
            arr[i] = arr[i-1] * nums[i-1];
        }
        int right =1;
        for(int i = nums.length -1; i >=0; i--){
            arr[i] = arr[i] * right;
            right = right*nums[i];
        }
        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
    }
}
