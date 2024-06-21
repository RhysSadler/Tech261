package com.sparta.rs;

import java.util.Arrays;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        String test = "Racecar, i love my Racecar, it make me feel cool!, madam!";
        String preProcessing = Sentence.fixer(test);
        String[] postPrecessing = Sentence.splitter(preProcessing);
        String[] pals = Palendrome.palandrome(postPrecessing);
        String theBigOne = BiggerFinder.big(pals);
        System.out.println(theBigOne);


    }

}
