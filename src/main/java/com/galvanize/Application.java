package com.galvanize;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+\\s\\w+");
        Matcher matcher = pattern.matcher("hello world");
        boolean matches = matcher.matches();

        System.out.println(matches);

        Pattern pattern1 = Pattern.compile("\\W");
        String string = String.join("", pattern1.split("a,b,c,d.d.c.b.a"));

        System.out.println(string);
    }
}
