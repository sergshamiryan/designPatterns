package org.example.behavioural.command;

import org.example.behavioural.command.problem1.FIleSystemReceiverUtil;
import org.example.behavioural.command.problem1.OpenTextFileOperation;
import org.example.behavioural.command.problem1.TextFIleOperationInvoker;
import org.example.behavioural.command.problem1.TextFile;
import org.example.behavioural.command.problem2.FIleInvoker;
import org.example.behavioural.command.problem2.FileSystemReceiver;
import org.example.behavioural.command.problem2.OpenFileCommand;
import org.example.behavioural.command.sofarchandcleandesign.*;

public class Client {

    public static void command1() {
        TextFIleOperationInvoker opsInvoker = new TextFIleOperationInvoker();
        TextFile textFile = new TextFile("Friend");
        System.out.println(
                opsInvoker.executeOperation(new OpenTextFileOperation(textFile)));
    }

    public static void command2() {
        //2 receiver
        FileSystemReceiver fs = FIleSystemReceiverUtil.getUnderlyingSystem();
        //1 command open
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        //3 Invoker
        FIleInvoker fIleInvoker = new FIleInvoker(openFileCommand);
        fIleInvoker.execute();
    }

    public static void command3() {
        //2 receiver
        Light light = new Light();
        //1 command
        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);
        //3 Invoker
        RemoteControl remoteControl = new RemoteControl(turnOnCommand);
        remoteControl.execute();
    }

    public static void main(String[] args) {
        command3();
    }
}
