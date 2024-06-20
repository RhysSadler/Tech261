package com.sparta.rs;

import java.util.ArrayList;
import java.util.List;

public class Palendrome {
    public static String[] palandrome(String[] string) {
        List<String> palindromList = new ArrayList<>();
        for (int i = 0 ; i < string.length; i++) {
            String newString = string[i];
            if (newString == null || newString.length() < 3) {
                continue;
            }

            String lower = newString.toLowerCase();
            char[] charArray = lower.toCharArray();
            int left = 0;
            int right = charArray.length -1;

            boolean isPalindrome = true;
            while (left < right) {
                if (charArray[left] != charArray[right]) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            if(isPalindrome) {
                palindromList.add(newString);
            }
        }
        String[] finalArray = new String[palindromList.size()];
        return palindromList.toArray(finalArray);

    }
}
