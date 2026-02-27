package com.solid.service;

public class Human implements Eatable,workable{
    @Override
    public void eat() {
        System.out.println("Human eating...");
    }

    @Override
    public void work() {
        System.out.println("Human working...");
    }
}
