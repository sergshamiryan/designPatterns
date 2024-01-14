package org.example.behavioural.command.problem1;

public class OpenTextFileOperation implements TextFileOperation {
    private TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }


    @Override
    public String execute() {
        return textFile.open();
    }
}
