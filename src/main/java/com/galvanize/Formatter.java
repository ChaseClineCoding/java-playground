package com.galvanize;

import java.util.*;

public class Formatter {

    private String[] lines;
    private Deque<String> tags = new LinkedList<>();

    public Formatter(String[] lines) {
        this.lines = lines;
    }

    public String[] format() {
        for (int i = 0; i < lines.length; i++) {
            if (!tags.isEmpty() && lines[i].contains("/" + tags.peekFirst())) {
                lines[i] = addTabs(tags.size()-1) + lines[i];
                tags.pop();
            } else {
                tags.push(retrieveTag(lines[i]));
                lines[i] = addTabs(tags.size()-1) + lines[i];
            }
        }
        return lines;
    }

    public String[] getLines() {
        return lines;
    }

    private static String retrieveTag(String string) {
        return String.join("", string.split("\\W"));
    }

    private static String addTabs(int nTabs) {
        String tabs = "";
        for (int i = 0; i < nTabs; i++) {
            tabs = tabs.concat("\t");
        }
        return tabs;
    }

}
