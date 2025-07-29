package SolveDSAProblems;

public class BinarySearch {

    public static void main(String[] args){

        int[] Array = {2,4,6,8,10,12,14,15,17,18,20};
        int value = 8;
        int result = binarySearAlgo(Array, value);
        if(result == -1){
            System.out.println("Target value not found");
        } else{
            System.out.println("Here is the target value "+ result);
        }

    }

    private static int binarySearAlgo(int[] array, int value) {
        int low = 0;
        int high = array.length-1;

        while(low <= high){
            int mid = low+ (high-low)/2;
            if(array[mid] == value){
               return mid;
            }

            if(array[mid] > value){
                high = mid -1;
            }else{
                low = low+1;
            }

        }
        return -1;
    }
}
