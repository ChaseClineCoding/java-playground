package com.galvanize;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleDoubleTests {

    @Test
    public void containsTripleTest() {
        assertEquals(6, TripleDouble.containsTriple(666));
        assertEquals(6, TripleDouble.containsTriple(126660));
        assertEquals(0, TripleDouble.containsTriple(126000));
        assertEquals(-1, TripleDouble.containsTriple(12600));
        assertEquals(-1, TripleDouble.containsTriple(55));
    }

    @Test
    public void containsDoubleTest() {
        assertEquals(false, TripleDouble.containsDouble(12345, 5));
        assertEquals(false, TripleDouble.containsDouble(123455, 6));
        assertEquals(true, TripleDouble.containsDouble(123455, 5));
        assertEquals(false, TripleDouble.containsDouble(5, 5));
    }

    @Test
    public void tripleDoubleMethod(){
        assertEquals(1, TripleDouble.tripleDouble(451999277L, 41177722899L));
        assertEquals(0, TripleDouble.tripleDouble(1222345L, 12345L));
        assertEquals(0, TripleDouble.tripleDouble(12345L, 12345L));
        assertEquals(1, TripleDouble.tripleDouble(666789L, 12345667L));
        assertEquals(0, TripleDouble.tripleDouble(451999277, 411777228L));
    }

}
