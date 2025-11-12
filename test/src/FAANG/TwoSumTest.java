package FAANG;

import SolveDSAProblems.FAANG.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest{

    @Test
    public void twoSumSuccess(){
      int[] numbs = {2,7,11,13};
      int target = 9;
      int[] expected = {0,1};
      assertArrayEquals(expected, TwoSum.twoSum(numbs,target));
    }

    @Test
    void testDifferentOrder() {
        int[] input = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, TwoSum.twoSum(input, target));
    }

    @Test
    void testNoMatchFound() {
        int[] input = {1, 2, 3};
        int target = 10;
        int[] result = TwoSum.twoSum(input, target);
        assertEquals(0, result.length, "Should return empty array when no pair found");
    }

}