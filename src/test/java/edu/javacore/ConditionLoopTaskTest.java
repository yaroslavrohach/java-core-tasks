package edu.javacore;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionLoopTaskTest {

    private final ConditionLoopTask unit = new ConditionLoopTask();

    @Nested
    class LevelEducationAchievementsTest {

        @ParameterizedTest
        @ValueSource(ints = {1, 2, 3})
        void levelEducationAchievementsInitialLevel(int grade) {
            String actual = unit.levelEducationAchievements(grade);
            assertEquals("Initial", actual);
        }

        @ParameterizedTest
        @ValueSource(ints = {4, 5, 6})
        void levelEducationAchievementsAverageLevel(int grade) {
            String actual = unit.levelEducationAchievements(grade);
            assertEquals("Average", actual);
        }

        @ParameterizedTest
        @ValueSource(ints = {7, 8, 9})
        void levelEducationAchievementsSufficientLevel(int grade) {
            String actual = unit.levelEducationAchievements(grade);
            assertEquals("Sufficient", actual);
        }

        @ParameterizedTest
        @ValueSource(ints = {10, 11, 12})
        void levelEducationAchievementsHighLevel(int grade) {
            String actual = unit.levelEducationAchievements(grade);
            assertEquals("High", actual);
        }
    }

    @Nested
    class SeasonTest {

        @ParameterizedTest
        @ValueSource(ints = {1, 2, 12})
        void seasonWinter(int month) {
            String actual = unit.season(month);
            assertEquals("Winter", actual);
        }

        @ParameterizedTest
        @ValueSource(ints = {3, 4, 5})
        void seasonSpring(int month) {
            String actual = unit.season(month);
            assertEquals("Spring", actual);
        }

        @ParameterizedTest
        @ValueSource(ints = {6, 7, 8})
        void seasonSummer(int month) {
            String actual = unit.season(month);
            assertEquals("Summer", actual);
        }

        @ParameterizedTest
        @ValueSource(ints = {9, 10, 11})
        void seasonAutumn(int month) {
            String actual = unit.season(month);
            assertEquals("Autumn", actual);
        }
    }

    @Nested
    class CompactDiscsTest {

        @Test
        void compactDiscsLessThan20() {
            int actual = unit.compactDiscs(10);
            assertEquals(20, actual);
        }

        @Test
        void compactDiscsForSmallPack() {
            int actual = unit.compactDiscs(20);
            assertEquals(30, actual);
        }

        @Test
        void compactDiscsForMoreThanSmallPack() {
            int actual = unit.compactDiscs(25);
            assertEquals(40, actual);
        }

        @Test
        void compactDiscsTwoSmallPacks() {
            int actual = unit.compactDiscs(40);
            assertEquals(60, actual);
        }

        @Test
        void compactDiscsMoreThanTwoSmallPacks() {
            int actual = unit.compactDiscs(50);
            assertEquals(80, actual);
        }

        @Test
        void compactDiscsBigPack() {
            int actual = unit.compactDiscs(100);
            assertEquals(100, actual);
        }

        @Test
        void compactDiscsMoreThanBigPack() {
            int actual = unit.compactDiscs(102);
            assertEquals(104, actual);
        }

        @Test
        void compactDiscsSmallAndBigPack() {
            int actual = unit.compactDiscs(120);
            assertEquals(130, actual);
        }

        @Test
        void compactDiscsMoreThanSmallAndBigPack() {
            int actual = unit.compactDiscs(125);
            assertEquals(140, actual);
        }
    }

    @Nested
    class WhichQuarterTest {

        @Test
        void whichQuarterFirstQuarter() {
            int actual = unit.whichQuarter(2, 3);
            assertEquals(1, actual);
        }

        @Test
        void whichQuarterSecondQuarter() {
            int actual = unit.whichQuarter(-2, 5);
            assertEquals(2, actual);
        }

        @Test
        void whichQuarterThirdQuarter() {
            int actual = unit.whichQuarter(-1, -7);
            assertEquals(3, actual);
        }

        @Test
        void whichQuarterFourthQuarter() {
            int actual = unit.whichQuarter(5, -1);
            assertEquals(4, actual);
        }

        @Test
        void whichQuarterOnXLine() {
            int actual = unit.whichQuarter(-2, 0);
            assertEquals(0, actual);
        }

        @Test
        void whichQuarterOnYLine() {
            int actual = unit.whichQuarter(0, 3);
            assertEquals(0, actual);
        }
    }

    @Nested
    class FirstOrLastTest {

        @Test
        void firstOrLastFirstBigger() {
            String actual = unit.firstOrLast(123);
            assertEquals("3", actual);
        }

        @Test
        void firstOrLastLastBigger() {
            String actual = unit.firstOrLast(721);
            assertEquals("7", actual);
        }

        @Test
        void firstOrLastEqual() {
            String actual = unit.firstOrLast(525);
            assertEquals("=", actual);
        }
    }

    @Nested
    class MedianNumberTest {

        @Test
        void medianNumberFirstNumber() {
            int actual = unit.medianNumber(4, 1, 28);
            assertEquals(4, actual);
        }

        @Test
        void medianNumberSecondNumber() {
            int actual = unit.medianNumber(2, 5, 28);
            assertEquals(5, actual);
        }

        @Test
        void medianNumberThirdNumber() {
            int actual = unit.medianNumber(2, 55, 3);
            assertEquals(3, actual);
        }
    }

    @Nested
    class ProductOfDigitTest {

        @Test
        void productOfDigits() {
            int actual = unit.productOfDigits(257);
            assertEquals(70, actual);
        }
    }

    @Nested
    class NumberOfDigitsTest {

        @Test
        void numberOfDigitsOneDigit() {
            int actual = unit.numberOfDigits(3);
            assertEquals(1, actual);
        }

        @Test
        void numberOfDigitsTwoDigits() {
            int actual = unit.numberOfDigits(34);
            assertEquals(2, actual);
        }

        @Test
        void numberOfDigitsThreeDigits() {
            int actual = unit.numberOfDigits(934);
            assertEquals(3, actual);
        }
    }

}