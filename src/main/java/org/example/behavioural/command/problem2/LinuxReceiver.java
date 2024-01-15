package org.example.behavioural.command.problem2;

public class LinuxReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening: Linux");
    }

    @Override
    public void saveFile() {
        System.out.println("Saving: Linux");
    }
}
