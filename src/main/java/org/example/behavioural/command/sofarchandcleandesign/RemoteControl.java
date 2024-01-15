package org.example.behavioural.command.sofarchandcleandesign;

/*Invoker*/
public class RemoteControl {
    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
