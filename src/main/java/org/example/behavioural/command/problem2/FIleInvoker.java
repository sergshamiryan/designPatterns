package org.example.behavioural.command.problem2;

public class FIleInvoker {
    private Command command;

    public FIleInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
