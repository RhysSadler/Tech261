package com.sparta.rs;

public class Palendrome {
    public static boolean palandrome(String string) {
        if (string == null || string.length() < 3) {
            return false;
        }

        String lower = string.toLowerCase();
        char[] charArray = lower.toCharArray();
        int left;
        int right = charArray.length -1;

        for (left = 0; left <= right; left++, right--) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
        }


        return true;
    }
}
