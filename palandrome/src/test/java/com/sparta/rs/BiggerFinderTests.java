package com.sparta.rs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerFinderTests {

    @Test
    void givenThereAreNoInputsReturnShouldBeTheSameString() {
        String[] input = new String[]{};
        String expected = "There is no palindrome here";

        String actual = BiggerFinder.big(input);

        Assertions.assertEquals(expected, actual);
    }
}
