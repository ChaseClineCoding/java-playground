package com.galvanize;

public class TripleDouble {
    public static int tripleDouble(long num1, long num2) {
        int digit = containsTriple(num1);
        if (digit == -1 || !containsDouble(num2, digit)) return 0;
        else return 1;
    }

    public static boolean containsDouble(long num, int digit) {
        String numString = "" + num;
        if (numString.contains("" + digit + digit)) return true;
        return false;
    }

    public static int containsTriple(long num) {
        int temp = -1;
        String numString = "" + num;
        if (numString.length() >= 3) {
            for (int i = 0; i < numString.length() - 2; i++) {
                if (numString.charAt(i) == numString.charAt(i+1) && numString.charAt(i) == numString.charAt(i+2)) {
                    temp = numString.charAt(i) - 48;
                    break;
                }
            }
        }
        return temp;
    }
}
