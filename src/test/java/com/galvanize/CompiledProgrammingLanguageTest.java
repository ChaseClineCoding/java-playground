package com.galvanize;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompiledProgrammingLanguageTest {

    @Test
    public void subclassTest() {
        CompiledProgrammingLanguage java = new CompiledProgrammingLanguage();
        java.setName("Java");
        java.setCompilerCommand("javac");
        assertEquals("javac", java.getCompilerCommand());
        assertEquals("Java (compiled with javac)", java.toString());
    }

}
