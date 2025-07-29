package SolveDSAProblems.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class ListOfDistElementInWindow {
    public static void main(String[] args) {
        int[] input = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        countDistinct(input, k);
    }

    private static void countDistinct(int[] input, int k) {
        Map<Integer, Integer> distElements = new HashMap<>();
        for(int i=0; i <k; i++){
            distElements.put(input[i], distElements.getOrDefault(input[i], 0)+1);
        }
        System.out.println(distElements.size());

        for(int j =k; j <input.length; j++){
            int oldElement = input[j-k];
            distElements.put(oldElement, distElements.get(oldElement)-1);
            if(distElements.get(oldElement) ==0){
                distElements.remove(oldElement);
            }
            int newElement = input[j];
            distElements.put(newElement, distElements.getOrDefault(newElement, 0)+1);
            System.out.println(distElements.size());

        }
    }
}
