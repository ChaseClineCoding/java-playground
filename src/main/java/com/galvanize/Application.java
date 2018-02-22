package com.galvanize;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new SortArray().sortArray(new String[]{"Rob", "Cliff", "Bart"});
        System.out.println(arrayList);

    }
}
