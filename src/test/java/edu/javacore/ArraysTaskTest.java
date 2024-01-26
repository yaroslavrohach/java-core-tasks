package edu.javacore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTaskTest {

    private final ArraysTask unit = new ArraysTask();

    @Test
    void increaseBy2() {
        int[] actual = unit.increaseBy2(new int[]{1, 2, -5, 7, 0, 6});
        int[] expected = {3, 4, -5, 9, 2, 8};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findFirstNumber() {
        double actual = unit.findFirstNumber(new double[]{3, 5.5, 4.235, 1.7});
        assertEquals(1.7, actual);
    }

    @Test
    void arithmeticalMean() {
        double actual = unit.arithmeticalMean(new double[]{1.5, -3.8, -5, 2, 1, 0});
        assertEquals(1.5, actual);
    }

    @ParameterizedTest
    @MethodSource(value = "arraysForFindMaxTest")
    void findMax(int[] arr) {
        int actual = unit.findMax(arr);
        assertEquals(8, actual);
    }

    @Test
    void findMaxForNegativeValues() {
        int actual = unit.findMax(new int[]{-2, -4, -1});
        assertEquals(-1, actual);
    }

    private static Stream<int[]> arraysForFindMaxTest() {
        return Stream.of(new int[]{2, 3, 8}, new int[]{2, 8, 3}, new int[]{8, 3, 2});
    }

    @Test
    void arithmeticalMeanWithoutPositiveValues() {
        double actual = unit.arithmeticalMean(new double[]{-1.5, -3.8, -5, -2, -1, 0});
        assertEquals(0, actual);
    }


    @Test
    void maxOfAbsoluteValuePositive() {
        double actual = unit.maxOfAbsoluteValues(new double[]{1, 3, 2.2, -5, 18, -10.8, 22.5});
        assertEquals(22.5, actual);
    }

    @Test
    void maxOfAbsoluteValueNegative() {
        double actual = unit.maxOfAbsoluteValues(new double[]{-1, 2.7, 2.2, -5, -18.1, -10.8, 12.6});
        assertEquals(-18.1, actual);
    }

    @Test
    void negativeElementSum() {
        double actual = unit.negativeElementsSum(new double[]{-4, 5, 3, 2.2, -3.8, -8.1, 4.8});
        assertEquals(-15.9, actual, 0.01);
    }

    @Test
    void reverseArrayEvenElements() {
        int[] actual = unit.reverseArray(new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{4, 3, 2, 1}, actual);
    }

    @Test
    void reverseArrayNotEvenElements() {
        int[] actual = unit.reverseArray(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, actual);
    }

}