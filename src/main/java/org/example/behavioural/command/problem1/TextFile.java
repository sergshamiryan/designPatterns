package org.example.behavioural.command.problem1;

//Receiver Class
public class TextFile {
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    public String open(){
        return "Opening file " + fileName;
    }

    public String save(){
        return "Saving file " + fileName;
    }
}
