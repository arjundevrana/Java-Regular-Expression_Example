package com.arjun.regular.expression.exampls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    private static Pattern pattern;
    private static Matcher matcher;
    public static void main(String[] args) {
        

        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

      
                pattern = Pattern.compile(EMAIL_PATTERN);
      System.out.println(validate("arjundevrana91@gmail.com"));

    }
    public static boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

}

}
