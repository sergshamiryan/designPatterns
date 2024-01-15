package org.example.behavioural.command.problem1;

import org.example.behavioural.command.problem2.FileSystemReceiver;
import org.example.behavioural.command.problem2.LinuxReceiver;
import org.example.behavioural.command.problem2.WindowsReceiver;

public class FIleSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingSystem() {
        String oSName = System.getProperty("os.name");
        System.out.println("Current Os Name: " + oSName);
        if (oSName.contains("Windows")) {
            return new WindowsReceiver();
        } else {
            return new LinuxReceiver();
        }
    }
}
