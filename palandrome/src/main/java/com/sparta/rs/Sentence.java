package com.sparta.rs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    public static String fixer(String main) {
        String regex = "[a-zA-Z ]";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(main);

        StringBuilder result = new StringBuilder();

        while(matcher.find()) {
            result.append(matcher.group());
        }

        return result.toString();
    }

    public static String[] splitter(String input) {

        return input.split(" ");
    }

}
