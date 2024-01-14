package org.example.behavioural.command.problem2;

public class SaveFileCommand implements Command{
   private FileSystemReceiver fileSystemReceiver;

    public SaveFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.saveFile();
    }

    @Override
    public void changeExecutor(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }
}
