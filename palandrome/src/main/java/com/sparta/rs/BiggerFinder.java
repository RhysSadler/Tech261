package com.sparta.rs;

import java.util.ArrayList;
import java.util.List;

public class BiggerFinder {
    public static String big(String[] input) {
        List<String> listOfBigPals = new ArrayList<>();
        if (input == null || input.length == 0) {
            return "There is no palindrome here";
        }
        for (int i =0; i < input.length; i++) {
            if (listOfBigPals.contains(input[i])) {
                continue;
            }
            if (listOfBigPals.isEmpty()) {
                listOfBigPals.add(input[i]);
            }
            else if (!listOfBigPals.isEmpty() && input[i].length() == listOfBigPals.getFirst().length()) {
                listOfBigPals.add(input[i]);

            } else if (input[i].length() > listOfBigPals.getFirst().length()) {
                listOfBigPals.clear();
                listOfBigPals.add(input[i]);
            }



        }
        if (listOfBigPals.isEmpty()){
            return "There is no palindrome here";
        }

        StringBuilder result = new StringBuilder();
        for (String s : listOfBigPals) {
            result.append(s).append(" ");
        }
        if (result.length() > 0){
            result.setLength(result.length() - 1);

         }

        return result.toString();

    }
}

