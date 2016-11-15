package com.arjun.regular.expression.exampls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
     // \\s use to allow any white space character.
        final String PHONE_PATTERN = "^(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*$";
        pattern = Pattern.compile(PHONE_PATTERN);
        System.out.println(validate("(+44)(0)20-12341234"));
    }
    public static boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }
}
