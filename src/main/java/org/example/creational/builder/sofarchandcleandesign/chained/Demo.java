package org.example.creational.builder.sofarchandcleandesign.chained;

public class Demo {

    public static void main(String[] args) {
        Account account = Account.newBuilder().userId("101").token("Token").build();
        System.out.println(account);
    }
}
