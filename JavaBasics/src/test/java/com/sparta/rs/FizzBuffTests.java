package com.sparta.rs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuffTests {
    // Print numbers in order
    // if the number is divisible by 3 print "Fizz"
    // if the number is dividable by 5 print "Buzz"
    // it the number is divisible by both print "FizzBuzz"
    @Test
    @DisplayName("if we get number 1, then print 1")
    void GivenAnInputOfOneFizzBuzzReturnsOne() {
        // arrange
        int input = 1;
        String expected = "1";

        // act
        String actual = FizzBuzz.getFizBuzzNumberFrom(input);

        // assert
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"2, 2",
                "4, 4",
                "7, 7"})
    void GivenInputNotDivisibleByThreeOrFiveFizzBuzzReturnsThatNumber(int input, String expected){
        String actual = FizzBuzz.getFizBuzzNumberFrom(input);

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @ValueSource(ints = {3,6,9})
    void givenInputThreePrintFizz(int input) {
        String expected = "Fizz";

        String actual = FizzBuzz.getFizBuzzNumberFrom(input);

        Assertions.assertEquals(expected, actual);

    }
    @ParameterizedTest
    @CsvSource({"5, Buzz",
                "10, Buzz",
                "20, Buzz"})
    void givenANumberDivisibleByFiveButNotThreePrintBuzz(int input, String expected){
        String actual = FizzBuzz.getFizBuzzNumberFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"15, FizzBuzz",
                "30, FizzBuzz",
                "45, FizzBuzz"})
    void givenANumberDivisibleByThreeAndFivePrintFizzBuzz(int input, String expected){
        String actual = FizzBuzz.getFizBuzzNumberFrom(input);

        Assertions.assertEquals(expected, actual);
    }
}
