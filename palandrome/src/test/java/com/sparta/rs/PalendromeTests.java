package com.sparta.rs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class PalendromeTests {

    @Test
    void IfAnInputHasAtLeastOnePalindromeReturnThatPalindrome() {
        String[] expected = new String[]{"racecar"};
        String[] input = new String[]{"love", "my" ,"racecar"};
        String[] actual = Palendrome.palandrome(input);

        Assertions.assertArrayEquals(expected,actual);
    }

}
