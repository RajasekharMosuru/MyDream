package SolveDSAProblems;

public class BuySellStock {
    //Input: prices = [7,1,5,3,6,4]
    //Output: 5
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfitGain(prices);
        System.out.println("Max achievable profit is " +profit);
    }

    private static int maxProfitGain(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int profit = 0;
        for(int price: prices){
            if(price < minimum){
               minimum = price;
            } else if (price-minimum > profit) {
                profit = price-minimum;
            }
        }
        return profit;
    }
}
