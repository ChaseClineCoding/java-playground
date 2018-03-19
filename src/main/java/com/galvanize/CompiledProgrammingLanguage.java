package com.galvanize;

public class CompiledProgrammingLanguage extends ProgrammingLanguage {

    private String compilerCommand;

    public void setCompilerCommand(String compilerCommand) {
        this.compilerCommand = compilerCommand;
    }

    public String getCompilerCommand() {
        return compilerCommand;
    }

    @Override
    public String toString() {
        return String.format("%s (compiled with %s)", this.getName(), compilerCommand);
    }
}
