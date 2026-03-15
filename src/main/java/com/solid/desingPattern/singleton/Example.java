package com.solid.desingPattern.singleton;

public class Example {

    public static void main(String[] args) {
        System.out.println("Lazy loading singleton constructor");
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton.hashCode());
        Singleton sg = Singleton.getSingleton();
        System.out.println(sg.hashCode());

        System.out.println("Eager loading singleton constructor");
        System.out.println(ExSingleton2.getEsg().hashCode());
        System.out.println(ExSingleton2.getEsg().hashCode());

    }
}
