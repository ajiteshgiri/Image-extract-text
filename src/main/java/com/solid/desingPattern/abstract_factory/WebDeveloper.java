package com.solid.desingPattern.abstract_factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("i am a web developer...");
        return "WEB DEVELOPER";
    }
}
