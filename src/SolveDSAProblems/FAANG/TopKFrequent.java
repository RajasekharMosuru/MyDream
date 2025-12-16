package SolveDSAProblems.FAANG;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3}, 2)));
    }

    private static int[] topKFrequent(int[] ints, int frequency) {
        Map<Integer,Integer> freMap = new HashMap<>();
        for(int num:ints){
                freMap.put(num, freMap.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(Map.Entry<Integer,Integer> e: freMap.entrySet()){
            pq.offer(new int[]{e.getKey(), e.getValue()});
        }
        int[] res = new int[frequency];
        for(int j=0; j<frequency; j++){
         res[j] = Objects.requireNonNull(pq.poll())[0];
        }
        return res;
    }
}
