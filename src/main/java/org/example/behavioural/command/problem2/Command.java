package org.example.behavioural.command.problem2;

public interface Command {
    void execute();

    void changeExecutor(FileSystemReceiver fileSystemReceiver);
}
