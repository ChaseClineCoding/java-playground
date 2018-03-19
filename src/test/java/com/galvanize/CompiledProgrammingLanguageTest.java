package com.galvanize;

import org.junit.Assert;
import org.junit.Test;

public class CompiledProgrammingLanguageTest {

    @Test
    public void subclassTest() {
        CompiledProgrammingLanguage java = new CompiledProgrammingLanguage();
        java.setName("Java");
        java.setCompilerCommand("javac");
        Assert.assertEquals("javac", java.getCompilerCommand());
        Assert.assertEquals("Java (compiled with javac)", java.toString());
    }

}
