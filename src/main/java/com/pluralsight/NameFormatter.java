package com.pluralsight;

import java.util.regex.Pattern;

public class NameFormatter {

    private NameFormatter() {

    }

    public static String format(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        return prefix + " " + firstName + " " + middleName + " " + lastName + " " + suffix;
    }

    public static String format(String fullName){
        String[] tokens = fullName.split(Pattern.quote("|"));

        String prefixFirstName = tokens[0];
        String middleNameLastName = tokens[1];
        String suffix = tokens[2];

        return prefixFirstName + " " + middleNameLastName + " " + suffix;
    }
}
