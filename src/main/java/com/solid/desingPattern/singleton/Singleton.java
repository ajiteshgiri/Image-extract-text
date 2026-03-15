package com.solid.desingPattern.singleton;

/**
 * 1. constructor private
 * 2. Object create with the help of method
 *
 * 3. create field to store object is private
 * */
public class Singleton {

    private static Singleton singleton;
    private Singleton (){}

    // Lazy way of creating object
    public static Singleton getSingleton(){
        //object of this class
        if(singleton ==null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }

}
