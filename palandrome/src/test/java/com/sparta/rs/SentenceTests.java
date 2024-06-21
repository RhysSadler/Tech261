package com.sparta.rs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SentenceTests {

    @ParameterizedTest
    @CsvSource({"123abc, abc",
            "Hello!, Hello",
            "nice work, nice work"})
    void IfThereAreNonCharEntetitesThenRemoveThem(String input, String expected) {
        String real = Sentence.fixer(input);

        Assertions.assertEquals(expected, real);
    }
    @Test
    void IfThereAreMoreThenOneWordThenSplitOnThatSentence() {
        String[] expected = new String[]{"Hello", "how", "are", "you"};
        String input = "Hello how are you";
        String[] actual = Sentence.splitter(input);

        Assertions.assertArrayEquals(expected, actual);
    }
}


