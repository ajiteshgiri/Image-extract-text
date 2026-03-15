package com.solid.desingPattern.factory;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting Android developer salary...");
        return 5000;
    }
}
