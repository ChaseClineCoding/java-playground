package com.galvanize;

import org.junit.Test;

import static com.galvanize.BackWardsPrime.*;
import static org.junit.Assert.assertEquals;

public class BackWardsPrimeTest {

    @Test
    public void isPrimeTest() {
        assertEquals(false, isPrime(0));
        assertEquals(false, isPrime(1));
        assertEquals(true, isPrime(2));
        assertEquals(true, isPrime(3));
        assertEquals(false, isPrime(4));
        assertEquals(true, isPrime(5));
        assertEquals(false, isPrime(6));
        assertEquals(true, isPrime(7));
        assertEquals(false, isPrime(8));
        assertEquals(false, isPrime(9));
        assertEquals(false, isPrime(10));
        assertEquals(true, isPrime(991));
    }

    @Test
    public void backwardsPrimeTest(){
        assertEquals("13 17 31 37 71 73 79 97", backwardsPrime(2, 100));
        assertEquals("9923 9931 9941 9967", backwardsPrime(9900, 10000));
    }
}
