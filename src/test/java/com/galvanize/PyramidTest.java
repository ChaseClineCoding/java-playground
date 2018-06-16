package com.galvanize;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PyramidTest {

    @Test
    public void printPyramidTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Pyramid.printPyramid(5);
        Assert.assertEquals("    * \n" +
                                     "   * * \n" +
                                     "  * * * \n" +
                                     " * * * * \n" +
                                     "* * * * * \n", outContent.toString());
    }
}
