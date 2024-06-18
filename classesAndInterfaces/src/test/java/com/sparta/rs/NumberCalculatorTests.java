package com.sparta.rs;

import NumberCode.NumberCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberCalculatorTests {

    @ParameterizedTest
    @CsvSource({"1,2,3,4, 1234",
                "1,1,1,1, 1111",
                "9,9,9,9, 9999"})
    void GivenArrayThatDoesNotStartWithAZeroReturnArrayAsInt(int num1,int num2, int num3, int num4, int expected){
        int actual = NumberCalculator.getCalculatedValue(new int[]{num1, num2, num3, num4});

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,2,3,4, 234",
                "0,1,1,1, 111",
                "0,9,9,9, 999"})
    void GivenArrayThatDoesStartWithAZeroReturnArrayAsInt(int num1,int num2, int num3, int num4, int expected){
        int actual = NumberCalculator.getCalculatedValue(new int[]{num1, num2, num3, num4});

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"0,0,3,4, 34",
                "0,0,1,1, 11",
                "0,0,9,9, 99"})
    void GivenArrayThatDoesNotStartWithAZeroAndNum2IsZeroReturnArrayAsInt(int num1,int num2, int num3, int num4, int expected){
        int actual = NumberCalculator.getCalculatedValue(new int[]{num1, num2, num3, num4});

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,0,0,4, 4",
                "0,0,0,1, 1",
                "0,0,0,9, 9"})
    void GivenArrayThatDoesStartWithAZeroAndNum2andNum3AreAlsoZeroReturnArrayAsInt(int num1,int num2, int num3, int num4, int expected){
        int actual = NumberCalculator.getCalculatedValue(new int[]{num1, num2, num3, num4});

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,0,0,0, 0"})
    void GivenArrayHaveAllZerosReturnOnlyOneZero(int num1,int num2, int num3, int num4, int expected){
        int actual = NumberCalculator.getCalculatedValue(new int[]{num1, num2, num3, num4});

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"1,0,3,4, 1034",
              "1,1,0,1, 1101",
              "9,9,9,0, 9990"})
    void GivenThereIsAZeroAnyWhereButTheFirstNumReturnTheWholeNum(int num1,int num2, int num3, int num4, int expected){
        int actual = NumberCalculator.getCalculatedValue(new int[]{num1, num2, num3, num4});

        Assertions.assertEquals(expected, actual);
    }

}
