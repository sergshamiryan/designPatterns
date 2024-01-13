package org.example.structural.proxy;

import org.example.structural.proxy.problem1.Image;
import org.example.structural.proxy.problem1.RealImage;
import org.example.structural.proxy.problem2.GrantInternetAccess;
import org.example.structural.proxy.problem2.ProxyInternetAccess;
import org.example.structural.proxy.problem3.Operation;
import org.example.structural.proxy.problem3.ProxyOperation;

public class Client {

    public static void main(String[] args) {
        proxy3();
    }

    public static void proxy1() {
        Image image = new RealImage("hugeFile1");
        image.display();
        image.display();
    }

    public static void proxy2() {
        GrantInternetAccess access = new ProxyInternetAccess(1);
        access.grantInternetAccess();

    }

    public static void proxy3() {
        Operation operation = new ProxyOperation("lowerCaseWord");
        operation.executeUpperCasing();
    }
}
