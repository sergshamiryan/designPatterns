package org.example.behavioural.command.problem2;

public class Windows implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening: Windows");
    }

    @Override
    public void saveFile() {
        System.out.println("Saving: Windows");
    }
}
