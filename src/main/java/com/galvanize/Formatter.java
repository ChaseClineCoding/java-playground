package com.galvanize;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formatter {
    String[] lines;
    HashMap<String, Integer> tabMap = new HashMap<>();

    public Formatter(String[] lines) {
        this.lines = lines;
    }

    private String[] format(String[] lines) {
        Integer numberOfTabs = 0;
        String[] formattedLines = lines;
        for (int i = 0; i < lines.length; i++) {
            tabMap.putIfAbsent(retrieveTag(lines[i]), numberOfTabs);

        }
        return formattedLines;
    }

    private String retrieveTag(String string) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(string);
        return matcher.group();
    }

    private String addTabs() {
        return "\\t";
    }

}
