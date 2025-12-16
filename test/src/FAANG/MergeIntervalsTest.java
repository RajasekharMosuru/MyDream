package FAANG;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import SolveDSAProblems.FAANG.MergeIntervals;

public class MergeIntervalsTest {

    @Test
    void testBasicOverlap() {
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        int[][] expected = {{1,6},{8,10},{15,18}};
        assertArrayEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    void testFullyContainedIntervals() {
        int[][] input = {{1,10},{2,3},{4,8}};
        int[][] expected = {{1,10}};
        assertArrayEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    void testNonOverlapping() {
        int[][] input = {{1,2},{3,4},{5,6}};
        int[][] expected = {{1,2},{3,4},{5,6}};
        assertArrayEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    void testTouchingEndpoints() {
        int[][] input = {{1,2},{2,3},{3,4}};
        int[][] expected = {{1,4}};
        assertArrayEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    void testSingleInterval() {
        int[][] input = {{5,10}};
        int[][] expected = {{5,10}};
        assertArrayEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    void testUnsortedInput() {
        int[][] input = {{5,7},{1,3},{2,6}};
        int[][] expected = {{1,7}};
        assertArrayEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    void testOverlappingChain() {
        int[][] input = {{1,4},{2,5},{5,8},{7,10}};
        int[][] expected = {{1,10}};
        assertArrayEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    void testEmptyInput() {
        int[][] input = {};
        int[][] expected = {};
        assertArrayEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    void testSameStartIntervals() {
        int[][] input = {{1,4},{1,5},{1,3}};
        int[][] expected = {{1,5}};
        assertArrayEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    void testMixedOverlaps() {
        int[][] input = {{1,4},{2,5},{8,10},{9,11},{15,18}};
        int[][] expected = {{1,5},{8,11},{15,18}};
        assertArrayEquals(expected, MergeIntervals.merge(input));
    }
}