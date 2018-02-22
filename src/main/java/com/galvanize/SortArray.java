package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {

    public ArrayList<String> sortArray(String[] inputArray) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(inputArray));
        strings.sort(null);
        return strings;
    }

}
