package com.sparta.rs;

public class FizzBuzz {
    public static String getFizBuzzNumberFrom(int number) {
            String fizzBussString = Integer.toString(number);
            if (number % 5 == 0 && number % 3 == 0) {
                fizzBussString = "FizzBuzz";
            } else if (number % 3 == 0) {
                fizzBussString = "Fizz";
            } else if (number % 5 == 0) {
                fizzBussString = "Buzz";
            }

            return fizzBussString;
    }
}
