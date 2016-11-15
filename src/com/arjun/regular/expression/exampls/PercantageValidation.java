package com.arjun.regular.expression.exampls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PercantageValidation {
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
        final String TEST_PATTERN = "this\\s+is\\s+text";
        

        pattern = Pattern.compile(TEST_PATTERN);

        System.out.println(validate("this       is           text"));
    }

    public static boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }

}
