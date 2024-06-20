package com.sparta.rs.coding_Kata;

public class codingKata {
    public static boolean slidingWindow(int[] array) {
        if (array == null || array.length < 3) {
            return false;
        }
        for (int i = 0; i <= array.length -3 ; i++) {
            if ((array[i] == array[i+1]) && (array[i] == array[i+2])) {
                return true;
            }
        }
        return false;
    }

}
