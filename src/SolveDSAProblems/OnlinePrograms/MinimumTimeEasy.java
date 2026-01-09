package SolveDSAProblems.OnlinePrograms;

public class MinimumTimeEasy {
    /*Minimum Time to Deliver Orders
    You’re given delivery times of rides and
    must determine the minimum time required to fulfill N orders.*/
    public static void main(String[] args) {
        int[] times = {1 ,3, 4};
        int n = 10;
        System.out.println(minTime(times, n));
    }

    private static int minTime(int[] times, int n) {
      int time =0;
      while(true){
          int orders =0;
          for(int t: times){
              orders += time / t;
          }
          if(orders >= n){
             return time;
          }
         time++;
      }
    }
}
