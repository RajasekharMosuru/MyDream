package SolveDSAProblems;

public class QuickSort {
    public static void main(String[] args){
        int[] nums = {12,13,4,7,9,1,3,48,26,19};
        int low =0;
        int high= nums.length-1;
        System.out.println("Before sort..."+nums);
        quickSortAlgo(nums, low, high);
        System.out.println("After sort..."+nums);
    }

    private static void quickSortAlgo(int[] nums, int low, int high) {
        int pivot = partition(nums, low, high);
        quickSortAlgo(nums, low, pivot-1);
        quickSortAlgo(nums,pivot+1, high);
    }

    private static int partition(int[] nums, int low, int high) {
        return low;
    }
}
