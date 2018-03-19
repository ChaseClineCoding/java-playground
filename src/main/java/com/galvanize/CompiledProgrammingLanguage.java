package com.galvanize;

public class CompiledProgrammingLanguage {

    private String name;
    private String compilerCommand;

    public void setName(String name) {
        this.name = name;
    }

    public void setCompilerCommand(String compilerCommand) {
        this.compilerCommand = compilerCommand;
    }

    public String getCompilerCommand() {
        return compilerCommand;
    }

    @Override
    public String toString() {
        return String.format("%s (compiled with %s)", name, compilerCommand);
    }
}
