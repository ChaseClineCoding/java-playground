package com.galvanize;

public class Accumulator {

    public String toSentence(String[] input) {
        String result = "";

        if (input.length == 0 || input[0] == "") {
            return result;
        }

        result += input[0];

        for (int i = 1; i < input.length; i++) {
            if (i == input.length - 1) {
                result += " and " + input[i];
            } else {
                result += ", " + input[i];
            }
        }

        return result;
    }

}
