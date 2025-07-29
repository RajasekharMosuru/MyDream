package SolveDSAProblems;

public class MaxSubArrayWithIndex {
        public static void main(String[] args) {
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

            Result result = findMaxSubarray(nums);

            System.out.println("Maximum Sum: " + result.maxSum);
            System.out.println("Start Index: " + result.start);
            System.out.println("End Index: " + result.end);
        }
        static class Result {
            int maxSum;
            int start;
            int end;
            Result(int maxSum, int start, int end) {
                this.maxSum = maxSum;
                this.start = start;
                this.end = end;
            }
        }

        public static Result findMaxSubarray(int[] nums) {
            int maxSoFar = nums[0];
            int maxEndingHere = nums[0];
            int start = 0, tempStart = 0, end = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > maxEndingHere + nums[i]) {
                    maxEndingHere = nums[i];
                    tempStart = i;
                } else {
                    maxEndingHere += nums[i];
                }
                if (maxEndingHere > maxSoFar) {
                    maxSoFar = maxEndingHere;
                    start = tempStart;
                    end = i;
                }
            }
            return new Result(maxSoFar, start, end);
        }
}