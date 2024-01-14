package org.example.behavioural.command;

import org.example.behavioural.command.problem1.FIleSystemReceiverUtil;
import org.example.behavioural.command.problem1.OpenTextFileOperation;
import org.example.behavioural.command.problem1.TextFIleOperationInvoker;
import org.example.behavioural.command.problem1.TextFile;
import org.example.behavioural.command.problem2.FIleInvoker;
import org.example.behavioural.command.problem2.FileSystemReceiver;
import org.example.behavioural.command.problem2.OpenFileCommand;

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

    public static void main(String[] args) {
        command2();
    }
}
