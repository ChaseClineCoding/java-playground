package com.galvanize;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<String> fileNames = Arrays.asList("My Report.csv", "The Best Deck.pdf", "Thanks for all the fishes.doc");
        fileNames.forEach(file -> System.out.println(file.replaceAll(" ", "-")));

    }
}
