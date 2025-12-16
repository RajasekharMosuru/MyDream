package SolveDSAProblems.FAANG;

public class PeakElement {
    //input = [1,2,3,1] , output = 2 (As peek value is 3 and its index is 2).
    public static void main(String[] args) {
       // System.out.println(findPeekElement(new int[]{1,2,3,1}));
        System.out.println(findPeekElement(new int[]{1, 3, 5, 4, 2}));
        System.out.println(findPeekElement(new int[]{10, 5, 2, 1}));
    }

    private static int findPeekElement(int[] ints) {
        int left = 0;
        int right = ints.length-1;
        while (left < right){
         int mid = (left + right)/2;
         if(ints[mid] > ints[mid +1]){
           right = mid;
         } else{
             left = mid + 1;
         }
        }
        return left;
    }
}
