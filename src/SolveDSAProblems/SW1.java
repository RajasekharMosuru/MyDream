package SolveDSAProblems;
//Count Distinct elements in each window of size K

import java.util.HashMap;
import java.util.Map;
public class SW1 {


    public class SlidingWindowDistinctCount {

        // Function to count distinct elements in each window of size K
        public static void countDistinctInWindows(int[] arr, int K) {
            if (arr == null || arr.length == 0 || K <= 0 || K > arr.length) {
                throw new IllegalArgumentException("Invalid input");
            }

            // Map to store the count of each element in the current window
            Map<Integer, Integer> countMap = new HashMap<>();
            int distinctCount = 0;

            // Initialize the first window
            for (int i = 0; i < K; i++) {
                if (countMap.containsKey(arr[i])) {
                    countMap.put(arr[i], countMap.get(arr[i]) + 1);
                } else {
                    countMap.put(arr[i], 1);
                    distinctCount++;
                }
            }

            // Print the count of distinct elements in the first window
            System.out.println("Distinct count in window 1: " + distinctCount);

            // Slide the window over the rest of the array
            for (int i = K; i < arr.length; i++) {
                // Element to be removed from the window
                int elementToRemove = arr[i - K];
                // Element to be added to the window
                int elementToAdd = arr[i];

                // Remove the element going out of the window
                if (countMap.containsKey(elementToRemove)) {
                    int count = countMap.get(elementToRemove);
                    if (count == 1) {
                        countMap.remove(elementToRemove);
                        distinctCount--;
                    } else {
                        countMap.put(elementToRemove, count - 1);
                    }
                }

                // Add the new element coming into the window
                if (countMap.containsKey(elementToAdd)) {
                    countMap.put(elementToAdd, countMap.get(elementToAdd) + 1);
                } else {
                    countMap.put(elementToAdd, 1);
                    distinctCount++;
                }

                // Print the count of distinct elements in the current window
                System.out.println("Distinct count in window " + (i - K + 2) + ": " + distinctCount);
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 1, 3, 4, 2, 3, 5};
            int K = 4;

            System.out.println("Array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Distinct elements count in each window of size " + K + ":");
            countDistinctInWindows(arr, K);
        }
    }

}
