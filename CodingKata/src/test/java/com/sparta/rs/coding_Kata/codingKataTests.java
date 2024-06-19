package com.sparta.rs.coding_Kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class codingKataTests {

    @ParameterizedTest
    @CsvSource({"1,2,3,3,3, true",
                "1,-2,-2,-2,1, true",
                "22,22,22,1,1, true"})
    void IfThereIsThreeOfTheSameValueReturnTrue(int num1, int num2, int num3, int num4, int num5, boolean expected) {
        boolean actual = codingKata.slidingWindow(new int[]{num1, num2, num3, num4, num5});

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"1,2,3,4,5, false",
                "1,1,2,2,3, false",
                "11,11,22,22,33, false"})
    void IfThereIsNotAtLeastThreeValueTheSameReturnFalse(int num1, int num2, int num3, int num4, int num5, boolean expected) {
        boolean actual = codingKata.slidingWindow(new int[]{num1, num2, num3, num4, num5});

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"false",
                "false",
                "false"})
    void IfThereAreNotValuesReturnFalse(boolean expected) {
        boolean actual = codingKata.slidingWindow(new int[]{});

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"2,2,false",
            "1,1, false",
            "1,2, false"})
    void IfThereAreNoMoreThenValuesReturnFalse(int num1, int num2, boolean expected) {
        boolean actual = codingKata.slidingWindow(new int[]{num1, num2});

        Assertions.assertEquals(expected, actual);
    }





}
