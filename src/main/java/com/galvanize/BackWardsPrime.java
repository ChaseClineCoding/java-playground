package com.galvanize;

import java.util.ArrayList;
import java.util.Collections;

public class BackWardsPrime {

    public static String backwardsPrime(long start, long end) {
        ArrayList<Long> primes = new ArrayList<>();
        long currentNum = 13;
        long reverseNum;
        if (start > 13) currentNum = start;
        if (currentNum % 2 == 0) currentNum++;
        while (currentNum <= end) {
            reverseNum = Long.valueOf(new StringBuilder(Long.toString(currentNum)).reverse().toString());
            if (isPrime(currentNum) && isPrime(reverseNum) && currentNum != reverseNum) {
                if (!primes.contains(currentNum)) primes.add(currentNum);
                if (!primes.contains(reverseNum) && start <= reverseNum && reverseNum <= end) primes.add(reverseNum);
            }
            currentNum += 2;
        }
        Collections.sort(primes);
        return String.join("", String.format("%s", primes).split(",")).replaceAll("[\\[\\]]", "");
    }

    public static boolean isPrime(long num) {
        if (num == 2) return true;
        else if (num < 2 || num % 2 == 0) return false;
        else {
            for (int i = 3; i <= num/2; i += 2) {
                if (num % i == 0) return false;
            }
        }
        return true;
    }
}
