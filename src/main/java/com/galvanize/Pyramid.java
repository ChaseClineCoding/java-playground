package com.galvanize;

public class Pyramid {
    public static void printPyramid(int n) {
        int spaces = n - 1;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int j = 0; j <= i; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
