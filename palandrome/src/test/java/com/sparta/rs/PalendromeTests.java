package com.sparta.rs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PalendromeTests {
    @ParameterizedTest
    @CsvSource({"Madam, true",
                "racecar, true",
                "kayak, true"})

    void IfTheItemsArePalendromesReturnTrue(String name, boolean expected){
        boolean actual = Palendrome.palandrome(name);

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({"Ma, false",
                "ra, false",
                "ka, false"})

    void IfTheItemsAreLessThenThreeReturnFalse(String name, boolean expected){
        boolean actual = Palendrome.palandrome(name);

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({"null, false",
                "null, false",
                "null, false"})

    void IfTheInputIsNullReturnFalse(String input,boolean expected){
        boolean actual = Palendrome.palandrome(input);

        Assertions.assertEquals(expected,actual);
    }

}
