package com.arjun.regular.expression.exampls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneralTextWithWhiteSpaceChar {
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {

// \\s use to allow any white space character.
        final String TEXT_PATTERN = "This\\s+is\\s+text";


        pattern = Pattern.compile(TEXT_PATTERN);
        System.out.println(validate("This      "
                + ""
                + "is       text"));
    }

    public static boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }

}
