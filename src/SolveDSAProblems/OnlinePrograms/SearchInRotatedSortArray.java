package SolveDSAProblems.OnlinePrograms;

public class SearchInRotatedSortArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.println("Output: " + search(nums, target));  // Output: -1

        int[] nums2 = {4,5,6,7,0,1,2};
        int target2 = 0;
        System.out.println("Output: " + search(nums2, target2)); // Output: 4

    }

    private static int search(int[] numArr, int target2) {

        int left = 0;
        int right = numArr.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target2 == numArr[mid]){
                return mid;
            }
            if(numArr[left] <= numArr[mid] ){
                if(target2 < numArr[mid] && target2 >= numArr[left]){
                  right = mid-1;
                } else{
                    left =  mid +1;
                }
            }else{
                if(target2 < numArr[right] && target2 >= numArr[mid]){
                    left =  mid +1;
                } else{
                    right = mid-1;
                }
            }
        }


        return -1;
    }
}
