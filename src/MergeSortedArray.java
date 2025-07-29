import java.util.*;

public class MergeSortedArray {
    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int m = 3;
        int n = 3;
        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (A[i] < B[j]) {
                merged[k++] = A[i++];
            } else if (A[i] > B[j]) {
                merged[k++] = B[j++];
            } else { // If both elements are equal
                merged[k++] = A[i++];
                merged[k++] = B[j++];
            }
        }

        while (i < m) {
            merged[k++] = A[i++];
        }

        while (j < n) {
            merged[k++] = B[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5, 6};
        int[] C = mergeSortedArrays(A, B);

        System.out.print("Merged sorted array: ");
        for (int num : C) {
            System.out.print(num + " ");
        }
    }
}
