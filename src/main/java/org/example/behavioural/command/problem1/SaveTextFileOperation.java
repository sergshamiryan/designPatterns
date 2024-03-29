package org.example.behavioural.command.problem1;

//Concrete Command
public class SaveTextFileOperation implements TextFileOperation{
    private TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
